/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Jogo;

/**
 * @author equipe devs
 *
 */
@Repository("jogoRepository")
public interface JogoRepository extends JpaRepository<Jogo, Integer> {

}
