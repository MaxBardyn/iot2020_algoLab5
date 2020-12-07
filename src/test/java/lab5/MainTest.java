package lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void test() {


        var string = "Lab 5 algorithm. Complete search or naive search algorithm," +
                " algorithm for finding substrings in the string";
        var substring = "algorithm";
        var array = Algorithm.naiveAlgorithm(string, substring);

        assertEquals(3, array.toArray().length);
    }
}
