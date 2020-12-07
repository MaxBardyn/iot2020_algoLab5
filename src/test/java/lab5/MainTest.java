package lab5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {


    @Test
    public void test() {

        var readStrings = FileReader.reader("input1.txt");
        var string = readStrings.get(0);
        var substring = readStrings.get(1);

        var array = Algorithm.naiveAlgorithm(string, substring);

        assertEquals("[[2, 5], [10, 13], [19, 22], [28, 31], [36, 39], [53, 56], [62, 65]," +
                " [77, 80], [93, 96], [102, 105], [111, 114], [119, 122]]", Arrays.toString(array.toArray()));
    }

    @Test
    public void test2() {

        var readStrings = FileReader.reader("input2.txt");
        var string = readStrings.get(0);
        var substring = readStrings.get(1);

        var array = Algorithm.naiveAlgorithm(string, substring);

        assertEquals("[[0, 3], [1, 4], [2, 5], [3, 6], [4, 7], [5, 8], [6, 9], [7, 10], [8, 11], [9, 12], [10, 13]," +
                " [11, 14], [12, 15], [13, 16], [14, 17], [15, 18], [16, 19], [17, 20]]", Arrays.toString(array.toArray()));
    }
}
