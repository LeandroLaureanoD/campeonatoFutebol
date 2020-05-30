/**
 * 
 */
package com.cotemig.campeonatoFutebol.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author equipe devs
 *
 */
@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;
	
	private String sigla;
	
	@OneToMany(mappedBy = "estado")
	private Set<Cidade> cidades;
	
	
	public void AdicionarEstado() {
		// implementar
	}
	
	public void AlterarEstado() {
		// implementar
	}
	
	public void ExcluirEstado() {
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
	 * @return the cidades
	 */
	public Set<Cidade> getCidades() {
		return cidades;
	}

	/**
	 * @param cidades the cidades to set
	 */
	public void setCidades(Set<Cidade> cidades) {
		this.cidades = cidades;
	}

}
