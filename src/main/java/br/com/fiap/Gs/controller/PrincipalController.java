package br.com.fiap.Gs.controller;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {

    // Método para redirecionar o usuário para a página de login
    @GetMapping("/")
    public String redirectToLogin() {
        // Retorna o redirecionamento para o login
        return "redirect:/login";
    }
}
