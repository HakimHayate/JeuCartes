package cartes;

public class CartePopularite extends Carte{
	private int nb_popularite;
	
	public CartePopularite(String nomCarte, TypeCarte type, int nb_popularite) {
		super(nomCarte, type);
		this.nb_popularite = nb_popularite;
	}
	
	public int getNbPopularite() {
		return nb_popularite;
	}
}
