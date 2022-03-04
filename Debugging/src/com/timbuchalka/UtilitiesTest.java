package com.timbuchalka;

import org.junit.BeforeClass;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by timbuchalka on 28/11/16.
 */
public class UtilitiesTest {

    private static Utilities util;

    @BeforeClass
    public static void setUp() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() throws Exception {
//        Utilities utils = new Utilities();
        char[] output = util.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] { 'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.Test
    public void removePairs() throws Exception {
//        Utilities util = new Utilities();
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));

    }

    @org.junit.Test
    public void converter_001() throws Exception {
         util = new Utilities();
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_002() throws Exception {
        new Utilities().converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() throws Exception {
//        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }

}