package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int indexOfFullArray = 11;
	private static final int indexOfEmptyArray = -1;
	private static final int sizeOfArray = 12;

	final private int[] numbers = new int[sizeOfArray];
	private int total = indexOfEmptyArray;

	public void countIn(final int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == indexOfEmptyArray;
	}

	public boolean isFull() {
		return total == indexOfFullArray;
	}

	protected int peekaboo() {
		if (callCheck())
			return indexOfEmptyArray;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return indexOfEmptyArray;
		return numbers[total--];
	}

}

// zmiana nazw metod nie była przewidziana na tym branchu