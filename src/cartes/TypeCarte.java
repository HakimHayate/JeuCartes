package cartes;

public enum TypeCarte {
	POPULARITE("Poupularité"), ATTAQUE("Attaque");

	private String def;
	
	TypeCarte(String def) {
		this.def = def;
	}
}
