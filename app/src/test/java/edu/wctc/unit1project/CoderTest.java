package edu.wctc.unit1project;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;


/**
 * Class for testing
 */
public class CoderTest {
    /**
     * Testing for addDash() to make sure it returns correctly.
     * @throws Exception for exceptions..
     */
    @Test
    public void testAddDash() throws Exception{
        assertThat(Coder.addDash(""), is("-"));
    }

    /**
     * Testing for addDot() to make sure it returns correctly.
     * @throws Exception for exceptions..
     */
    @Test
    public void testAddDot() throws Exception{
        assertThat(Coder.addDot(""), is("."));
    }

    /**
     * Testing for addBreak() to make sure it returns correctly.
     * @throws Exception for exceptions..
     */
    @Test
    public void testAddBreak() throws Exception{
        assertThat(Coder.addBreak(".-"), is('a'));
        assertNotEquals(Coder.addBreak(".-"), is('b'));
        assertThat(Coder.addBreak(""), is(' '));
    }
}
