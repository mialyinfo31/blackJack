package blackJack;

public class MainJoueur {

	protected String joueurCourrant;
	protected int score;
	protected boolean estGagnant;

	/**
	 * CONSTRUCTOR
	 *
	 * @param score
	 * @param estGagnant
	 */

	public MainJoueur() {
		super();
	}

	public MainJoueur(String joueurCourrant, int score, boolean estGagnant) {
		super();
		this.joueurCourrant = joueurCourrant;
		this.score = score;
		this.estGagnant = estGagnant;
	}

	/**
	 * GETTER AND SETTER
	 *
	 * @return
	 */

	public String getJoueurCourrant() {
		return joueurCourrant;
	}

	public void setJoueurCourrant(String joueurCourrant) {
		this.joueurCourrant = joueurCourrant;
	}

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
