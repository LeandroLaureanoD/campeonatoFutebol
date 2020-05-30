/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Classificacao;

/**
 * @author equipe devs
 *
 */
@Repository("classificacaoRepository")
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {

}
