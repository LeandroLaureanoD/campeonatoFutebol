/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Campeonato;

/**
 * @author equipe devs
 *
 */
@Repository("campeonatoRepository")
public interface CampeonatoRepository extends JpaRepository<Campeonato, Integer> {

}
