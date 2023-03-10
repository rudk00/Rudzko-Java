import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;


public class OutputOfArrayElementsMultiplesOfThreeTest {

    @Test
    void testArrayHasMultiplesOfThree() {
        String input = "5\n3\n5\n6\n9\n12\n";
        String expectedOutput = "Enter the size of the array: Enter the array elements:" + System.lineSeparator() +
                "Array elements, multiples of 3:" + System.lineSeparator() +
                "3" + System.lineSeparator() +
                "6" + System.lineSeparator() +
                "9" + System.lineSeparator() +
                "12" + System.lineSeparator();
        assertEquals(expectedOutput, getOutputFromMainMethod(input));
    }

    @Test
    void testArrayHasNoMultiplesOfThree() {
        String input = "4\n2\n4\n8\n11\n";
        String expectedOutput = "Enter the size of the array: Enter the array elements:" + System.lineSeparator() +
                "Array elements, multiples of 3:" + System.lineSeparator() +
                "There are no elements in the array that are multiples of 3" + System.lineSeparator();
        assertEquals(expectedOutput, getOutputFromMainMethod(input));
    }

    @Test
    void testIncorrectInput() {
        String input = "abc\n";
        String expectedOutput = "Enter the size of the array: Incorrect values have been entered" + System.lineSeparator();
        assertEquals(expectedOutput, getOutputFromMainMethod(input));
    }

    private String getOutputFromMainMethod(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        final InputStream originalIn = System.in;
        final var outContent = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(outContent));
            OutputOfArrayElementsMultiplesOfThree.main(new String[]{});
        } finally {
            System.setIn(originalIn);
            System.setOut(System.out);
        }
        return outContent.toString();
    }

}