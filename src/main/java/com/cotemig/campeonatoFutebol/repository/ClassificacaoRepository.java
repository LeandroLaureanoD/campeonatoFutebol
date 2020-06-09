/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Classificacao;

/**
 * @author equipe devs
 *
 */
@Repository("classificacaoRepository")
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {

	@Query(value = "SELECT * FROM CLASSIFICACAO WHERE equipe_id = ?1", nativeQuery = true)
	Optional<Classificacao> getClassificacaoByEquipe(Integer idEquipe);

}
