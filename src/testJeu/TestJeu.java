package testJeu;


import java.util.Scanner;

import affichage.Affichage;
import affichage.IGestionAffichage;
import cartes.*;
import jeu.*;
import personnages.*;

public class  TestJeu{
	
	private IGestionAffichage affiche = new Affichage();
	Jeu jeu = new Jeu();
	Scanner scanner = new Scanner(System.in);
	
	public void lancerPartie() {
		
		
		
		affiche.afficher("Partie commence!");
		
		affiche.afficher("Donner le nom du pirate1");
		String nomPirate1 = scanner.next();
		
		Personnage joueur1 = jeu.creerPersonnage(nomPirate1);
		
		affiche.afficher("Donner le nom du pirate2");
		String nomPirate2 = scanner.next();
		
		Personnage joueur2 = jeu.creerPersonnage(nomPirate2);
		
		
		for (int i=0; i<4; i++) {
			jeu.piocher(joueur1);
			jeu.piocher(joueur2);
		}
		
		boolean pirate1Perdu = false;
		boolean pirate2Perdu = false;
		
		boolean pirate1Gagne = false;
		boolean pirate2Gagne = false;
		
		while (!pirate1Perdu || !pirate1Gagne || !pirate2Perdu || !pirate2Gagne) {
			if (joueur1.estMort()) {
				affiche.afficher(joueur1.getName()+ " est mort");
				 pirate1Perdu = true;
			}
			else if(joueur2.estMort()) {
				affiche.afficher(joueur2.getName()+ " est mort");
				pirate2Perdu = true;
			}
			else if (joueur1.estPopulaire()) {
				affiche.afficher(joueur1.getName()+ " a gagné");
				pirate1Gagne = true;
			}
			else if (joueur2.estPopulaire()) {
				affiche.afficher(joueur2.getName()+ " a gagné");
				pirate2Gagne = true;
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
		scanner.close();
	}

}
