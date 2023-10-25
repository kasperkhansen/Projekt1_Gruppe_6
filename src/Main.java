// Husk at skrive til de andre før man pusher

import java.util.ArrayList;//----------------------------------------------------------------------------------------------------------------------
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Goddag, hvilken handling ønsker du?");
        System.out.println();
        System.out.println("Tast 1 for oprettelse af aftale");
        System.out.println("Tast 2 for Ændring af aftale");
        System.out.println("Tast 3 for at slette aftale");
        System.out.println("Tast 4 for at se aftalte tider");
        System.out.println("Tast 5 for at se ledige tider");
        System.out.println("Tast 6 for at se tid og salgs historik");
        System.out.println("Tast 7 for at lukke programmet");

        Scanner scanner = new Scanner(System.in);
        int indtastning = scanner.nextInt();
        switch(indtastning){
            case 1:
                opretAftale();
                break;
            case 2:
                // ændre aftale
                break;
            case 3:
                // slet aftale
                break;
            case 4:
                // Se kalender og aftalte tider
                break;
            case 5:
                // Se kalender over ledige tider
                break;
            case 6:
                // Se kalender over tid og salgs historik
                break;
            case 7:
                // Se kalender over tid og salgs historik
                break;


        }
    }
    public static void opretAftale(){
        Scanner scanner = new Scanner(System.in);

    }
}
//----------------------------------------------------------------------------------------------------------------------
class aftale{
    String navn = "";
    double pris = 0;
    Date nyAftale = new Date(23,1,0,12,00);

    aftale(Date nyAftale, String navn, double pris) {
        this.nyAftale = nyAftale;
        this.navn = navn;
        this.pris = pris;
    }



    @Override
    public String toString() {
        return nyAftale+navn+pris;
    }
}


//----------------------------------------------------------------------------------------------------------------------
class kalender{
    ArrayList<aftale> aftaler = new ArrayList <aftale>();
}

class kunde{
    String navn;
    double pris;
}

