package br.com.ebac.animalsservice.repositorios;

import br.com.ebac.animalsservice.entidades.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL ORDER BY a.dataEntrada DESC")
    List<Animal> findAdopted();

    @Query("SELECT f.nome, COUNT(a) FROM Funcionario f LEFT JOIN f.animaisResgatados a GROUP BY f.id")
    List<Object[]> countAnimaisResgatadosPorFuncionario();

}



