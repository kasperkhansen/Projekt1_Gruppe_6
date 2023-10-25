// Husk at skrive til de andre før man pusher

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

class aftale{
    String navn;
    double pris;
}

class kalender{
    ArrayList<aftale> aftaler = new ArrayList <aftale>();
}
