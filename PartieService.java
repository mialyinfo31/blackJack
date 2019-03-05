package blackJack;

public class PartieService {

	public static void main(String[] args) {

		// ******************** Creation d'un paquet de cartes
		Paquet paquet = new Paquet();

		// ==> ici : le paquet est rempli de cartes, et pret � l'emploi, MAIS tri�

		// ********************* M�lange du paquet
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

		// Faire tirer des cartes au joueur (jusqu'� ce qu'il soit satisfait ou qu'il
		// ait saut�)

		// Faire tirer des cartes � la banque (� concurrence de 17)

		// D�terminer le vainqueur et afficher le r�sultat

	}

}
