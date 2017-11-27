/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
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
@Table(name="Ticket", catalog="tickets")
public class Ticket {
    @Id @GeneratedValue
    @Column(name="idTicket")
    private int idTicket;
    
    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario idUsuario;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="idProducto_falla")
    private ProductoFalla idProducto_falla;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="folio")
    private int folio;

    public Ticket(Usuario idUsuario, String descripcion, ProductoFalla idProducto_falla, Date fecha, int folio) {
        this.idUsuario = idUsuario;
        this.descripcion = descripcion;
        this.idProducto_falla = idProducto_falla;
        this.fecha = fecha;
        this.folio = folio;
    }
    
    public Ticket(){
        
    }
    /**
     * @return the idTicket
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * @param idTicket the idTicket to set
     */
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    /**
     * @return the idUsuario
     */
    public Usuario getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the idProducto_falla
     */
    public ProductoFalla getIdProducto_falla() {
        return idProducto_falla;
    }

    /**
     * @param idProducto_falla the idProducto_falla to set
     */
    public void setIdProducto_falla(ProductoFalla idProducto_falla) {
        this.idProducto_falla = idProducto_falla;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }    
}
