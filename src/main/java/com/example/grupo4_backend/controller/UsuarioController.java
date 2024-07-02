package com.example.grupo4_backend.controller;

import com.example.grupo4_backend.model.Usuario;
import com.example.grupo4_backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registro")
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
        Usuario nuevoUsuario = usuarioService.registrarUsuario(usuario);
        return ResponseEntity.ok(nuevoUsuario);
    }

    @PostMapping("/inicio-sesion")
    public ResponseEntity<Usuario> iniciarSesion(@RequestBody Usuario usuario) {
        Usuario usuarioExistente = usuarioService.findByRut(usuario.getRut());
        if (usuarioExistente != null && usuarioExistente.getContraseña().equals(usuario.getContraseña())) {
            return ResponseEntity.ok(usuarioExistente);
        }
        return ResponseEntity.notFound().build();
    }
}
