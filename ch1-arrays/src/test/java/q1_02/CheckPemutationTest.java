package q1_02;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class CheckPemutationTest {

    @Test
    public void checkPermutationTrue() {
        String string1 = "francisco";
        String string2 = "ocsicnarf";
        assertThat(CheckPermutaion.checkUsingSort(string1, string2)).isTrue();
        assertThat(CheckPermutaion.checkUsingHashTable(string1, string2)).isTrue();
    }

    @Test
    public void checkPermutationFalse() {
        String string1 = "francisco";
        String string2 = "ocsicna9rf";
        assertThat(CheckPermutaion.checkUsingSort(string1, string2)).isFalse();
        assertThat(CheckPermutaion.checkUsingHashTable(string1, string2)).isFalse();
    }

}
