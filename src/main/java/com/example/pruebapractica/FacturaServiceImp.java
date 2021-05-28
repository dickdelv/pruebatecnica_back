
package com.example.pruebapractica;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class FacturaServiceImp implements FacturaService {

    @Autowired
    private FacturaRepositorio repositorio;
    
    @Override
    public List<Factura> listar() {
       return repositorio.findAll();
    }

    @Override
    public Factura listarId(int num_factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura add(Factura f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura editar(Factura f) {
       return repositorio.save(f);
    }

    @Override
    public Factura eliminar(int num_factura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
