package q1_06;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class StringCompressionTest {

    @Test
    public void compressString1(){
        String toCompress = "aaaabbgeeeetHnnnjjjjjjjjjjj";
        String expected = "a4b2g1e4t1H1n3j11";
        String result = StringCompression.compress(toCompress);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void compressString2(){
        String toCompress = "abcd";
        String expected = "abcd";
        String result = StringCompression.compress(toCompress);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void compressString3(){
        String toCompress = "a";
        String expected = "a";
        String result = StringCompression.compress(toCompress);
        assertThat(result).isEqualTo(expected);
    }


    @Test
    public void compressString4(){
        String toCompress = "abcdefghijkooooo";
        String expected = "abcdefghijkooooo";
        String result = StringCompression.compress(toCompress);
        assertThat(result).isEqualTo(expected);
    }
}