package io.github.pablitohaddad.PrimeirosPassosSpring.service;

import io.github.pablitohaddad.PrimeirosPassosSpring.model.entidade.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();
    private Long nextId = 1L;

    // Método para criar um novo usuário
    public Usuario criarUsuario(String nome, String email) {
        Usuario usuario = new Usuario(nextId++, nome, email);
        usuarios.add(usuario);
        return usuario;
    }

    // Método para listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

}
