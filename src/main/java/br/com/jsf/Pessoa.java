package br.com.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name = "pessoaBean")
public class Pessoa {

	private String nome;

	// ADCIONA NOME EM LISTA
	private List<String> nomes = new ArrayList<String>();

	public String addNome() {
		// ADCONA O NOME QUE VEM DA TELA
		nomes.add(nome);
		return "";

	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
