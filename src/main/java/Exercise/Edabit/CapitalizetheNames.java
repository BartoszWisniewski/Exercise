package Exercise.Edabit;

import java.util.Arrays;

public class CapitalizetheNames {
    public static void main(String[] args) {
        String[] s = {"samuel", "MABELLE", "letitia", "meridith"};
        System.out.println(Arrays.toString(capMe(s)));
    }

    public static String[] capMe(String[] s) {
        String[] result = Arrays.stream(s).map(o -> o.substring(0, 1).toUpperCase() + o.substring(1).toLowerCase()).toArray(String[]::new);
        return result;
    }
}
