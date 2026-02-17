package br.com.fiap.Gs.controller;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.model.Consumo;
import br.com.fiap.Gs.repository.ConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult;
import jakarta.validation.Valid;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/consumo")
public class ConsumoController {

    @Autowired
    private ConsumoRepository consumoRepository;  // Aqui você injeta o repositório

    @PostMapping("/salvarConsumo")
    public String salvarConsumo(
            @Valid @ModelAttribute Consumo consumo,
            BindingResult result,
            RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            return "consumo";  // Retorna para o formulário em caso de erro
        }

        consumoRepository.save(consumo);  // Salva o consumo no banco de dados

        redirectAttributes.addFlashAttribute("mensagem", "Consumo salvo com sucesso!");  // Mensagem de sucesso

        return "redirect:/consumo";  // Redireciona para a página de consumo
    }
}
