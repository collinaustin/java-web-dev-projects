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
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void openBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void openBracketsReturnsFalse2() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void openBracketsReturnsFalse3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[L[aunchCode"));
    }

    @Test
    public void noBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[], ][, [][]"));
    }

    @Test
    public void closeBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void closeBracketsFalseOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }




}