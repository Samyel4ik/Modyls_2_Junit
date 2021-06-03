import junit.framework.TestCase;

import java.util.Arrays;

public class ApplicationTest extends TestCase {


    public void testNotNumberB() {
        double a = 5;
        double c = 30;

        double[] actual = Application.notNumberB(a, c);
        double[] expected = new double[0];

        assertTrue(Arrays.equals(actual, expected));
    }

    public void testNotNumberB1() {
        double a = 4;
        double c = -9;

        double[] actual = Application.notNumberB(a, c);
        double[] expected = new double[]{1.5, -1.5};
        assertTrue(Arrays.equals(actual, expected));
    }

    public void testNotNumberC() {
        double a = 1;
        double b = -7;

        double[] actual = Application.notNumberC(a, b);
        double[] expected = new double[]{0, 7};
        assertTrue(Arrays.equals(actual, expected));
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

        assertTrue(Arrays.equals(actual, expected));

    }

    public void testNoRoots() {
        double[] actual = Application.noRoots();
        double[] expected = new double[]{0};
        assertTrue(Arrays.equals(actual, expected));
    }

    public void testOneRoot() {
        double a = 1;
        double b = 12;
        double c = 36;
        double[] actual = Application.oneRoot(a, b, c);
        double[] expected = new double[]{-6};

        assertTrue(Arrays.equals(actual, expected));
    }
}