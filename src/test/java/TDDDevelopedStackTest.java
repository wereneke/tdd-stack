import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class TDDDevelopedStackTest {

    TDDDevelopedStack testStack;

    @BeforeEach
    void setUp() throws Exception {
        this.testStack = new TDDDevelopedStack(3);
    }

    @Test
    void testConstructorTDDDevelopedStack() throws Exception {
        TDDDevelopedStack stack = new TDDDevelopedStack(1);
    }

    @Test
    void testIfConstructorThrowsExceptionOnNegativeAndZeroCapacity() {
        assertThrows(Exception.class, ()-> new TDDDevelopedStack(-1));
        assertThrows(Exception.class, ()-> new TDDDevelopedStack(0));
    }

    @Test
    void testIfCapacityGivenToConstructorSets() {
        assertEquals(3, testStack.getCapacity());
    }

    @Test
    @Disabled
    void testIfConstructorCreatesArrayContainer() {
        assertEquals(Array.class, testStack.stack.getClass());
    }

    @Test
    void testPushAddsFirstAnElement() {
        testStack.push("integral");
    }

    @Test
    void

}