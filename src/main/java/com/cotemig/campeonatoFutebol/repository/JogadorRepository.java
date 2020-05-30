/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Jogador;

/**
 * @author equipe devs
 *
 */
@Repository("jogadorRepository")
public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
	
	@Query(value = "SELECT * FROM JOGADOR WHERE equipe_id = ?1", nativeQuery = true)
	List<Jogador> getAllJogadoresByEquipe(Integer idEquipe);

	@Query(value = "SELECT * FROM JOGADOR WHERE idade = ?1", nativeQuery = true)
	List<Jogador> getAllJogadoresByAge(Integer age);

}
