package q1_01;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


/**
 * 1.1 Is Unique: Implement an
 */
public class IsUniqueTest {

    @Test
    public void isUniqueV1_shouldReturnFalse() {
        String test = "hello12";
        boolean resultV1 = IsUnique.checkV1(test);
        //boolean resultV2 = IsUnique.checkV2(test);
        assertThat(resultV1).isFalse();
        //assertThat(resultV2).isFalse();
    }

    @Test
    public void isUniqueV1_shouldReturnTrue() {
        String test = "amigo123456789";
        boolean resultV1 = IsUnique.checkV1(test);
        //boolean resultV2 = IsUnique.checkV2(test);
        assertThat(resultV1).isTrue();
        //assertThat(resultV2).isTrue();
    }
}
