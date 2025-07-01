public class sudoku2D {
    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4,  6, 7, 8,  9, 1, 2},
                {6, 7, 2,  1, 9, 5,  3, 4, 8},
                {1, 9, 8,  3, 4, 2,  5, 6, 7},
                
                {8, 5, 9,  7, 6, 1,  4, 2, 3},
                {4, 2, 6,  8, 5, 3,  7, 9, 1},
                {7, 1, 3,  9, 2, 4,  8, 5, 6},
                
                {9, 6, 1,  5, 3, 7,  2, 8, 4},
                {2, 8, 7,  4, 1, 9,  6, 3, 5},
                {3, 4, 5,  2, 8, 6,  1, 7, 9}
            };

            System.out.println(check(sudoku));
    }

    static boolean check(int[][] sudoku) {

        for (int i = 0; i < 9; i++) {
            boolean[] fbox = new boolean[10];
            boolean[] frow = new boolean[10];
            boolean[] fcol = new boolean[10];

                for (int j = 0; j < 9; j++) {
                    int a = (i/3)*3+(j/3);  //ให้แต่ละลูปของ i เพื่มขึ้นทีละ 3
                    int b = (i%3)*3+(j%3);  //ให้แต่ละลูปของ j เพื่มขึ้นที่ละ 3
                    int box = sudoku[a][b]; //ตรวจกล่อง
                    int row = sudoku[i][j]; //ตรวจแนวนอน
                    int col = sudoku[j][i]; //ตรวจแนวตั้ง

                    if (fbox[box] || frow[row] || fcol[col]) return false;

                    fbox[box] = true;
                    frow[row] = true;
                    fcol[col] = true;
                }
            }

        return true;
    }

}
