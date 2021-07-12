package Com.Latihan;

public class Kelasbaru {

    public void ForBoard(char[][] BoardGame) {

        for (char[] Same : BoardGame) {

            for (char A : Same) {

                System.out.print(A);
            }

            System.out.println();
        }
    }

    public char[][] cobaGanti(char[][] BoardGame, int masukan, String user) {
        char simbol = ' ';

        if (user.equalsIgnoreCase("player")) {

            simbol = 'S';

        } else if (user.equalsIgnoreCase("Cpu")) {

            simbol = 'O';

        } else {

            System.out.println("sorry not found");
        }


        switch (masukan) {

            case 1:
                BoardGame[0][0] = simbol;
                break;

            case 2:
                BoardGame[0][2] = simbol;
                break;

            case 3:
                BoardGame[2][0] = simbol;
                break;

            case 4:
                BoardGame[2][2] = simbol;
                break;

            case 5:
                BoardGame[4][0] = simbol;
                break;

            case 6:
                BoardGame[4][2] = simbol;
                break;
            default:
                break;
        }
        return BoardGame;
    }


}
