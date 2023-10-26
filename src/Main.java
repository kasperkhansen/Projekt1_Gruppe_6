// Husk at skrive til de andre før man pusher

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//----------------------------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        System.out.println("Goddag, Harry, Harriet og Revisor");
        System.out.println();
        System.out.println("Indtast dato (dd-MM-yyyy)");


        Scanner scanner = new Scanner(System.in);
        int indtastning = scanner.nextInt();
        switch(indtastning){
            case 1:
                // Indtast dato
                break;
            case 2:
                aftale.opretAftale();
              // se tider, opret aftale, slet aftale
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

    public static void opretAftale(){
        System.out.println("Indtast dato (f.eks. 01-10-2023)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Indtast tid (f.eks. 12:30)");
        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
        Date t;
        Date tid;
        try {
            t = ft.parse(input);
            input = scanner.next();
            tid = dt.parse(input);
            System.out.println("Indtast navn");
            String navn = scanner.next();
            System.out.println("Indtast pris");
            double pris = scanner.nextDouble();
            aftale a =new aftale(t, tid, navn, pris );

        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }

    @Override
    public String toString() {
        return nyAftale+navn+pris;
    }
}

//----------------------------------------------------------------------------------------------------------------------
class kalender{
    FileWriter Dagskalender = new FileWriter("Dagskalender");




    kalender() throws IOException {
    }
}


//----------------------------------------------------------------------------------------------------------------------
class Tider{
    String navn;


    Tider(String navn){
        this.navn = navn;

        Tider[] klippetider = new Tider[16];
        klippetider[0] = new Tider("10:00");
        klippetider[1] = new Tider("10:30");
        klippetider[2] = new Tider("11:00");
        klippetider[3] = new Tider("11:30");
        klippetider[4] = new Tider("12:00");
        klippetider[5] = new Tider("12:30");
        klippetider[6] = new Tider("13:00");
        klippetider[7] = new Tider("13:30");
        klippetider[8] = new Tider("14:00");
        klippetider[9] = new Tider("14:30");
        klippetider[10] = new Tider("15:00");
        klippetider[11] = new Tider("15:30");
        klippetider[12] = new Tider("16:00");
        klippetider[13] = new Tider("16:30");
        klippetider[14] = new Tider("17:00");
        klippetider[15] = new Tider("17:30");


    }
}
//----------------------------------------------------------------------------------------------------------------------