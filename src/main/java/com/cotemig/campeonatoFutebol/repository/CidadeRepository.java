/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Cidade;

/**
 * @author equipe devs
 *
 */
@Repository("cidadeRepository")
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
