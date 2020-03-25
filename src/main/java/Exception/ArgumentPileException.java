package Exception;

public class ArgumentPileException extends IllegalArgumentException {

	public ArgumentPileException() {

		super("Pas assez d'éléments dans la pile pour cette opération!!!");

	}
}
