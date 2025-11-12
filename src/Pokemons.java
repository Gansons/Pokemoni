
public class Pokemons {
		protected String nosaukums;
	protected int veseliba;
	protected int uzbrukums;

	public Pokemons(String nosaukums, int veseliba, int uzbrukums) {
		this.nosaukums = nosaukums;
		this.veseliba = veseliba;
		this.uzbrukums = uzbrukums;
	}

	public void uzbrukt() {
		System.out.println(nosaukums + " veic uzbrukumu ar spēku " + uzbrukums + "!");
	}

	public void izvairities() {
		System.out.println(nosaukums + " izvairās no uzbrukuma!");
	}

	public void dziedet(int dziedesana) {
		veseliba += dziedesana;
		System.out.println(nosaukums + " ir dziedināts par " + dziedesana + " punktiem! Pašreizējā veselība: " + veseliba);
	}

	public void attistit(int attistibasLimenis) {
		uzbrukums += attistibasLimenis * 5;
		System.out.println(nosaukums + " ir attīstījies! Pašreizējais uzbrukuma spēks: " + uzbrukums);
	}

}
