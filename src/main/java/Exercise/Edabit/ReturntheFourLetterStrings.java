package Exercise.Edabit;

import java.util.Arrays;

public class ReturntheFourLetterStrings {
    public static void main(String[] args) {
        String[] s = {"Ryan", "Kieran", "Jason", "Matt"};
        String result = Arrays.toString(isFourLetters(s));
        System.out.println(result);

    }

    public static String[] isFourLetters(String[] s) {
        //My solution
      /*  int b =0;
        for (String i:s) {
            if(i.length() ==4){
                b++;
            }
        }
        String[] result = new String[b];
        int a = 0;
        for (String i : s) {
            if (i.length() == 4) {
                result[a] = (i);
                a++;
            }
        }
        return result;*/

        //other solution
        return Arrays.stream(s).filter(o -> o.length() == 4).toArray(String[]::new);
    }
}
