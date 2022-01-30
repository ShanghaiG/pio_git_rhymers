package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int const_11 = 11;
	private static final int conts_minus1 = -1;
	private static final int const_12 = 12;

	final private int[] numbers = new int[const_12];
	public int total = conts_minus1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == conts_minus1;
	}

	public boolean isFull() {
		return total == const_11;
	}

	protected int peekaboo() {
		if (callCheck())
			return conts_minus1;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return conts_minus1;
		return numbers[total--];
	}

}
