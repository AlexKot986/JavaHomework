
// import java.util.LinkedHashSet;
// import java.util.Random;
// import LinkedHashSet;
import java.util.*;
// import java.util.stream.Collectors;

public class Home2_task4 {
    public static void main(String[] args) {

        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        char[][] board2 = {
                { '7', '8', '2', '6', '1', '.', '9', '.', '5' },
                { '5', '6', '.', '9', '4', '2', '8', '.', '3' },
                { '.', '.', '.', '.', '.', '7', '2', '.', '1' },
                { '.', '7', '6', '4', '.', '5', '.', '.', '.' },
                { '3', '.', '.', '.', '.', '.', '.', '2', '.' },
                { '.', '.', '.', '3', '6', '.', '5', '.', '.' },
                { '6', '1', '.', '.', '.', '.', '7', '9', '.' },
                { '.', '2', '3', '.', '9', '.', '.', '5', '.' },
                { '.', '.', '.', '.', '.', '4', '6', '.', '.' }
        };

        PrintBoard(board);
        System.out.println();
        PrintBoard(ValidSudoku(board));
       
    }

    public static char[][] ValidSudoku(char[][] board) {

        boolean flag = true;
        int outSudoku = 81;
        while (flag) {

            int count = 0;
            char chElement = ' ';
            String res = "";
            for (int i = 0; i < 9; i++) {

                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        continue;
                    } else {
                        String str1 = "";
                        String str2 = "";

                        for (int k = 0; k < 9; k++) {
                            str1 += board[i][k];
                            str2 += board[k][j];
                        }

                        String str3 = "";

                        if ((i >= 0 & i <= 2) & (j >= 0 & j <= 2)) {
                            for (int n = 0; n <= 2; n++) {
                                for (int m = 0; m <= 2; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 3 & i <= 5) & (j >= 0 & j <= 2)) {
                            for (int n = 3; n <= 5; n++) {
                                for (int m = 0; m <= 2; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 6 & i <= 8) & (j >= 0 & j <= 2)) {
                            for (int n = 6; n <= 8; n++) {
                                for (int m = 0; m <= 2; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 0 & i <= 2) & (j >= 3 & j <= 5)) {
                            for (int n = 0; n <= 2; n++) {
                                for (int m = 3; m <= 5; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 3 & i <= 5) & (j >= 3 & j <= 5)) {
                            for (int n = 3; n <= 5; n++) {
                                for (int m = 3; m <= 5; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 6 & i <= 8) & (j >= 3 & j <= 5)) {
                            for (int n = 6; n <= 8; n++) {
                                for (int m = 3; m <= 5; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 0 & i <= 2) & (j >= 6 & j <= 8)) {
                            for (int n = 0; n <= 2; n++) {
                                for (int m = 6; m <= 8; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 3 & i <= 5) & (j >= 6 & j <= 8)) {
                            for (int n = 3; n <= 5; n++) {
                                for (int m = 6; m <= 8; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        } else if ((i >= 6 & i <= 8) & (j >= 6 & j <= 8)) {
                            for (int n = 6; n <= 8; n++) {
                                for (int m = 6; m <= 8; m++) {
                                    str3 += board[n][m];
                                }
                            }
                        }
                        // System.out.println(str1 + " " + str2 + " " + str3);
                        // System.out.println();
                        for (int item = 1; item < 10; item++) {
                            String s = "";
                            s += item;
                            // System.out.println(s);
                            if (str1.contains(s) || str2.contains(s) || str3.contains(s)) {
                                continue;
                            } else {
                                chElement = (char) (item + 48);
                                count++;
                                if (count > 1) {
                                    count = 0;
                                    break;
                                }
                            }
                        }
                        if (count == 1) {
                            count = 0;
                            board[i][j] = chElement;
                        } else {
                            count = 0;
                        }
                    }
                }
            }
            int isOut = 0;
            for (int a = 0; a < 9; a++) {
                for (int b = 0; b < 9; b++) {
                    res += board[a][b];
                    if (board[a][b] == '.') {
                        isOut++;
                    }
                }
            }
            if (!res.contains(".")) {
                flag = false;
                System.out.println("УРА!!!");
            }
            if (outSudoku == isOut) {
                flag = false;
                System.out.println("Слишком сложно :-( ");
            }
            outSudoku = isOut;
        }
        return board;
    }

    public static void PrintBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
