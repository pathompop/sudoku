public class sudoku4D {

        public static void main(String[] args) {
        int[][][][] sudoku = {{ 
                {{ 5, 3, 4 },
                { 6, 7, 2 },
                { 1, 9, 8 }},
                {{ 6, 7, 8 },
                { 1, 9, 5 },
                { 3, 4, 2 }},
                {{ 9, 1, 2 },
                { 3, 4, 8 },
                { 5, 6, 7 }}},

                {{{ 8, 5, 9 },
                { 4, 2, 6 },
                { 7, 1, 3 }},
                {{ 7, 6, 1 },
                { 8, 5, 3 },
                { 9, 2, 4 }},
                {{ 4, 2, 3 },
                { 7, 9, 1 },
                { 8, 5, 6 }}},

                {{{ 9, 6, 1 },
                { 2, 8, 7 },
                { 3, 4, 5 }},
                {{ 5, 3, 7 },
                { 4, 1, 9 },
                { 2, 8, 6 }},
                {{ 2, 8, 4 },
                { 6, 3, 5 },
                { 1, 7, 9 }}}
        };

        System.out.println(check(sudoku));

        }

        static boolean check(int[][][][] sudoku) {
                
                //ตรวจกล่อง
                for (int i = 0; i < 9; i++) {
                        boolean[] f = new boolean[10];
                        int boxrow = i % 3;
                        int boxcol = i / 3;
                        for (int j = 0; j < 9; j++) {
                                int cellrow = j % 3;
                                int cellcol = j / 3;
                                int nums = sudoku[boxcol][boxrow][cellcol][cellrow];
                                if (nums < 1 || nums > 9 || f[nums]) return false;
                                f[nums] = true;
                        }
                }

                //ตรวจแนวนอน
                for (int i = 0; i < 9; i++) {
                        boolean[] f = new boolean[10];
                        int boxrow = i % 3;
                        int boxcol = i / 3;
                        for (int j = 0; j < 9; j++) {
                                int cellrow = j % 3;
                                int cellcol = j / 3;
                                int nums = sudoku[boxcol][cellcol][boxrow][cellrow];
                                if (nums < 1 || nums > 9 || f[nums]) return false;
                                f[nums] = true;
                        }
                }

                //ตรวจแนวตั้ง
                for (int i = 0; i < 9; i++) {
                        boolean[] f = new boolean[10];
                        int boxrow = i % 3;
                        int boxcol = i / 3;
                        for (int j = 0; j < 9; j++) {
                                int cellrow = j % 3;
                                int cellcol = j / 3;
                                int nums = sudoku[cellcol][boxcol][cellrow][boxrow];
                                if (nums < 1 || nums > 9 || f[nums]) return false;
                                f[nums] = true;
                        }
                }

                return true;
        }
}