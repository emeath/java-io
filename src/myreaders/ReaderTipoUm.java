package myreaders;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import entities.Conteudo;

public class ReaderTipoUm extends meuReaderPersonalizado{
	
	public Conteudo lerLinhas(String arquivo) throws IOException {
		
		String fileName = arquivo;
		
		// stream de entrada - dados binarios
		FileInputStream fis = new FileInputStream(fileName);
		
		// converter dados binarios em caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		
		// armazenar caractere em "balde" ate ler um linha completa
		BufferedReader br = new BufferedReader(isr);
		
		Conteudo conteudo = new Conteudo();
		String line = br.readLine();
		
		while(line != null) {
			conteudo.adicionarDado(line);
			line = br.readLine();
		}
		
		br.close();
		
		return conteudo;
	}

	@Override
	public void apresentarSeNoConsoleClasseFilha() {
		super.apresentarSeNoConsole();
		System.out.println("UM!");
		System.out.println("= = = = = = = =");
	}

}
