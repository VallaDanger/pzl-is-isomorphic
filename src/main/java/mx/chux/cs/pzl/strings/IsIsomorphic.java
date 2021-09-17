package mx.chux.cs.pzl.strings;

import java.util.HashMap;
import java.util.Map;

import mx.chux.cs.pzl.PuzzleSolution;

public class IsIsomorphic implements PuzzleSolution<Boolean> {

	public static IsIsomorphic strings(final String first, final String second) {
		return new IsIsomorphic(first, second);
	}

	private final String first;
	private final String second;
	
	private IsIsomorphic(final String first, final String second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public Boolean bruteForceSolution() {
		return optimalSolution();
	}
	
	@Override
	public Boolean optimalSolution() {
		// time complexity: O(n)
		
		// space complexity: O(n+m)
		
		final int size = this.first.length();
		
		if( size != this.second.length() ) {
			return Boolean.FALSE;
		}
		
		final Map<Character, Character> firstToSecond = new HashMap<>(size);
		final Map<Character, Character> secondToFirst = new HashMap<>(size);
		
		for( int index = 0 ; index < size ; index++ ) {
			
			final Character firstChar = charAt(this.first, index);
			final Character secondChar = charAt(this.second, index);
			
			if( firstToSecond.containsKey(firstChar) 
					&& !firstToSecond.get(firstChar).equals(secondChar) ) {
				return Boolean.FALSE;
			}
			
			if( secondToFirst.containsKey(secondChar) 
					&& !secondToFirst.get(secondChar).equals(firstChar) ) {
				return Boolean.FALSE;
			}
			
			firstToSecond.put(firstChar, secondChar);
			secondToFirst.put(secondChar, firstChar);
			
		}
		
		return Boolean.TRUE;
	}

	private Character charAt(final String string, final int index) {
		return Character.valueOf(string.charAt(index));
	}
	
}
