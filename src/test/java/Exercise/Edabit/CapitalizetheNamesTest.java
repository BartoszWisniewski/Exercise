package Exercise.Edabit;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class CapitalizetheNamesTest {

    @Test
    public void capMeTest() {
        //given
        String[] s = {"ADAM", "kaROL", "miki"};

        //when
        String[] result = CapitalizetheNames.capMe(s);

        //Then
        assertThat(result).isEqualTo(new String[]{"Adam", "Karol", "Miki"});
    }
}