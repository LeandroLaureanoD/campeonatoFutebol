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
public class Classificacao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer posicao;

	private Integer pontuacao;

	private Integer vitoias;

	private Integer derrotas;

	private Integer empates;

	@OneToMany(mappedBy = "classificacao") /* isso não está claro */
	private Set<Equipe> equipes;

	public void InserirResultado() {
		// implementar
	}

	public void AlterarResultado() {
		// implementar
	}

	public void ExcluirResultado() {
		// implementar
	}

	public void ExibirClassificacao() {
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
	 * @return the posicao
	 */
	public Integer getPosicao() {
		return posicao;
	}

	/**
	 * @param posicao the posicao to set
	 */
	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	/**
	 * @return the pontuacao
	 */
	public Integer getPontuacao() {
		return pontuacao;
	}

	/**
	 * @param pontuacao the pontuacao to set
	 */
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}

	/**
	 * @return the vitoias
	 */
	public Integer getVitoias() {
		return vitoias;
	}

	/**
	 * @param vitoias the vitoias to set
	 */
	public void setVitoias(Integer vitoias) {
		this.vitoias = vitoias;
	}

	/**
	 * @return the derrotas
	 */
	public Integer getDerrotas() {
		return derrotas;
	}

	/**
	 * @param derrotas the derrotas to set
	 */
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	/**
	 * @return the empates
	 */
	public Integer getEmpates() {
		return empates;
	}

	/**
	 * @param empates the empates to set
	 */
	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

	/**
	 * @return the equipes
	 */
	public Set<Equipe> getEquipes() {
		return equipes;
	}

	/**
	 * @param equipes the equipes to set
	 */
	public void setEquipes(Set<Equipe> equipes) {
		this.equipes = equipes;
	}

}
