package br.com.fiap.Gs.dto;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

public class ConsumoDTO {

    private Integer idConsumo;
    private String nomeUsuario;
    private Float consumoKwh;
    private String dataConsumo;
    private String nomeEquipamento;  // Adicionei este campo
    private String nomeDistribuidora;  // Adicionando o campo de distribuidora

    // Construtor
    public ConsumoDTO(Integer idConsumo, String nomeUsuario, Float consumoKwh, String dataConsumo, String nomeEquipamento, String nomeDistribuidora) {
        this.idConsumo = idConsumo;
        this.nomeUsuario = nomeUsuario;
        this.consumoKwh = consumoKwh;
        this.dataConsumo = dataConsumo;
        this.nomeEquipamento = nomeEquipamento;
        this.nomeDistribuidora = nomeDistribuidora;  // Inicializando o campo
    }

    // Getters e Setters
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
