/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name="Producto", catalog="tickets")
public class Producto {
    @Id @GeneratedValue
    @Column(name="idProducto")
    private int idProducto;
    
    @Column(name="nombre")
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }        
    
    public Producto(){
        
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
