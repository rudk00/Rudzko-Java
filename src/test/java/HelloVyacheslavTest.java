import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloVyacheslavTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    private void testOutput(String input, String expectedOutput) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        HelloVyacheslav.main(new String[]{});
        assertEquals(expectedOutput + System.lineSeparator(), outContent.toString());
    }

    @Test
    void testSuccess() {
        testOutput("Vyacheslav", "Enter a name: Hello, Vyacheslav");
    }

    @Test
    void testThereIsNoSuchName() {
        testOutput("Eugene", "Enter a name: There is no such name");
    }

    @Test
    void testDifferentCase() {
        testOutput("VyAcHeSlaV", "Enter a name: Hello, Vyacheslav");
    }
}