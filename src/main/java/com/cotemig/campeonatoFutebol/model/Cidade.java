/**
 * 
 */
package com.cotemig.campeonatoFutebol.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author equipe devs
 *
 */
@Entity
public class Cidade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;
	
	private String sigla;
	
	
	
	
	
	@ManyToOne
	@JoinColumn(name = "estado_id", nullable = false)
	private Estado estado;

	@OneToMany(mappedBy = "cidade")
	private Set<Estadio> estadios;

	public void AdicionarCidade() {
		// implementar
	}
	
	public void AlterarCidade() {
		// implementar
	}
	
	public void ExcluirCidade() {
		// implementar
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sigla
	 */
	public String getSigla() {
		return sigla;
	}

	/**
	 * @param sigla the sigla to set
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	/**
	 * @return the estado
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
	 * @return the estadios
	 */
	public Set<Estadio> getEstadios() {
		return estadios;
	}

	/**
	 * @param estadios the estadios to set
	 */
	public void setEstadios(Set<Estadio> estadios) {
		this.estadios = estadios;
	}

}
