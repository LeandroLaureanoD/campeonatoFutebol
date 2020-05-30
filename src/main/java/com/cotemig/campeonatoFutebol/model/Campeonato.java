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
public class Campeonato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String nome;
	
	private String estado;
	
	private String tipo;
	
	private Boolean ativo; /* não está na modelagem */
	
	@OneToMany(mappedBy="campeonato")
    private Set<Jogo> jogos;

	
	public void CriarCampeonato() {
		// implementar
	}
	
	public void AlterarCampeonato() {
		// implementar
	}
	
	public void CancelarCampeonato() {
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
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the ativo
	 */
	public Boolean getAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	/**
	 * @return the jogos
	 */
	public Set<Jogo> getJogos() {
		return jogos;
	}

	/**
	 * @param jogos the jogos to set
	 */
	public void setJogos(Set<Jogo> jogos) {
		this.jogos = jogos;
	}

}
