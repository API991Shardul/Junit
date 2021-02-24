public class Matrix{
     static int[][] multiply(int mat1[][],
                         int mat2[][])
    {
        int i, j, k;
        int res[][]=new int[2][2];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                res[i][j] = 0;
                for (k = 0; k < 2; k++)
                    res[i][j] += mat1[i][k]
                                 * mat2[k][j];
            }
        }
        return res;
    }
}
