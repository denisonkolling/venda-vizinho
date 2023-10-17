package com.vendavizinho.service.impl;

import com.vendavizinho.dto.UsuarioDto;
import com.vendavizinho.model.Usuario;
import com.vendavizinho.repository.UsuarioRepository;
import com.vendavizinho.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<UsuarioDto> listarUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream().map((usuario) -> mapToUsuarioDto(usuario)).collect(Collectors.toList());
    }

    @Override
    public Usuario lerUsuario(Long id) {
        return usuarioRepository.findById(id).get();
    }

    private UsuarioDto mapToUsuarioDto(Usuario usuario){

        UsuarioDto usuarioDto = UsuarioDto.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .telefone(usuario.getTelefone())
                .ativo(usuario.getAtivo())
                .build();

        return usuarioDto;
    }

}
