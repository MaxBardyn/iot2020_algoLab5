package lab5;

import java.util.ArrayList;

public class Algorithm {


    static ArrayList<ArrayList<Integer>> naiveAlgorithm(String string, String substring) {

        ArrayList<ArrayList<Integer>> foundArray = new ArrayList<>();

        for (int currentIndex = 0; currentIndex < string.length(); currentIndex++) {

            ArrayList<Integer> pair = new ArrayList<>();
            int lengthOfMatches = 0;
            while (lengthOfMatches < substring.length() && currentIndex + lengthOfMatches < string.length() && substring.charAt(lengthOfMatches) == string.charAt(currentIndex + lengthOfMatches)) {
                lengthOfMatches++;
            }

            if (lengthOfMatches == substring.length()) {
                int end = currentIndex + lengthOfMatches - 1;
                pair.add(currentIndex);
                pair.add(end);
                foundArray.add(pair);
            }
        }
        return foundArray;
    }
}
