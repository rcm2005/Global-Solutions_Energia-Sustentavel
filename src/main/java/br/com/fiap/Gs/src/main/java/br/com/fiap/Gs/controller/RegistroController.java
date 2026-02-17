package br.com.fiap.Gs.controller;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.model.Usuario;
import br.com.fiap.Gs.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Controller
public class RegistroController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository usuarioRepository; // Usar o Repository para persistir

    // Exibe a página de registro do usuário
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // Retorna a view de registro (templates/register.html)
    }

    // Processa o formulário de registro
    @PostMapping("/register")
    public String registerUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model
    ) {
        // Validação da senha
        if (password.length() < 6 || password.length() > 25) {
            model.addAttribute("errorMessage", "A senha deve ter entre 6 e 25 caracteres.");
            return "register"; // Retorna para a página de registro com erro
        }

        // Criptografa a senha
        String encodedPassword = passwordEncoder.encode(password);

        // Cria o usuário e salva no banco usando o repository
        Usuario usuario = new Usuario();
        usuario.setUsuario_name(username);
        usuario.setUsuario_senha(encodedPassword);

        try {
            usuarioRepository.save(usuario); // Salva o usuário no banco
            model.addAttribute("successMessage", "Usuário registrado com sucesso!");
            return "redirect:/login"; // Redireciona para o login após sucesso
        } catch (Exception e) {
            model.addAttribute("errorMessage", "Erro ao registrar o usuário: " + e.getMessage());
            return "register"; // Retorna à página de registro em caso de erro
        }
    }
}
