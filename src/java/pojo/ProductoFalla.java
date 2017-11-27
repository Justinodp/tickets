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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Enrique
 */
@Entity
@Table(name="Producto_Falla", catalog="tickets")
public class ProductoFalla {
    @Id @GeneratedValue
    @Column(name="idProducto_Falla")
    private int idProducto_Falla;
    
    @ManyToOne
    @JoinColumn(name="idFalla")
    private Falla idFalla;
    
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto idProducto;

    public ProductoFalla(Falla idFalla, Producto idProducto) {
        this.idFalla = idFalla;
        this.idProducto = idProducto;
    }

    public ProductoFalla() {
    }    
    
    /**
     * @return the idProducto_Falla
     */
    public int getIdProducto_Falla() {
        return idProducto_Falla;
    }

    /**
     * @param idProducto_Falla the idProducto_Falla to set
     */
    public void setIdProducto_Falla(int idProducto_Falla) {
        this.idProducto_Falla = idProducto_Falla;
    }

    /**
     * @return the idFalla
     */
    public Falla getIdFalla() {
        return idFalla;
    }

    /**
     * @param idFalla the idFalla to set
     */
    public void setIdFalla(Falla idFalla) {
        this.idFalla = idFalla;
    }

    /**
     * @return the idProducto
     */
    public Producto getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
