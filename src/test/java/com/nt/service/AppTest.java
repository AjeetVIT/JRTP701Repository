package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testWithPositives() 
    {
    	int a=10;
    	int b=20;
    	int expepected=30;
    	App app1=new App();
    	int actual=app1.sum(a, b);
    	assertEquals(expepected, actual);
        assertTrue(true);
    }
    @Test
    public void testWithNegatives() 
    {
    	int a=-10;
    	int b=-20;
    	int expepected=-30;
    	App app1=new App();
    	int actual=app1.sum(a, b);
    	assertEquals(expepected, actual);
        assertTrue(true);
}
    @Test
    public void testWithMixedValues() 
    {
    	int a=10;
    	int b=-20;
    	int expepected=-10;
    	App app1=new App();
    	int actual=app1.sum(a, b);
    	assertEquals(expepected, actual);
        assertTrue(true);
    }}
