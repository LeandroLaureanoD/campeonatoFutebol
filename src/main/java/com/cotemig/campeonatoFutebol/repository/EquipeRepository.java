/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Equipe;

/**
 * @author equipe devs
 *
 */
@Repository("equipeRepository")
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

	List<Equipe> getAllEquipesByCampeonato(Integer idCampeonato);

}
