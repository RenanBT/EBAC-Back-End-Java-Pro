package br.com.ebac.animalsservice.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Funcionario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    private String nome;

    @OneToMany(mappedBy = "funcionario")
    private List<Animal> animaisResgatados = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void setAnimaisResgatados(List<Animal> animaisResgatados) {
        this.animaisResgatados = animaisResgatados;
    }

}


