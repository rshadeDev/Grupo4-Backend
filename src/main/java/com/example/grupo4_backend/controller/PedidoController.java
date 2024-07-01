package com.example.grupo4_backend.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grupo4_backend.model.Pedido;
import com.example.grupo4_backend.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
@Validated
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/{id}")
    public Optional<Pedido> getPedidoById(@PathVariable Long id) {
        return pedidoService.findById(id);
    }
}