package mx.chux.cs.pzl.strings;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());
    
    public static void main( String[] args ) {
	    
	    final Instant start = Instant.now();
	    final Boolean answer = IsIsomorphic.strings("paper", "title").optimalSolution();
    	final Instant finish = Instant.now();
    	long timeElapsed = Duration.between(start, finish).toMillis();
		
    	LOGGER.log(Level.INFO, "IsIsomorphic [ time: {0} ]: {1}", new Object[] { timeElapsed, answer });
	    
    }
    
}
