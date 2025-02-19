package br.com.fiap.Gs.dto;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import jakarta.validation.constraints.Size;

public class UsuarioDTO {

    private Integer idUsuario;
    private String nome;
    @Size(min = 8, max = 12, message = "A senha deve ter entre 8 e 10 caracteres.")
    private String senha; // Corrigido para senha, em vez de email

    // Construtor padrão
    public UsuarioDTO() {
    }

    // Construtor com parâmetros
    public UsuarioDTO(Integer idUsuario, String nome, String senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha; // Corrigido
    }

    // Getters e Setters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() { // Corrigido
        return senha;
    }

    public void setSenha(String senha) { // Corrigido
        this.senha = senha;
    }
}

