
package com.example.pruebapractica;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/facturas")
@CrossOrigin(origins = "http://localhost:4200")

public class Controlador {
    
    @Autowired
    FacturaService service;
    
    @GetMapping("/list")
     public List<Factura>listar(){
         
     return service.listar();
    }
    
    @PostMapping("/ingresar")
    public Factura agregar(@RequestBody Factura f){
       return service.add(f);
    }
}
