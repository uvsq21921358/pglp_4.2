package Exception;

public class NombreOperationsException extends IllegalArgumentException {

	public NombreOperationsException() {
		super("Il n'y a pas assez d'opérations!!!");
	}
}
