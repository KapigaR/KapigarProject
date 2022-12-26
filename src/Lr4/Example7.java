package Lr4;

public class Example7 {

    public static void main(String[] args) {

        int row = 5;
        int column = 5;
        int track = 1;
        int [][] snake = new int[row][column];

        for (int i = 0; i<column;i++){
            snake[0][i] = track;
            track++;
        }
        for (int j = 1; j < row; j++) {
            snake[j][row - 1] = track;
            track++;
        }
        for (int i = column - 2; i >= 0; i--) {
            snake[column - 1][i] = track;
            track++;
        }
        for (int j = row - 2; j > 0; j--) {
            snake[j][0] = track;
            track++;
        }

        int rowIn = 1;
        int columnIn = 1;

        while (track < row * column) {

            while (snake[rowIn][columnIn + 1] == 0) {
                snake[rowIn][columnIn] = track;
                track++;
                columnIn++;
            }

            while (snake[rowIn + 1][columnIn] == 0) {
                snake[rowIn][columnIn] = track;
                track++;
                rowIn++;
            }

            while (snake[rowIn][columnIn - 1] == 0) {
                snake[rowIn][columnIn] = track;
                track++;
                columnIn--;
            }

            while (snake[rowIn - 1][columnIn] == 0) {
                snake[rowIn][columnIn] = track;
                track++;
                rowIn--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (snake[i][j] == 0) {
                    snake[i][j] = track;
                }
            }
        }

        for (int i=0;i < snake.length;i++,System.out.println()) {
            for (int j = 0; j < snake[i].length; j++) {
                System.out.print(snake[i][j] + "\t");
            }
        }
    }
}
