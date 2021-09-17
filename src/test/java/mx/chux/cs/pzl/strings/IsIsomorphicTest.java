package mx.chux.cs.pzl.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class IsIsomorphicTest {

	private void assertOptimalSolution(final String first, String second, final Boolean expectedSolution) {
		final Boolean solution = IsIsomorphic.strings(first, second).optimalSolution();
		assertThat(solution).isEqualTo(expectedSolution);
	}
	
	@Test
	public void isIsomorphicTest() {
		assertOptimalSolution("paper", "title", Boolean.TRUE);
	}
	
	@Test
	public void isNotIsomorphicTest() {
		assertOptimalSolution("xxyy", "abcd", Boolean.FALSE);
	}
	
}
