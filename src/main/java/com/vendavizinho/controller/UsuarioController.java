package com.vendavizinho.controller;

import com.vendavizinho.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendavizinho.model.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> salvarUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(usuarioService.salvarUsuario(usuario), HttpStatus.CREATED);
    }

}
