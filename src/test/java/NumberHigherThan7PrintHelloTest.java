import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberHigherThan7PrintHelloTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    private void testOutput(String input, String expectedOutput) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        NumberHigherThan7PrintHello.main(new String[]{});
        assertEquals(expectedOutput + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testNumberGreaterThan7() {
        testOutput("8", "Enter a number: Hello");
    }

    @Test
    void testNumberLessThan7() {
        testOutput("5", "Enter a number: The entered number is less than or equal to 7");
    }

    @Test
    void testInvalidInput() {
        testOutput("abc", "Enter a number: Incorrect values have been entered");
    }
}