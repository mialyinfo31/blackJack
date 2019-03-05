package blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Paquet {
	protected List<CarteBean> carteList;

	public Paquet() {
		carteList = new ArrayList<>();
		for (Couleur color : Couleur.values()) {
			for (Valeur valeur : Valeur.values()) {
				CarteBean carteBean = new CarteBean(valeur, color, true);
				carteList.add(carteBean);
//				System.out.println("Carte crée : " + carteBean.toString());
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String monPaquetSousFormeDeString = "";
		for (CarteBean carte : carteList) {
			monPaquetSousFormeDeString += carte.toString() + " ## ";
		}
		return monPaquetSousFormeDeString;
	}

	public void melanger() {
		Collections.shuffle(carteList);
		System.out.println(carteList);
	}

	public CarteBean piocherAuHasard() {
		CarteBean maCartepiochee = null;

		final int size = carteList.size();
		final int index = (int) Math.floor((Math.random() * size));
		// maCartePiochee = carteList.get(index) => no need cause line 42 fetch it

		maCartepiochee = carteList.remove(index);

		return maCartepiochee;

	}

}
