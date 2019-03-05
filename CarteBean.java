package blackJack;

public class CarteBean {
	protected Valeur value;
	protected Couleur color;
	protected boolean isVisible;

	/**
	 * CONSTRUCTOR
	 */

	public CarteBean(Valeur value, Couleur color, boolean visible) {
		super();
		isVisible = visible;
		this.color = color;
		this.value = value;
	}

	/**
	 * GETTER AND SETTER
	 */

	public Couleur getColor() {
		return color;
	}

	public Valeur getValue() {
		return value;
	}

	/**
	 * Pour éviter d'avoir le pointeur reconfigurer le @override dans source
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value + " de " + color;
	}

}
