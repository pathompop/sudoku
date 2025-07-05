public class sudoku1D {
    public static void main(String[] args) {
        int[] sudoku = {
                5,3,4, 6,7,8, 9,1,2,
                6,7,2, 1,9,5, 3,4,8,
                1,9,8, 3,4,2, 5,6,7,

                8,5,9, 7,6,1, 4,2,3,
                4,2,6, 8,5,3, 7,9,1,
                7,1,3, 9,2,4, 8,5,6,

                9,6,1, 5,3,7, 2,8,4,
                2,8,7, 4,1,9, 6,3,5,
                3,4,5, 2,8,6, 1,7,9
            };

            for (int i = 0; i < 9; i++) {
                int im9 = i * 9;
                int ip3 = i / 3;
                int imod3 = i % 3;
                for (int j = 0; j < 9; j++) {
                    int jm9 = j * 9;
                    int jp3 = j / 3;
                    int jmod3 = j % 3;

                    int i3 = ip3 * 3 + jp3;
                    int j3 = imod3 * 3 + jmod3;
                    System.out.print(sudoku[i3 * 9 + j3] + " ");
                }
                System.out.println();
            }
            
            // for (int i = 0; i < 9; i++) {
            //     int i3 = (i + ((i / 3) * 6)) * 3;
            //     System.out.println("p " + (i3+i)*3 + " = " + sudoku[i3]);
            // }
    }

    static boolean check(int[] sudoku) {
        for (int i = 0; i < 9; i++) {
                int im9 = i * 9;
                
                for (int j = 0; j < 9; j++) {
                    int jm9 = j * 9;

                    int row = sudoku[j+im9];
                    int col = sudoku[i+jm9];
                }
            }

        return true;
    }
    
}
