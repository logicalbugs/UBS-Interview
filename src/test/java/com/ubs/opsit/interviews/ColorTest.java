package com.ubs.opsit.interviews;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ubs.opsit.interviews.entity.Color;

public class ColorTest {
    @Test
    public void testRed() {
	assertEquals("R", Color.RED.toString());
    }

    @Test
    public void testYellow() {
	assertEquals("Y", Color.YELLOW.toString());
    }
}
