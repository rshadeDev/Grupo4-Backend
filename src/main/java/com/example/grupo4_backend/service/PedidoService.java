package com.example.grupo4_backend.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.grupo4_backend.model.Pedido;
import com.example.grupo4_backend.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    public Pedido createPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
    public Pedido updatePedido(Long id, Pedido pedidoDetails){
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Ningun pedido coincide con la id proporcionada"));
        pedido.setDestinatario(pedidoDetails.getDestinatario());
        pedido.setDestino(pedidoDetails.getDestino());
        pedido.setFechaSalida(pedidoDetails.getFechaSalida());
        pedido.setOrigen(pedidoDetails.getOrigen());
        pedido.setUltimaSucursal(pedidoDetails.getUltimaSucursal());
        return pedidoRepository.save(pedido);
    }
    public Optional<Pedido> findById(Long id){
        return pedidoRepository.findById(id);
    }
    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
