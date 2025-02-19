package br.com.fiap.Gs.model;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos
import jakarta.persistence.*;

@Entity(name = "usuarios_teste")
@Table(name = "usuarios_teste")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Integer id_usuario_teste;

    private String usuario_name;
    private String usuario_senha;

    // Construtor padrão
    public Usuario() {
    }

    public String getUsuario_senha() {
        return usuario_senha;
    }

    public void setUsuario_senha(String usuario_senha) {
        this.usuario_senha = usuario_senha;
    }

    public String getUsuario_name() {
        return usuario_name;
    }

    public void setUsuario_name(String usuario_name) {
        this.usuario_name = usuario_name;
    }

    public Integer getId_usuario_teste() {
        return id_usuario_teste;
    }

    public void setId_usuario_teste(Integer id_usuario_teste) {
        this.id_usuario_teste = id_usuario_teste;
    }
}
