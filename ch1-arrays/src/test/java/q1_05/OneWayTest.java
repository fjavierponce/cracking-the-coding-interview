package q1_05;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class OneWayTest {

    @Test
    public void removeCharacterTrue(){
        String input = "pale";
        String output = "ple";
        assertThat(OneWay.checkEdit(input, output)).isTrue();
    }

    @Test
    public void removeCharacterTrue1(){
        String input = "a";
        String output = "";
        assertThat(OneWay.checkEdit(input, output)).isTrue();
    }

    @Test
    public void removeCharacterFalse1(){
        String input = "ab";
        String output = "c";
        assertThat(OneWay.checkEdit(input, output)).isFalse();
    }

    @Test
    public void addCharacterTrue(){
        String input = "pales";
        String output = "pale";
        assertThat(OneWay.checkEdit(input, output)).isTrue();
    }

    @Test
    public void addCharacterFalse1(){
        String input = "pawles";
        String output = "pale";
        assertThat(OneWay.checkEdit(input, output)).isFalse();
    }

    @Test
    public void addCharacterTrue2(){
        String input = "";
        String output = "q";
        assertThat(OneWay.checkEdit(input, output)).isTrue();
    }

    @Test
    public void replaceCharacterTrue(){
        String input = "pale";
        String output = "bale";
        assertThat(OneWay.checkEdit(input, output)).isTrue();
    }
}
