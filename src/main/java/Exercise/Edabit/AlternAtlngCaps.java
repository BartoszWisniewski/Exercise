package Exercise.Edabit;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlternAtlngCaps {
    public static void main(String[] args) {
        String s = "OMG!!! This website is awesome!!";
        System.out.println(alternatingCaps(s));
    }

    public static String alternatingCaps(String s) {
        String[] stringArray = s.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (i % 2 == 0) {
                stringArray[i] = stringArray[i].toUpperCase();
            } else {
                stringArray[i] = stringArray[i].toLowerCase();
            }
        }
        String result = Arrays.stream(stringArray).collect(Collectors.joining());
        return result;
    }
}
