package uvsq21921358;

import Exception.ArgumentPileException;
import Exception.MinMaxException;

public class Exceptions {

	private static final double MIN_VALUE = 100000;
	private static final double MAX_VALUE = 100000;

	public static void MinMax(double nbre) {

		if(nbre > MAX_VALUE || nbre < -MIN_VALUE) {
			throw new MinMaxException();
		}

	}

	public static void StackSize(int actualSize, int wantedSize) {
		if(actualSize < wantedSize) {
			throw new ArgumentPileException();
		}

	}
}
