/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Estado;

/**
 * @author equipe devs
 *
 */
@Repository("estadoRepository")
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
