package handleError;

import java.util.Scanner;

public class exceptionHandle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.print("masukan angka:");
            int angka1 = input.nextInt();
            System.out.println(" angka yang dimasukan adalah : " + angka1);


        } catch (Exception e) {
            System.out.println(" jangan masukan string!!!");

        }

        System.out.println(" anda masukan integer !!!");
    }
}