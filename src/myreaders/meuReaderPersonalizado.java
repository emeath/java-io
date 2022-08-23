package myreaders;

public abstract class meuReaderPersonalizado {

	protected void apresentarSeNoConsole() {
		System.out.println();
		System.out.println("= = = = = = = = = =");
		System.out.print("Resultados obtidos através do Reader Personalizado Tipo: ");
	}
	
	public abstract void apresentarSeNoConsoleClasseFilha();
}
