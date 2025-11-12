
public class ElectriskaisP extends Pokemons {
	private int elektroStiprums;

	public ElectriskaisP(String nosaukums, int veseliba, int uzbrukums, int elektroStiprums) {
		super(nosaukums, veseliba, uzbrukums);
		this.elektroStiprums = elektroStiprums;
	}

	@Override
	public void uzbrukt() {
		System.out.println(nosaukums + " izmanto elektrisko uzbrukumu ar stiprumu " + elektroStiprums + "!");
	}

	public void izveidotElektroStiprumaVilni() {
		System.out.println(nosaukums + " izveido elektro stipruma vilni!");
	}
	
	
	

}
