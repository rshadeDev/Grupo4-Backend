package com.example.grupo4_backend.repository;

import com.example.grupo4_backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    Usuario findByRut(String rut);
}
