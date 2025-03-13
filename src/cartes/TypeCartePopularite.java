package cartes;

public enum TypeCartePopularite {
	ABORDAGE_REUSSI("Abordage Réussi", 2), REVOLTE_ORGANISEE("Revolte organisée", 1), DISCOURS_IMPORTANT("Discours important", 1);
	
	private String chaine;
	private int nb_popularite;
	
	TypeCartePopularite(String def, int nb_pop) {
		this.chaine = def;
		this.nb_popularite = nb_pop;
	}
	
	@Override
	public String toString() {
		return chaine;
	}
	
	public int getNbPopularite() {
		return nb_popularite;
	}
}
