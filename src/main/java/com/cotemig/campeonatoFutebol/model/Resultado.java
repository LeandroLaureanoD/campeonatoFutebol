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
public class Resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String vencedor;

	private String derrotado;

	private Integer pontoVitoria;
	
	@OneToMany(mappedBy = "resultado")
	private Set<Jogo> jogos;


	public void AdicionarResultado() {
		// implementar
	}

	public void AlterarResultado() {
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
	 * @return the vencedor
	 */
	public String getVencedor() {
		return vencedor;
	}

	/**
	 * @param vencedor the vencedor to set
	 */
	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

	/**
	 * @return the derrotado
	 */
	public String getDerrotado() {
		return derrotado;
	}

	/**
	 * @param derrotado the derrotado to set
	 */
	public void setDerrotado(String derrotado) {
		this.derrotado = derrotado;
	}

	/**
	 * @return the pontoVitoria
	 */
	public Integer getPontoVitoria() {
		return pontoVitoria;
	}

	/**
	 * @param pontoVitoria the pontoVitoria to set
	 */
	public void setPontoVitoria(Integer pontoVitoria) {
		this.pontoVitoria = pontoVitoria;
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
