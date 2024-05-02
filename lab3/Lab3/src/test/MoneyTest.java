package test;

import static org.junit.Assert.*;
import main.IMoney;
import main.Money;

import org.junit.Test;

import junit.framework.TestCase;



/**
 * This is a trivial test which only tests the Money class.
 * If you modify the MoneyBag class, and run Clover with optimization, this test will not be run.
 */
public class MoneyTest extends TestCase {

    public void testAdd() throws InterruptedException {
        Money tenEuro = new Money(10, "EURO");
        assertEquals(10, tenEuro.amount());
        assertEquals("EURO", tenEuro.currency());
        System.out.println("Tests taking too long? Try Clover's test optimization.");
        Thread.sleep(3000);
    }
    
    public void testEqualAmount() {
        
        IMoney money1 = new Money(0, "CHF");
        IMoney money2 = new Money(0, "CHF");
        assertTrue(money1.equals(money2));
    }
    
    
}
