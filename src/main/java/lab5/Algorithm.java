package lab5;

import java.util.ArrayList;

public class Algorithm {


    static ArrayList<ArrayList<Integer>> naiveAlgorithm(String string, String substring) {

        var foundArray = new ArrayList<ArrayList<Integer>>();

        for (var currentIndex = 0; currentIndex < string.length(); currentIndex++) {

            var pair = new ArrayList<Integer>();
            var lengthOfMatches = 0;
            while (lengthOfMatches < substring.length() && currentIndex + lengthOfMatches < string.length() && substring.charAt(lengthOfMatches) == string.charAt(currentIndex + lengthOfMatches)) {
                lengthOfMatches++;
            }

            if (lengthOfMatches == substring.length()) {
                var end = currentIndex + lengthOfMatches - 1;
                pair.add(currentIndex);
                pair.add(end);
                foundArray.add(pair);
            }
        }
        return foundArray;
    }
}
