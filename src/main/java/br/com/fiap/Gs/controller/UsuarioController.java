package br.com.fiap.Gs.controller;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.UsuarioDTO;
import br.com.fiap.Gs.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Página inicial: Lista todos os usuários
    @GetMapping
    public String findAll(Model model) {
        List<UsuarioDTO> usuarios = usuarioService.findAll();
        model.addAttribute("usuarios", usuarios); // Adiciona a lista ao modelo
        return "index"; // Retorna o template "index.html"
    }

    // Página de cadastro de novo usuário
    @GetMapping("/cadastrar")
    public String showCreateForm(Model model) {
        model.addAttribute("usuario", new UsuarioDTO()); // Cria um novo objeto para o formulário
        return "cadastro"; // Retorna o template "cadastro.html"
    }

    // Salvar novo usuário
    @PostMapping("/salvar")
    public String create(@ModelAttribute UsuarioDTO usuarioDTO) {
        usuarioService.save(usuarioDTO);
        return "redirect:/usuarios"; // Redireciona para a página de listagem
    }

    // Página de edição de um usuário existente
    @GetMapping("/editar/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Optional<UsuarioDTO> usuario = usuarioService.findById(id);
        if (usuario.isPresent()) {
            model.addAttribute("usuario", usuario.get());
            return "cadastro"; // Reutiliza o template de cadastro para edição
        }
        return "redirect:/usuarios"; // Redireciona para a listagem caso o usuário não exista
    }

    // Deletar um usuário
    @GetMapping("/deletar/{id}")
    public String delete(@PathVariable Integer id) {
        usuarioService.delete(id);
        return "redirect:/usuarios"; // Redireciona para a página de listagem
    }
}
