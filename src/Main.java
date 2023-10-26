// Husk at skrive til de andre før man pusher

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
        String input = scanner.next();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
        Date t;
        Date tid;
        try {
            System.out.println("indtast dato (f.eks. 01-10-2023");
            t = ft.parse(input);
            input = scanner.next();
            System.out.println("Indtast tid (f.eks. 15:00)");
            tid = dt.parse(input);
            System.out.println("Indtast navn (f.eks. Bjorn");
            String navn = scanner.next();
            System.out.println("Indtast pris (f.eks. 200");
            double pris = scanner.nextDouble();
            aftale a =new aftale(t, tid, navn, pris );

        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------
class aftale{
    String navn;
    double pris;
    Date nyAftale;
    Date tid;

    public aftale(Date nyAftale, Date tid, String navn, double pris) {
        this.nyAftale = nyAftale;
        this.tid = tid;
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

