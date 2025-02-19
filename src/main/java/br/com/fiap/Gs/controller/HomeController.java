package br.com.fiap.Gs.controller;

// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.ConsumoDTO;
import br.com.fiap.Gs.service.ConsumoService;  // Alterando para ConsumoService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ConsumoService consumoService;  // Usando o serviço de Consumo

    @GetMapping("/home")
    public String homePage(Model model) {
        // Busca todos os consumos
        List<ConsumoDTO> consumos = consumoService.findAll();

        // Adiciona os dados ao modelo
        model.addAttribute("message", "Bem-vindo à página inicial!");
        model.addAttribute("consumos", consumos); // Lista de consumos para a view

        return "home"; // Retorna o template home.html
    }

    // Adiciona um método para garantir o link para o formulário de consumo
    @GetMapping("/consumo")
    public String consumoForm() {
        return "consumo"; // Redireciona para o formulário de consumo
    }

}
