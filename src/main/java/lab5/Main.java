package lab5;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        var string = "I wish to wish the wish you wish to wish, but if you wish the wish the witch wishes," +
                " I won’t wish the wish you wish to wish";
        var substring = "wish";
        System.out.println(Arrays.toString(Algorithm.naiveAlgorithm(string, substring).toArray()));
    }

}
