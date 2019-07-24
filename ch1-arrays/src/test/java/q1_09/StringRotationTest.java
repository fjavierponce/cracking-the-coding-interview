package q1_09;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringRotationTest {

    @Test
    public void isRotation1() {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean isRotation = StringRotation.isRotation(s1, s2);
        assertThat(isRotation).isTrue();
    }

    @Test
    public void isRotation2() {
        String s1 = "francisco";
        String s2 = "franciscp";
        boolean isRotation = StringRotation.isRotation(s1, s2);
        assertThat(isRotation).isFalse();
    }

    @Test
    public void isRotation3() {
        String s1 = "franciscofrancisco";
        String s2 = "franciscoe";
        boolean isRotation = StringRotation.isRotation(s1, s2);
        assertThat(isRotation).isFalse();
    }
}
