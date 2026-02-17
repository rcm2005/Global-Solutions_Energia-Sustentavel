package br.com.fiap.Gs.config;  // Pacote de configuração
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // Indica que esta classe é uma classe de configuração
public class ModelMapperConfig {

    @Bean  // Define um bean do tipo ModelMapper que pode ser injetado em outras classes
    public ModelMapper modelMapper() {
        return new ModelMapper();  // Retorna uma instância do ModelMapper
    }
}
