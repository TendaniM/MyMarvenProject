package com.wipro.mavFirstProj;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
@Test
public void testAdd() {
assertEquals(5, new App().add(2,3));
}

@Test
public void testSub() {
assertEquals(5, new App().sub(10,5));
}
}
