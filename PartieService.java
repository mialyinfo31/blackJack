package blackJack;

public class PartieService {

	public static void main(String[] args) {

		// ******************** Creation d'un paquet de cartes
		Paquet paquet = new Paquet();

		// ==> ici : le paquet est rempli de cartes, et pret à l'emploi, MAIS trié

		// ********************* Mélange du paquet
		paquet.melanger();

		// ******************** Distribution des cartes aux joueurs

		// Creer un objet pour representer la main d'un joueur
		MainJoueur mainJoueurUn = new MainJoueur();
		mainJoueurUn.setJoueurCourrant("joueur");

		// Piocher une carte dans le paquet
		System.out.println(paquet.toString());
		CarteBean cartePiochee = paquet.piocherAuHasard();
		System.out.println(cartePiochee);
		System.out.println(paquet.toString());

		// Ajouter cette carte a la main du joueur

		// Piocher une seconde carte
		// Et encore la donner au joueur

		// Affichage des cartes visibles

		// Faire tirer des cartes au joueur (jusqu'à ce qu'il soit satisfait ou qu'il
		// ait sauté)

		// Faire tirer des cartes à la banque (à concurrence de 17)

		// Déterminer le vainqueur et afficher le résultat

	}

}
