/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Jogo;

/**
 * @author equipe devs
 *
 */
@Repository("jogoRepository")
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

	@Query(value = "SELECT * FROM JOGO WHERE estadio_id = ?1", nativeQuery = true)
	List<Jogo> getAllJogosByEstadio(Integer idEstadio);

}
