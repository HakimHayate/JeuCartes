package cartes;

public enum TypeCarte {
	POPULARITE("Poupularité"), ATTAQUE("Attaque"), SPECIALE("Spéciale");

	private String def;
	
	TypeCarte(String def) {
		this.def = def;
	}
	@Override
	public String toString() {
		return def;
	}
}
