package Exercise.Edabit;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ReturntheFourLetterStringsTest {

    @Test
    public void firstTest() {
        //given
        String[] str = {"Adam", "Ewa", "Karol", "Martyna", "Ania"};

        //when
        String[] result = ReturntheFourLetterStrings.isFourLetters(str);

        //then
        //assertThat(result).contains("Adam", "Ania");
        assertThat(result).isEqualTo(new String[]{"Adam", "Ania"});
    }
}