package cartes;

public enum TypeCarteAttaque  {
	COUP_DE_SABRE("Coup de sabre", -2), COUP_FAIBLE("Coup faible", -1);
	
	private String chaine;
	private int nb_attaque;
	
	TypeCarteAttaque(String description, int nb_attaque) {
		this.chaine = description;
		this.nb_attaque = nb_attaque;
	}
	
	@Override
	public String toString() {
		return chaine;
	}
	public int getNbAttaque() {
		return nb_attaque;
	}
}
