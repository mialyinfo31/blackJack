package blackJack;

public enum Valeur {

	Roi(10), Dame(10), Vallet(10), Dix(10), Neuf(9), Huit(8), Sept(7), Six(6), Cinq(5), Quatre(4), Trois(3), Deux(2),
	As(10);
	public int valeur;

	private Valeur() {
	}

	private Valeur(int valeur) {
		this.valeur = valeur;
	}

}
