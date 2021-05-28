package com.example.pruebapractica;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="factura")
public class Factura {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    @Column
    private int num_factura ;
    
    @Column 
    private int id_cliente;
    
    @Column 
    private Date fecha;

    public int getId() {
        return num_factura ;
    }

    public void setId(int num_factura ) {
        this.num_factura  = num_factura ;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    }