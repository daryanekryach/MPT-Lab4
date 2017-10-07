package refactored;

public class MatrixOperations {
    public int[][] matrix;
    private int[][] newMatrix;
    public int matrixSize;

    public MatrixOperations(int[][] _matrix){
        matrix=_matrix;
        matrixSize = matrix.length;
        newMatrix = new int[matrixSize][matrixSize];
    }

    public int[][] getAfterNeg() {
        boolean isNegative;
        int newItem = 0;
        for (int i = 0; i < matrixSize; i++) {
            isNegative = false;
            for (int j = 0; j < matrixSize; j++) {
                if (matrix[i][j] < 0 && !isNegative) {
                    isNegative = true;
                    continue;
                }
                if (isNegative) newItem += matrix[i][j];
            }
            if (!isNegative) fillNewLine(i, 100);
            else fillNewLine(i, newItem);
            newItem = 0;
        }
        return newMatrix;
    }

    public int[][] getBeforeNeg() {
        boolean isNegative;
        int newItem = 0;
        for (int i = 0; i < matrixSize; i++) {
            isNegative = false;
            for (int j = matrixSize - 1; j >= 0; j--) {
                if (matrix[i][j] < 0 && !isNegative) {
                    isNegative = true;
                    continue;
                }
                if (isNegative) newItem += matrix[i][j];
            }
            if (!isNegative) fillNewLine(i, -1);
            else fillNewLine(i, newItem);
            newItem = 0;
        }
        return newMatrix;
    }

    private  void fillNewLine(int i, int newItem) {
        for (int j = 0; j < matrixSize; j++) {
            newMatrix[i][j] = newItem;
        }
    }
}
