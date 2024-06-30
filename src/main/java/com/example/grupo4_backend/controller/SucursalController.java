package com.example.grupo4_backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.grupo4_backend.model.Sucursal;
import com.example.grupo4_backend.service.SucursalService;

@RestController
@RequestMapping("/sucursales")
@CrossOrigin(origins = "http://localhost:5173") // Para permitir peticiones desde el frontend
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping
    public List<Sucursal> getAllSucursales() {
        return sucursalService.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Sucursal> getSucursalesById(@PathVariable Long id) {
        return sucursalService.findById(id);
    }

    @PostMapping
    public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.save(sucursal);
    }
    
    @DeleteMapping("/{id}")
    public void deleteSucursal(@PathVariable Long id) {
        sucursalService.deleteById(id);
    }

    @GetMapping("/search")
    public List<Sucursal> getSucursalByCiudad(@RequestParam String ciudad) {
        return sucursalService.findByCiudad(ciudad);
    }
}
