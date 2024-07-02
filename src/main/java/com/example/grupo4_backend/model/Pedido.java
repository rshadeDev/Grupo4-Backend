package com.example.grupo4_backend.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String destinatario;
    
    @ManyToOne
    @JoinColumn(name = "origen_id")
    @NotNull
    private Ubicacion origen;
    
    @ManyToOne
    @JoinColumn(name = "destino_id")
    @NotNull
    private Ubicacion destino;
    
    @NotNull
    private LocalDateTime fechaSalida;
    
    @ManyToOne
    @JoinColumn(name = "ultima_sucursal_id", nullable = true)
    private Sucursal ultimaSucursal;
}
