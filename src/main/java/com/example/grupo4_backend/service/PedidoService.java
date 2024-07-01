package com.example.grupo4_backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grupo4_backend.model.Pedido;
import com.example.grupo4_backend.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Optional<Pedido> findById(Long id){
        return pedidoRepository.findById(id);
    }
}
