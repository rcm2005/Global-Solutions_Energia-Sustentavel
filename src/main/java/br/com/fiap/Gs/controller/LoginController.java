package br.com.fiap.Gs.controller;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    // Mapeamento para exibir a página de login
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Retorna o template "login.html"
    }

    // Mapeamento para processar o login
    @PostMapping("/login")
    public String login() {
        // A lógica de autenticação deve ser integrada aqui
        // Em caso de sucesso, o Spring Security redireciona para a página inicial
        return "redirect:/home"; // Redireciona para "/home"
    }
}
