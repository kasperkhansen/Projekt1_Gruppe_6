// Husk at skrive til de andre før man pusher

import java.util.ArrayList;//----------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Goddag, hvilken handling ønsker du?");
        System.out.println();
        System.out.println("Tast 1 for oprettelse af aftale");
        System.out.println("Tast 2 for Ændring af aftale");
        System.out.println("Tast 3 for at slette aftale");
        System.out.println("Tast 4 for at se ledige tider");
        System.out.println("Tast 5 for at se tid og salgs historik");

        Scanner scanner = new Scanner(System.in);
        int indtastning = scanner.nextInt();
        switch(indtastning){
            case 1:
                // Opret aftale
                break;
            case 2:
                // ændre aftale
                break;
            case 3:
                // slet aftale
                break;
            case 4:
                // Se kalender og ledige tider
                break;
            case 5:
                // Se kalender over gamle tider
                break;


        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class aftale extends kunde{
    String navn;
    double pris;
}
//----------------------------------------------------------------------------------------------------------------------
class kalender{
    ArrayList<aftale> aftaler = new ArrayList <aftale>();
}

class kunde{
    String navn;
    double pris;
}
