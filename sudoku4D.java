public class sudoku4D {

        public static void main(String[] args) {
        int[][][][] sudoku = {{
                {{ 5, 3, 4 },{ 6, 7, 2 },{ 1, 9, 8 }},
                {{ 6, 7, 8 },{ 1, 9, 5 },{ 3, 4, 2 }},
                {{ 9, 1, 2 },{ 3, 4, 8 },{ 5, 6, 7 }}},

                {{{ 8, 5, 9 },{ 4, 2, 6 },{ 7, 1, 3 }},
                {{ 7, 6, 1 },{ 8, 5, 3 },{ 9, 2, 4 }},
                {{ 4, 2, 3 },{ 7, 9, 1 },{ 8, 5, 6 }}},

                {{{ 9, 6, 1 },{ 2, 8, 7 },{ 3, 4, 5 }},
                {{ 5, 3, 7 },{ 4, 1, 9 },{ 2, 8, 6 }},
                {{ 2, 8, 4 },{ 6, 3, 5 },{ 1, 7, 9 }}}
        };

        System.out.println(check(sudoku));

        }

        static boolean check(int[][][][] sudoku) {
                
                for (int i = 0; i < 9; i++) {
                        boolean[] fbox = new boolean[10];
                        boolean[] frow = new boolean[10];
                        boolean[] fcol = new boolean[10];

                        int imod3 = i % 3;
                        int id3 = i / 3;

                        for (int j = 0; j < 9; j++) {
                                int jmod3 = j % 3;
                                int jd3 = j / 3;

                                int box = sudoku[id3][imod3][jd3][jmod3];       //เช็คกล่อง
                                int row = sudoku[id3][jd3][imod3][jmod3];       //เช็คแนวนอน
                                int col = sudoku[jd3][id3][jmod3][imod3];       //เช็คแนวตั้ง

                                if (fbox[box] || frow[row] || fcol[col]) return false;

                                fbox[box] = true;
                                frow[row] = true;
                                fcol[col] = true;
                        }
                }

                return true;
        }
}