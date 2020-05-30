/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Resultado;

/**
 * @author equipe devs
 *
 */
@Repository("resultadoRepository")
public interface ResultadoRepository extends JpaRepository<Resultado, Integer> {

}
