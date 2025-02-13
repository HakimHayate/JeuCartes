package jeu;
import java.util.Random;

import cartes.*;
import personnages.*;
public class Jeu {
	private int tour = 0;
	private int nb_cartes_dispo = -1;
	private Carte cartes[] = new Carte[100];
	
	public Jeu(int nb_cartes_max) {
		creerCartes(nb_cartes_max);
	}
	
	private void creerCartes(int nb_cartes_max) {
		TypeCarte type;
		for (int i = 0; i<nb_cartes_max; i++) {
			TypeCarte[] values = TypeCarte.values();
	        type = values[new Random().nextInt(values.length)];
	        addCarte(type, i);
		}
		
	}
	private void addCarte(TypeCarte type, int i) {
        if (type == TypeCarte.ATTAQUE) {
        	nb_cartes_dispo++;
        	cartes[nb_cartes_dispo] = new CarteAttaque("Carte "+i, type, -(new Random().nextInt(4) + 1));
        }
        else {
        	nb_cartes_dispo++;
        	cartes[nb_cartes_dispo] = new CarteAttaque("Carte "+i, type, (new Random().nextInt(4) + 1));
        }
		
	}

	public void startGame() {
		System.out.println("Game starts !");
		
	}
	
	public void gameOver() {
		
	}
	public void distribuerCarte(Personnage personne) {
		if (nb_cartes_dispo<0) {
			carteNonDispo();
		}
		else {
			personne.piocher(cartes[nb_cartes_dispo]);
		}
	}

	public void carteNonDispo() {
		System.out.println("Aucune carte n'est disponible");
	}
	
}
