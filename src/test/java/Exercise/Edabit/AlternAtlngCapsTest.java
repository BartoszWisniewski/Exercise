package Exercise.Edabit;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternAtlngCapsTest {

    @Test
    public void firstTest() {
        //given
        String s = "valid data";

        //when
        String result = AlternAtlngCaps.alternatingCaps(s);

        //Then
        assertTrue(result.equals("VaLiD DaTa"));
    }

}