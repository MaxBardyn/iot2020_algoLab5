package lab5;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        var string = "Six sick hicks nick six slick bricks with picks and sticks";
        var substring = "ick";
        System.out.println(Arrays.toString(Algorithm.naiveAlgorithm(string, substring).toArray()));
    }

}
