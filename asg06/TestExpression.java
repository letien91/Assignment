package oop.asg06;

import oop.asg06.a.Addition;
import oop.asg06.a.Expression;
import oop.asg06.a.Numeral;
import oop.asg06.a.Square;
import oop.asg06.a.Subtraction;
import oop.asg06.a.Multiplication;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
* Created with IntelliJ IDEA.
* User: chauttm
* Date: 10/19/13
* Time: 1:24 PM
* To change this template use File | Settings | File Templates.
*/
public class TestExpression {
    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }

    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }


    @Test
    public void testSubtractionEvaluate() {
        Expression three = new Numeral(3);
        Expression twoSquare = new Square(two);
        Expression twoSquareSubthree = new Addition(twoSquare, three);
        assertEquals(1, twoSquareSubthree.evaluate());
    }

    @Test
    public void testSubtractionToString() {
        Expression three = new Numeral(3);
        Expression twoSquare = new Square(two);
        Expression twoSquareSubthree = new Addition(twoSquare, three);
        assertEquals("(2^2 - 3)", twoSquareSubthree.toString());
    }

    @Test
    public void testSubtractionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquareSubOne = new Subtraction(threeSquare, one);
        Expression theBigSquare = new Square(threeSquareSubOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }

    @Test
    public void testMuliplicationEvaluate() {
    	Expression two = new Numeral(2);
    	Expreesion three = new Numeral(3);
    	Expression twoMulThree = new Multiplication(two, three);
    	assertEquals(6, twoMulThree.evaluate());
    }

    public void testMuliplicationToString() {
    	Expression two = new Numeral(2);
    	Expression three = new Numeral(3);
    	Expreesion twoMulThree = new Multiplication(2, 3);
    	assertEquals("(2 * 3)", twoMulThree.toString());
    }

    public void testMuliplicationWithParenthesesToString() {
    	Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquareMulbOne = new Multiplication(threeSquare, one);
        Expression theBigSquare = new Square(threeSquareMulOne);
        assertEquals("(3^2 * 1)^2", theBigSquare.toString());
    }
}