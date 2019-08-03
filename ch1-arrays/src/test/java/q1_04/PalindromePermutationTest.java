package q1_04;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class PalindromePermutationTest {


    @Test
    public void testPalindrome(){
        String input = "Tact Coa";
        assertThat(PalindromePermutation.check(input)).isTrue();
    }


    @Test
    public void testPalindromeFalse(){
        String input = "Tact CoaW";
        assertThat(PalindromePermutation.check(input)).isFalse();
    }
}
