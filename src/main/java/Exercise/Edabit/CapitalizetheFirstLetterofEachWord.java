package Exercise.Edabit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizetheFirstLetterofEachWord {
    public static void main(String[] args) {
        String a = "This is a title";
        System.out.println(makeTitle(a));
    }

    public static String makeTitle(String s) {
        List<String> list = Arrays.asList(s.split(" "));
        String result = list.stream().map(o -> o.substring(0, 1).toUpperCase() + o.substring(1)).collect(Collectors.joining(" "));
        return result;
    }
}
