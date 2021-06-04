import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;


public class ApplicationTest extends TestCase {


    public void testNotNumberB() {
        double a = 5;
        double c = 30;

        double[] actual = Application.notNumberB(a, c);
        double[] expected = new double[0];

        assertArrayEquals(expected, actual, 0.1);
    }

    public void testNotNumberB1() {
        double a = 4;
        double c = -9;

        double[] actual = Application.notNumberB(a, c);
        double[] expected = new double[]{1.5, -1.5};
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testNotNumberC() {
        double a = 1;
        double b = -7;

        double[] actual = Application.notNumberC(a, b);
        double[] expected = new double[]{0, 7};
        assertArrayEquals(expected, actual, 0.1);
    }


    public void testDiscriminant() {
        double a = 1;
        double b = -2;
        double c = -3;

        double actual = Application.discriminant(a, b, c);
        double expected = 16;
        assertEquals(actual, expected);
    }

    public void testTwoRoots() {
        double a = 1;
        double b = -2;
        double c = -3;
        double[] actual = Application.twoRoots(a, b, c);
        double[] expected = new double[]{3, -1};
        assertArrayEquals(expected, actual, 0.1);


    }

    public void testNoRoots() {
        double[] actual = Application.noRoots();
        double[] expected = new double[]{0};
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testOneRoot() {
        double a = 1;
        double b = 12;
        double c = 36;
        double[] actual = Application.oneRoot(a, b, c);
        double[] expected = new double[]{-6};

        assertArrayEquals(expected, actual, 0.1);
    }

    public void testArrayRoots_1() {
        double a = 4;
        double b = 0;
        double c = 0;
        double[] actual = Application.arrayRoots(a, b, c);
        double[] expected = Application.allNumbers(a, b, c);
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testAllNumbers_1() {
        double a = 1;
        double b = -2;
        double c = -3;
        double[] actual = Application.allNumbers(a, b, c);
        double[] expected = Application.twoRoots(a, b, c);
        assertArrayEquals(expected, actual, 0.1);

    }

    public void testAllNumbers_2() {
        double a = 5;
        double b = 3;
        double c = 7;
        double[] actual = Application.allNumbers(a, b, c);
        double[] expected = Application.noRoots();
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testAllNumbers_3() {
        double a = 1;
        double b = 12;
        double c = 36;
        double[] actual = Application.allNumbers(a, b, c);
        double[] expected = Application.oneRoot(a, b, c);
        assertArrayEquals(expected, actual, 0.1);
    }


    public void testArrayRoots_2() {
        double a = 4;
        double b = 0;
        double c = 0;
        double[] actual = Application.arrayRoots(4, 0, 0);
        double[] expected = new double[]{0};
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testArrayRoots_3() {
        double a = 1;
        double b = -7;
        double c = 0;
        double[] actual = Application.arrayRoots(4, 0, 0);
        double[] expected = Application.notNumberC(a, b);
        assertArrayEquals(expected, actual, 0.1);
    }

    public void testArrayRoots_4_B1() {
        double a = 4;
        double b = 0;
        double c = -9;
        double[] actual = Application.arrayRoots(a, b, c);
        double[] expected = Application.notNumberB1(a, c);

        assertArrayEquals(expected, actual, 0.1);
    }

    public void testArrayRoots_4_B() {
        double a = 5;
        double b = 0;
        double c = 30;
        double[] actual = Application.arrayRoots(a, b, c);
        double[] expected = Application.notNumberB(a, c);

        assertArrayEquals(expected, actual, 0.1);
    }


}