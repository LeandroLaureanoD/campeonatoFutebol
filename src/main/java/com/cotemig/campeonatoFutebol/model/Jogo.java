/**
 * 
 */
package com.cotemig.campeonatoFutebol.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Jose Eustaquio Muniz
 *
 */
@Entity
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String nome;
	
	private Date data;

	@ManyToOne
    @JoinColumn(name="campeonato_id", nullable=false)
    private Campeonato campeonato;
	
	@ManyToOne
	@JoinColumn(name = "resultado_id", nullable = false)
	private Resultado resultado;

	
	public void CriarJogo() {
		// implementar
	}

	public void AlterarJogo() {
		// implementar
	}
	public void CancelarJogo() {
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
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the campeonato
	 */
	public Campeonato getCampeonato() {
		return campeonato;
	}
	/**
	 * @param campeonato the campeonato to set
	 */
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}

	/**
	 * @return the resultado
	 */
	public Resultado getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

}
