package br.com.ebac.animalsservice.entidades;

import jakarta.persistence.*;

import java.util.Date;

/*
* TODO Modificar o modelo de dados para que Gatos também possam ser cadastrados.
*  Modifique o código do serviço criado no módulo para criar uma API que retorne a quantidade de animais que cada funcionário do abrigo resgatou ao
*  longo de um intervalo de datas.
*  O intervalo máximo das datas é de um ano.
* */
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    private String especie; // Campo para separar cães e gatos.
    @Column(nullable = false)
    private String nomeProvisorio; // nome_provisorio

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private Date dataEntrada;
    @Column
    private Date dataAdocao;
    @Column(nullable = false)
    private String condicoesChegada;

    @Column(nullable = false)
    private Integer idRecebedor;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNomeProvisorio() {
        return nomeProvisorio;
    }

    public void setNomeProvisorio(String nomeProvisorio) {
        this.nomeProvisorio = nomeProvisorio;
    }

    public Integer getIdadeEstimada() {
        return idadeEstimada;
    }

    public void setIdadeEstimada(Integer idadeEstimada) {
        this.idadeEstimada = idadeEstimada;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(Date dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getCondicoesChegada() {
        return condicoesChegada;
    }

    public void setCondicoesChegada(String condicoesChegada) {
        this.condicoesChegada = condicoesChegada;
    }

    public Integer getIdRecebedor() {
        return idRecebedor;
    }

    public void setIdRecebedor(Integer idRecebedor) {
        this.idRecebedor = idRecebedor;
    }

    public String getNomeRecebedor() {
        return nomeRecebedor;
    }

    public void setNomeRecebedor(String nomeRecebedor) {
        this.nomeRecebedor = nomeRecebedor;
    }

    public Date getDataObito() {
        return dataObito;
    }

    public void setDataObito(Date dataObito) {
        this.dataObito = dataObito;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Column(nullable = false)
    private String porte;
}
