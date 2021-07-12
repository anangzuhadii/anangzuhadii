package Com.Latihan;

import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" put Number (1-6) : ");
        int masukan = input.nextInt();


        char[][] BoardGame = {{' ', '|', ' ', '|'},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|'},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|'},};

        Kelasbaru dua = new Kelasbaru();
        BoardGame = dua.cobaGanti(BoardGame, masukan, "player");
        BoardGame = dua.cobaGanti(BoardGame, masukan, "Cpu");

        dua.ForBoard(BoardGame);

    }


}