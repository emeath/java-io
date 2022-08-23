package entities;

import java.util.ArrayList;
import java.util.List;

public class Conteudo {

	private List<String> dados = new ArrayList<>();
	
	public Conteudo() {
	}
	
	public List<String> getDados() {
		return dados;
	}
	
	public void adicionarDado(String dado) {
		dados.add(dado);
	}
}
