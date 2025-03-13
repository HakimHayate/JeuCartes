package jeu;
import java.util.Random;

import affichage.Affichage;
import cartes.*;
import personnages.*;
public class Jeu {
	private int tour = 0;
	private int nb_cartes_dispo = -1; // Aucune carte dans la pioche initialement
	private Carte pioche[] = new Carte[100];
	private int TAILLE_MAX = 40;
	private Affichage affiche;
	
	public Jeu() {
		initJeu();
		affiche = new Affichage();
	}
	
	public void initJeu() {
		creerCartes();
		tour++;
	}
	
	// Ajouter des cartes à la pioche
	private void creerCartes() {
		for (int i = 0; i<TAILLE_MAX; i++) {
	        ajouterCarte(i);
		}
		
	}
	public Personnage[] quiJoue(Personnage p1, Personnage p2) {
		Personnage p[] = new Personnage[2];
		if (tour%2 == 0)  {
			p[0]=p1;
			p[1] = p2;
		}
		else {
			p[1]=p1;
			p[0] = p2;
		}
		
		return p;
	}
	public void jouer(Personnage p, Personnage enemy, Carte carte, int indice_carte_joue) {
		enemy.setPV(carte.getNbAttaque());
		p.setPopularite(carte.getNbPopularite());
		affiche.joueCarte(p.getName(), indice_carte_joue);
		if (carte.getNbAttaque() != 0) {
			affiche.joueurAttaque(p.getName(), enemy.getName(), carte.getNbAttaque());
		}
		if (carte.getNbPopularite() != 0) {
			affiche.joueurGagnePV(p.getName() ,carte.getNbPopularite());
		}
	}
	
	private void ajouterCarte(int i) {
		TypeCarte type;
		TypeCarte[] values = TypeCarte.values();
        type = values[new Random().nextInt(values.length)];
        if (type == TypeCarte.ATTAQUE) {
        	TypeCarteAttaque typeAttaque;
    		TypeCarteAttaque[] v_attaque = TypeCarteAttaque.values();
            typeAttaque = v_attaque[new Random().nextInt(v_attaque.length)];
        	nb_cartes_dispo++;
        	pioche[nb_cartes_dispo] = new CarteAttaque("Description: "+typeAttaque, type, typeAttaque.getNbAttaque());
        }
        else if (type == TypeCarte.POPULARITE){
        	nb_cartes_dispo++;
        	TypeCartePopularite typePop;
    		TypeCartePopularite[] v_pop = TypeCartePopularite.values();
            typePop = v_pop[new Random().nextInt(v_pop.length)];

        	pioche[nb_cartes_dispo] = new CartePopularite("Description: "+typePop, type, typePop.getNbPopularite());
        }
        else {
        	nb_cartes_dispo++;
        	TypeCarteSpeciale typeSpe;
    		TypeCarteSpeciale[] v_spe = TypeCarteSpeciale.values();
            typeSpe = v_spe[new Random().nextInt(v_spe.length)];

        	pioche[nb_cartes_dispo] = new CarteSpeciale("Description: "+typeSpe, type, typeSpe.getNbPopularite(), typeSpe.getNbAttaque());
        }
		
	}
	
	public boolean piocher(Personnage p) {
		if (nb_cartes_dispo<0) {
			affiche.afficher("Aucune carte n'est disponible dans la pioche");
			return false;
		}
		Carte cartePiochee = pioche[nb_cartes_dispo];
		p.ajoutercarte(cartePiochee); 
		nb_cartes_dispo--;
		return true;
	}

	public void avancerTour() {
		tour= (tour +1)%2;
		
	}

	
}
