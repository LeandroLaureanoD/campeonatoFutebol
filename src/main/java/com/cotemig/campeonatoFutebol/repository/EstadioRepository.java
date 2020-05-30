/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Estadio;

/**
 * @author equipe devs
 *
 */
@Repository("estadioRepository")
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {

	@Query(value = "SELECT * FROM ESTADIO WHERE cidade_id = ?1", nativeQuery = true)
	List<Estadio> getAllEstadiosByCidade(Integer idCidade);

}
