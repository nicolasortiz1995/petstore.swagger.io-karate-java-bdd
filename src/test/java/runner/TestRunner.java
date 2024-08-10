package runner;

import com.intuit.karate.Results;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TestRunner {

   @Test
   void testParallel() {
      Results results = Karate.run("classpath:features").parallel(5);
      assertTrue(results.getFailCount() == 0, results.getErrorMessages());
   }

}