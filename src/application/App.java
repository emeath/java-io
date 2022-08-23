package application;

import java.io.IOException;

import entities.Conteudo;
import myreaders.ReaderTipoDois;
import myreaders.ReaderTipoUm;

public class App {

	public static void main(String[] args) throws IOException {
		
		ReaderTipoUm rtu = new ReaderTipoUm();
		Conteudo conteudo = rtu.lerLinhas("passwordsMegamanX.txt");
		rtu.apresentarSeNoConsoleClasseFilha();
		conteudo.getDados().forEach(dado -> System.out.println(dado));
		
		ReaderTipoDois rtd = new ReaderTipoDois();
		conteudo = rtd.lerLinhas("passwordsMegamanX.txt");
		rtd.apresentarSeNoConsoleClasseFilha();
		conteudo.getDados().forEach(dado -> System.out.println(dado));
	}

}