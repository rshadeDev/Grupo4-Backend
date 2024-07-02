package com.example.grupo4_backend.service;

import com.example.grupo4_backend.model.Usuario;
import com.example.grupo4_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario findByRut(String rut) {
        return usuarioRepository.findByRut(rut);
    }
    
}
