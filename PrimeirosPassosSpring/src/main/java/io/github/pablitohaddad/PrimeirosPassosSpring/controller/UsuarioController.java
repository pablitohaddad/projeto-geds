package io.github.pablitohaddad.PrimeirosPassosSpring.controller;

import io.github.pablitohaddad.PrimeirosPassosSpring.model.entidade.Usuario;
import io.github.pablitohaddad.PrimeirosPassosSpring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioservice;

    // Criar endpoint POST criarUsuario
    @PostMapping("/criar")
    public Usuario criarUsuario(@RequestParam String nome, @RequestParam String email) {
        return usuarioservice.criarUsuario(nome, email);
    }

    @GetMapping("/listar")
    public List<Usuario> listarUsuarios() {
        return usuarioservice.listarUsuarios();
    }
}
