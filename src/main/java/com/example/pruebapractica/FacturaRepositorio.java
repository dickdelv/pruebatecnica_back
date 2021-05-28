
package com.example.pruebapractica;

import java.util.List;
import org.springframework.data.repository.Repository;



public interface FacturaRepositorio extends Repository<Factura, Integer>{
    List<Factura>findAll();
    Factura findById(int num_factura);
    Factura save(Factura f);
    void delete(Factura f);
}
