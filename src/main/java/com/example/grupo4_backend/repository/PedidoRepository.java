package com.example.grupo4_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.grupo4_backend.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{}
