/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;
import pojo.ProductoFalla;
import pojo.Ticket;
import pojo.Usuario;

/**
 *
 * @author Enrique
 */
public class TicketDAO {
    Session session; 
    
    public TicketDAO(){
        session=HibernateUtil.getLocalSession();
    }
    
    public JSONArray getDataMain(){
        List<Ticket> total=(List)session.createCriteria(Ticket.class).list();
        
        JSONObject json;
        JSONArray retorno = new JSONArray();
        for(int i = 0;i < total.size();i++){
            json =new JSONObject();
            json.put("usuario", total.get(i).getIdUsuario().getNombre());
            json.put("descripcion", total.get(i).getDescripcion());
            json.put("producto", total.get(i).getIdProducto_falla().getIdProducto().getNombre());
            json.put("falla", total.get(i).getIdProducto_falla().getIdFalla().getNombre());
            json.put("folio", total.get(i).getFolio());
            retorno.put(json);
        }
        
        return  retorno;
    } 
    
    public boolean save(Usuario usuario, String descripcion, ProductoFalla idProducto_falla, int folio){
        Ticket t = new Ticket(usuario, descripcion, idProducto_falla, new Date(), folio);
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(t);
            transaccion.commit();
            return true;
        }catch(Exception e){
            
        }finally{
            HibernateUtil.closeLocalSession();
        }
        return false;
    }
    
}
