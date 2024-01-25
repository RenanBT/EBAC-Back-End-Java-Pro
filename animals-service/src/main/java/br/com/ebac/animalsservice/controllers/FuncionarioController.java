package br.com.ebac.animalsservice.controllers;

import br.com.ebac.animalsservice.repositorios.FuncionarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {

    private FuncionarioRepository repository;

    public FuncionarioController(FuncionarioRepository repository){
        this.repository=repository;
    }

    @GetMapping("/rescued-by")
    private List<Object[]> countAnimaisResgatadosPorFuncionario() {
        return repository.countAnimaisResgatadosPorFuncionario();
    }

}
