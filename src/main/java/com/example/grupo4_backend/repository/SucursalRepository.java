package com.example.grupo4_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.grupo4_backend.model.Sucursal;
import java.util.List;


@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Long> {

    List<Sucursal> findByCiudad(String ciudad);
}