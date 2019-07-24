package q1_03;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class URLifyTest {

    // Write a method to replace all spaces in a string with '%20'
    // Assume there is enough space to hold extra characters.
    // Use char array
    @Test
    public void firstURLifyTest() {
        char[] input = {'M','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' '};
        char[] expected = {'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
        assertThat(URLify.execute(input, 13)).isEqualTo(expected);
    }


    // Write a method to replace all spaces in a string with '%20'
    // Assume there is enough space to hold extra characters.
    // Use char array
    @Test
    public void secondURLifyTest() {
        char[] input = {' ','r',' ','J','o','h','n',' ','S','m','i','t','h',' ',' ',' ',' ',' ',' '};
        char[] expected = {'%','2','0','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
        assertThat(URLify.execute(input, 13)).isEqualTo(expected);
    }
}
