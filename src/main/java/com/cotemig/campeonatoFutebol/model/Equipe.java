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
 * @author Jose Eustaquio Muniz
 *
 */
@Entity
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;

	@OneToMany(mappedBy = "equipe")
	private Set<Jogador> jogadores;

	@ManyToOne
	@JoinColumn(name = "classificacao_id", nullable = false) /* isso não está claro */
	private Classificacao classificacao;

	public void AdicionarEquipe() {
		// implementar
	}

	public void AlterarEquipe() {
		// implementar
	}

	public void ExcluirEquipe() { /* nome diferente na modelagem */
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
	 * @return the jogadores
	 */
	public Set<Jogador> getJogadores() {
		return jogadores;
	}

	/**
	 * @param jogadores the jogadores to set
	 */
	public void setJogadores(Set<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	/**
	 * @return the classificacao
	 */
	public Classificacao getClassificacao() {
		return classificacao;
	}

	/**
	 * @param classificacao the classificacao to set
	 */
	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

}
