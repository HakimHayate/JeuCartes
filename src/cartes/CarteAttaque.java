package cartes;

import personnages.Personnage;

public class CarteAttaque extends Carte{
	
	public CarteAttaque(String description, TypeCarte type, int nbDegats) {
		super(description, type, 0, nbDegats);
	}
}
