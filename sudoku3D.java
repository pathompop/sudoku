public class sudoku3D {
    public static void main(String[] args) {
        int[][][] sudoku = {
            {{5,3,4},{6,7,2},{1,9,8}}, {{6,7,8},{1,9,5},{3,4,2}}, {{9,1,2},{3,4,8},{5,6,7}},
            {{8,5,9},{4,2,6},{7,1,3}}, {{7,6,1},{8,5,3},{9,2,4}}, {{4,2,3},{7,9,1},{8,5,6}},
            {{9,6,1},{2,8,7},{3,4,5}}, {{5,3,7},{4,1,9},{2,8,6}}, {{2,8,4},{6,3,5},{1,7,9}}
        };

        System.out.println(check(sudoku));
        
    }

    static boolean check(int[][][] sudoku) {
        for (int i = 0; i < 9; i++) {
            boolean[] fbox = new boolean[10];
            boolean[] frow = new boolean[10];
            boolean[] fcol = new boolean[10];

            int ip3 = i / 3;
            int imod3 = i % 3;
            for (int j = 0; j < 9; j++) {
                int jp3 = j / 3;
                int jmod3 = j % 3;
                int ipj = ip3*3 + jp3;
                int jpi = jp3*3 + ip3;

                int box = sudoku[i][jp3][jmod3];
                int row = sudoku[ipj][imod3][jmod3];
                int col = sudoku[jpi][jmod3][imod3];

                if (fbox[box] || frow[row] || fcol[col]) return false;

                fbox[box] = true;
                frow[row] = true;
                fcol[col] = true;
            }
        }

        return true;
    }

}
