package uvsq21921358;

public enum Calculatrice {

	ENVIRONNEMENT;

	public void run( String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		saisie.saisie();
	}

	public static void main( String[] args ) {
		ENVIRONNEMENT.run(args);
	}
}
