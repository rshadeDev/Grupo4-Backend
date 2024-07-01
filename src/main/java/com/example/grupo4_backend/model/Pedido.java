package com.example.grupo4_backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String destinatario;
    
    @ManyToOne
    @JoinColumn(name = "origen_id")
    private Ubicacion origen;
    
    @ManyToOne
    @JoinColumn(name = "destino_id")
    private Ubicacion destino;
    
    private LocalDateTime fechaSalida;
    
    @ManyToOne
    @JoinColumn(name = "ultima_sucursal_id", nullable = true)
    private Sucursal ultimaSucursal;
}
