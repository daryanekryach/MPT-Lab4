package testings;

import org.junit.*;
import static org.junit.Assert.*;
import refactored.MatrixOperations;

public class MatrixOperationsTest {
    private MatrixOperations matrixOperations;

    @Before
    public void init() {
        int[][] matrixToOperate = new int[][]{
                {4, -3, 0, 5},
                {-1, 5, 8, -4},
                {4, 7, 1, 0},
                {-6, -5, -3, -2}
        };

        matrixOperations = new MatrixOperations(matrixToOperate);
    }

    //region Input tests
    @Test
    public void checkNullMatrix() {
        assertNotNull(matrixOperations.matrix);
    }

    @Test
    public void checkOneItemMatrix() {
        assertFalse(matrixOperations.matrixSize == 1);
    }
    //endregion

    //region Operations test
    @Test
    public void afterNegTest() {
        int[][] expected = new int[][]{
                {5, 5, 5, 5},
                {9, 9, 9, 9},
                {100, 100, 100, 100},
                {-10, -10, -10, -10}
        };
        int[][] actual = matrixOperations.getAfterNeg();
        assertEquals(expected, actual);
    }

    @Test
    public void beforeNegTest() {
        int[][] expected = new int[][]{
                {4, 4, 4, 4},
                {12, 12, 12, 12},
                {-1, -1, -1, -1},
                {-14, -14, -14, -14}
        };
        int[][] actual = matrixOperations.getBeforeNeg();
        assertEquals(expected, actual);
    }
    //endregion
}
