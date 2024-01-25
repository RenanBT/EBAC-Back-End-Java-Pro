package br.com.ebac.animalsservice.repositorios;

import br.com.ebac.animalsservice.entidades.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {

    @Query("SELECT f.nome, COUNT(a) FROM Funcionario f LEFT JOIN f.animaisResgatados a GROUP BY f.id")
    List<Object[]> countAnimaisResgatadosPorFuncionario();
}
