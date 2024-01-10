import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DigitizeTests {
    // This is a test method for the digitize method in the Main class
    @Test
    public void tests() {
        // Here we are testing the digitize method with the number 35231
        // We expect the output to be an array with the digits in reverse order
        assertArrayEquals(new int[] {1,3,2,5,3}, Main.digitize(35231));
        // Advanced tests with more cases
       /* assertArrayEquals(new int[] {7,5,3,2,8,5,3,2}, Main.digitize(23582357));
        assertArrayEquals(new int[] {8,3,7,4,6,7,4,8,9}, Main.digitize(984764738));
        assertArrayEquals(new int[] {0,2,9,3,9,8,2,6,7,5,4},  Main.digitize(45762893920L));
        assertArrayEquals(new int[] {4,9,3,8,3,8,2,0,7,8,4,5}, Main.digitize(548702838394L));*/

        // Here we are testing the digitize method with the number 0
        // We expect the output to be an array with a single element 0
        assertArrayEquals(new int[] {0}, Main.digitize(0));
    }
}