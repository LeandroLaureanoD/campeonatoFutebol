/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Estadio;

/**
 * @author equipe devs
 *
 */
@Repository("estadioRepository")
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {

}
