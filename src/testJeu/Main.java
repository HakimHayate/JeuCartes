package testJeu;


import java.util.Scanner;

import affichage.Affichage;
import cartes.*;
import jeu.*;
import personnages.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Personnage joueur1 = new Personnage("Pirate1");
		Personnage joueur2 = new Personnage("Pirate2");
		Affichage affiche = new Affichage();
		
		Jeu jeu = new Jeu();
		
		affiche.afficher("Partie commence!");
		
		for (int i=0; i<4; i++) {
			jeu.piocher(joueur1);
			jeu.piocher(joueur2);
		}
		while (true) {
			if (joueur1.estMort()) {
				affiche.afficher(joueur1.getName()+ " est mort");
				break;
			}
			else if(joueur2.estMort()) {
				affiche.afficher(joueur2.getName()+ " est mort");
				break;
			}
			else if (joueur1.estPopulaire()) {
				affiche.afficher(joueur2.getName()+ " a gagné");
				break;
			}
			else if (joueur2.estPopulaire()) {
				affiche.afficher(joueur2.getName()+ " a gagné");
				break;
			}
			
			else {
				Personnage p[] = jeu.quiJoue(joueur1, joueur2);
				Personnage j_courant = p[0];
				Personnage enemy = p[1];
				
				affiche.afficherJoueurCourantStats(j_courant.getName(), j_courant.getPV(), j_courant.getNbPopularite());
				
				if (jeu.piocher(j_courant)) {
					affiche.joueurPioche(j_courant.getName());
				}
				else {
					affiche.afficher("Aucune carte n'est disponible dans le jeu");
					break;
				}
				
				Carte cartes[] = j_courant.getMain();
				affiche.afficher("Cartes du joueur courant: ");
				for (int i=0; i<=j_courant.getNbCarteMain(); i++) {
					affiche.afficher("Carte "+i+": ");
					affiche.afficherCarte(cartes[i].getDescription(), cartes[i].getType(), cartes[i].getNbAttaque(), cartes[i].getNbPopularite());
				}
				affiche.afficher("Choisir carte: ");
				int indice_carte_joue = scanner.nextInt();
				Carte carte_joue = j_courant.jouerCarte(indice_carte_joue);
				jeu.jouer(j_courant, enemy, carte_joue,indice_carte_joue );
				jeu.avancerTour();
				affiche.next(j_courant.getName());
			}
		}
	}

}
