package Exercise.Edabit;
//todo
public class AreLettersInTheSecondStringPresentintheFirstString {
    public static void main(String[] args) {
        String[] s = {"compadres", "DRAPES"};
        System.out.println(letterCheck(s));
    }

    public static boolean letterCheck(String[] s) {
        String first = s[1].toLowerCase();
        String second = s[0].toLowerCase();


        char[] firstA = s[0].toLowerCase().toCharArray();
        char[] secondA = s[1].toLowerCase().toCharArray();

        if (first.matches(second)){
            return true;
        }else
            return false;


       /* for (char a:secondA) {
            for (char b:firstA) {
                if (a != b){
                    return false;
                }
            }

        }
return true;*/
    }
}
