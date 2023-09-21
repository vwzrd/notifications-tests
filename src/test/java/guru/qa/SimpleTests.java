package guru.qa;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {

    @Test
    void failedTest1() {assertTrue(false); }
    @Test
    void failedTest2() {assertTrue(false); }
    @Test
    void failedTest3() {assertTrue(false); }
    @Test
    void failedTest4() {assertTrue(false); }

    @Test
    void passedTest1() {assertTrue(true); }
    @Test
    void passedTest2() {assertTrue(true); }
    @Test
    void passedTest3() {assertTrue(true); }
    @Test
    void passedTest4() {assertTrue(true); }

    @Test
    @Disabled
    void skippedTest1() {assertTrue(true); }
    @Test
    @Disabled
    void skippedTest2() {assertTrue(true); }
    @Test
    @Disabled
    void skippedTest3() {assertTrue(true); }
    @Test
    @Disabled
    void skippedTest4() {assertTrue(true); }
}
