
package com.example.pruebapractica;

import java.util.List;


public interface FacturaService {
    
    public List<Factura>listar();
    
    Factura listarId(int num_factura);
    Factura add(Factura f);
    Factura editar(Factura f);
    Factura eliminar(int num_factura);
}
