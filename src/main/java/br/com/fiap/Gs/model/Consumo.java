package br.com.fiap.Gs.model;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import jakarta.persistence.*;

@Entity(name = "Consumo")
@Table(name = "consumo")
public class Consumo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consumo_seq")
    @SequenceGenerator(name = "consumo_seq", sequenceName = "consumo_seq", allocationSize = 1)
    private Integer idConsumo;

    private String nomeUsuario;
    private Float consumoKwh;
    private String dataConsumo;
    private String nomeEquipamento;
    private String nomeDistribuidora;

    // Getters e setters
    public Integer getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(Integer idConsumo) {
        this.idConsumo = idConsumo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Float getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(Float consumoKwh) {
        this.consumoKwh = consumoKwh;
    }

    public String getDataConsumo() {
        return dataConsumo;
    }

    public void setDataConsumo(String dataConsumo) {
        this.dataConsumo = dataConsumo;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getNomeDistribuidora() {  // Adicionando o getter para nomeDistribuidora
        return nomeDistribuidora;
    }

    public void setNomeDistribuidora(String nomeDistribuidora) {  // Adicionando o setter para nomeDistribuidora
        this.nomeDistribuidora = nomeDistribuidora;
    }
}
