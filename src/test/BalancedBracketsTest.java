package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void backwardsBracketsWithTextReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]some text["));
    }

    @Test
    public void nestedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[this[is a]test]"));
    }

    @Test
    public void singleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void emptyStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsWithTextInBetweenReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[some text]"));
    }

    @Test
    public void textContainingBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("some[text]"));
    }

    @Test
    public void textWithNoBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("some text"));
    }

    @Test
    public void multipleBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]watcha[know]about[]al[l]thatjazz[]"));
    }




}
