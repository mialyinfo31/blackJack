package blackJack;

public class MainJoueur {
	protected int score;
	protected boolean estGagnant;

	/**
	 * CONSTRUCTOR
	 *
	 * @param score
	 * @param estGagnant
	 */

	public MainJoueur(int score, boolean estGagnant) {
		super();
		this.score = score;
		this.estGagnant = estGagnant;
	}

	public MainJoueur() {
		super();
	}

	/**
	 * GETTER AND SETTER
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isEstGagnant() {
		return estGagnant;
	}

	public void setEstGagnant(boolean estGagnant) {
		this.estGagnant = estGagnant;
	}

}
