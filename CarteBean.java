package blackJack;

public class CarteBean {
	protected boolean visible;
	protected Couleur color;
	protected Valeur value;

	/**
	 * CONSTRUCTOR
	 */
	public CarteBean() {
		super();
	}

	public CarteBean(boolean visible, Couleur color, Valeur value) {
		super();
		this.visible = visible;
		this.color = color;
		this.value = value;
	}

	/**
	 * MEHTODES
	 */

	public void affichercarte() {

	}

	/**
	 * GETTER AND SETTER
	 */

	public Couleur getColor() {
		return color;
	}

	public CarteBean(boolean visible) {
		super();
		this.visible = visible;
	}

	public void setColor(Couleur color) {
		this.color = color;
	}

	public Valeur getValue() {
		return value;
	}

	public void setValue(Valeur value) {
		this.value = value;
	}

}
