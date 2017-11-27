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
@Table(name="Falla", catalog="tickets")
public class Falla {
    @Id @GeneratedValue
    @Column(name="idFalla")
    private int idFalla;
    
    @Column(name="nombre")
    private String nombre;

    public Falla(String nombre) {
        this.nombre = nombre;
    }    
    
    public Falla(){
        
    }

    /**
     * @return the idFalla
     */
    public int getIdFalla() {
        return idFalla;
    }

    /**
     * @param idFalla the idFalla to set
     */
    public void setIdFalla(int idFalla) {
        this.idFalla = idFalla;
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
