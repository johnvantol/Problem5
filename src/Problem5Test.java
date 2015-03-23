import static org.junit.Assert.*;

import org.junit.Test;

public class Problem5Test {

	@Test
	public void shouldEqualTwo() {

		int i = 0;
		for (i = 1;; i++) {
			if (i % 1 == 0 && i % 2 == 0) {
				System.out.print("The answer is: " + i);
				break;
			}
		}
		if (i != 2) {
			fail();
		}
	}
}
