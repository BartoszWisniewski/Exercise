package Exercise.Edabit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizetheFirstLetterofEachWordTest {

    @Test
    public void firstTest() {
        //given
        String a = "the first letter of every word is capitalized";

        //when
        String result = CapitalizetheFirstLetterofEachWord.makeTitle(a);

        //Then
        assertTrue(result.equals("The First Letter Of Every Word Is Capitalized"));
    }
}