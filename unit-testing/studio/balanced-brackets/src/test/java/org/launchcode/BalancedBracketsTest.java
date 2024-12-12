package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void isBalancedwithTwoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void isBalancedwithMultiBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void isFalsenot(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public static boolean hasBalancedBrackets(){
        assertTrue();
    }
}