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
import pojo.Usuario;

/**
 *
 * @author Enrique
 */
public class UsuarioDAO {
    Session session; 
    
    public UsuarioDAO(){
        session=HibernateUtil.getLocalSession();
    }
    
    public Usuario getUsuarioByData(String nombre, String telefono, String correo){
        return (Usuario)session.createCriteria(Usuario.class)
                .add(Restrictions.eq("nombre", nombre))
                .add(Restrictions.eq("telefono", telefono))
                .add(Restrictions.eq("correo", correo)).uniqueResult();
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
