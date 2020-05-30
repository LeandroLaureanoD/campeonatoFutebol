/**
 * 
 */
package com.cotemig.campeonatoFutebol.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cotemig.campeonatoFutebol.model.Cidade;

/**
 * @author equipe devs
 *
 */
@Repository("cidadeRepository")
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	@Query(value = "SELECT * FROM CIDADE WHERE estado_id = ?1", nativeQuery = true)
	List<Cidade> getAllCidadesByEstado(Integer idEstado);

}
