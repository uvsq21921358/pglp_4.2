package Exception;

public class ArgumentPileException extends IllegalArgumentException {

	public ArgumentPileException() {

		super("Votre file ne contient pas assez d'éléments pour cette opération!!");

	}
}
