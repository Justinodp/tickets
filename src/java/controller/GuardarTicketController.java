/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductoFallaDAO;
import dao.TicketDAO;
import dao.UsuarioDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.Usuario;

/**
 * 
 * @author Enrique
 */
@RestController
public class GuardarTicketController {
    @RequestMapping(value = "/guardarTicket", method = RequestMethod.POST,headers="Accept=application/json")
    public String guardar(@RequestParam(value="nombre") String nombre
            , @RequestParam(value="telefono") String telefono
            , @RequestParam(value="correo") String correo
            , @RequestParam(value="producto") String producto
            , @RequestParam(value="falla") String falla
            , @RequestParam(value="descripcion") String descripcion){
        
        TicketDAO tDao = new TicketDAO();
        UsuarioDAO uDao = new UsuarioDAO();
        ProductoFallaDAO pfDao = new ProductoFallaDAO();
        Usuario usuario = uDao.getUsuarioByData(nombre, telefono, correo);
        if(usuario == null){
            uDao.save(nombre, telefono, correo);
        }
        else{
            tDao.save(usuario, descripcion
                    , pfDao.getProductoFallaByData(Integer.parseInt(producto), Integer.parseInt(falla)).getIdProducto_Falla()
                    , 0);
        }
        
        return ""; //pagina a la que va a redirigiar despues de terminar
    }
}
