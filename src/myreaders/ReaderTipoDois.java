package myreaders;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import entities.Conteudo;

public class ReaderTipoDois extends meuReaderPersonalizado {
	
	public Conteudo lerLinhas(String arquivo) throws IOException {
		
		String fileName = arquivo;
		
		// stream de entrada - dados binarios
		InputStream is = new FileInputStream(fileName);
		// converter dados binarios em caracteres
		Reader r = new InputStreamReader(is);
		// armazenar caractere em "balde" ate ler um linha completa
		BufferedReader br = new BufferedReader(r);
		
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
		apresentarSeNoConsole();
		System.out.println("DOIS!");
		System.out.println("= = = = = = = =");
	}

}
