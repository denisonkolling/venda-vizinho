package com.vendavizinho.service;

import com.vendavizinho.dto.UsuarioDto;
import com.vendavizinho.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario salvarUsuario(Usuario usuario);

    List<UsuarioDto> listarUsuarios();

    Usuario lerUsuario(Long id);

}
