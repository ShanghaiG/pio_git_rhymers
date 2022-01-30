package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int const_0 = 0;
	
	int totalRejected = const_0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

// Pytanie: Które wiersze w klasie HanoiRhymer były źle sformatowane? Odp: Były
// to wiersze 5,12,14 i 15

// Działanie kombinacji klawiszy alt + strzałka w lewo oraz alt + strzałka w
// prawo polega na przełączaniu się między otwartymi kartami w IDE w prawo lub
// lewo (zależnie od wybranej kombinacji klawiszy)