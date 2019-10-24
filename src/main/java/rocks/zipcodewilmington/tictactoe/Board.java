package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;

    public Board(Character[][] matrix) {

        this.board = matrix;
    }

    public Boolean isInFavorOfX() {

        return getWinner() == "X";
    }

    public Boolean isInFavorOfO() {
        return getWinner() == "O";
    }

    public Boolean isTie() {
        return getWinner() == "";
    }

    public String getWinner() {

        for (int i = 0; i < 3; i++) {
            //checking for rows
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {

                if (board[i][0] == 'X') {
                    return "X";
                } else if (board[i][0] == 'O') {
                    return "O";
                } else {
                    return "";
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            //checking for columns
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                if (board[0][i] == 'X') {
                    return "X";
                } else if (board[0][i] == 'O') {
                    return "O";
                } else {
                    return "";
                }
            }
        }

            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {

                if (board[0][0] == 'X') {
                    return "X";
                } else if (board[0][0] == 'O') {
                    return "O";
                } else {
                    return "";
                }
            }

            if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                if (board[0][2] == 'X') {
                    return "X";
                } else if (board[0][2] == 'O') {
                    return "O";
                } else {
                    return "";
                }
            }

        return "";

        }

    }



