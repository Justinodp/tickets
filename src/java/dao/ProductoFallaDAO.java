/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojo.Producto;
import pojo.ProductoFalla;
import pojo.Usuario;
import pojo.Falla;

/**
 *
 * @author Enrique
 */
public class ProductoFallaDAO {
    Session session; 
    
    public ProductoFallaDAO(){
        session=HibernateUtil.getLocalSession();
    }
    
    public ProductoFalla getProductoFallaByData(int idProducto, int idFalla){
        return (ProductoFalla)session.createCriteria(ProductoFalla.class)
                .add(Restrictions.eq("idProducto", (Producto)session.load(Producto.class, idProducto)))
                .add(Restrictions.eq("idFalla", (Falla)session.load(Falla.class, idFalla))).uniqueResult();
    }
    
    public boolean save(String nombre, String telefono, String correo){
        Usuario u = new Usuario(nombre, telefono, correo);
        
        try{
            Transaction transaccion=session.beginTransaction();
            session.save(u);
            transaccion.commit();
            return true;
        }catch(Exception e){
            
        }finally{
            HibernateUtil.closeLocalSession();
        }
        return false;
    }
}
