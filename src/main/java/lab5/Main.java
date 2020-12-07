package lab5;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        var readStrings = FileReader.reader("input1.txt");
        var string = readStrings.get(0);
        var substring = readStrings.get(1);

        System.out.println(Arrays.toString(Algorithm.naiveAlgorithm(string, substring).toArray()));
    }

}
