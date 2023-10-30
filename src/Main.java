// Husk at skrive til de andre før man pusher

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
//----------------------------------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Goddag, Harry, Harriet og Revisor");
        final Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println();
                System.out.println("Vælg ønsket handling!");
                System.out.println();
                System.out.println("Tast 1 for at oprette aftale");
                System.out.println("Tast 2 for at slette aftale");
                System.out.println("Tast 3 for at se aftalte tider");
                System.out.println("Tast 4 for at se kunde historik");
                System.out.println("Tast 5 for at registrere betaling");
                System.out.println("Tast 6 for at lukke programmet");
                System.out.println();
                System.out.print("Kommando: ");
                int indtastning = scanner.nextInt();
                if (indtastning == 6) break;

                switch(indtastning) {
                    case 1:
                        Tider.listeMedAftaler.add(new Aftale());
                        // opret aftale
                        break;

                    case 2:
                        System.out.println(Tider.listeMedAftaler);
                        System.out.println("Vælg tid der skal slettes (f.eks. 12:30)");
                        String sletTidString = scanner.next();

                        SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
                        try {
                            Date sletTid = dt.parse(sletTidString);
                            Aftale aftaleToRemove = null;
                            for (Aftale a : Tider.listeMedAftaler) {
                                if (a.dato.getHours() == sletTid.getHours() && a.dato.getMinutes() == sletTid.getMinutes()) {
                                    aftaleToRemove = a;
                                    break;
                                }
                            }
                            if (aftaleToRemove != null) {
                                Tider.listeMedAftaler.remove(aftaleToRemove);
                                System.out.println("Aftale slettet.");
                            } else {
                                System.out.println("Ingen aftale fundet på denne tid.");
                            }
                        } catch (ParseException e) {
                            System.out.println("Ugyldig tid indtastet.");
                        }
                        break;
                    case 3:
                        // Se aftalte tider
                        Tider.print(false);
                        break;
                    case 4:
                        // Kundehistorik
                        System.out.println("Venligst indtast adgangskode");
                        String adgangskode=scanner.next();
                        while (!adgangskode.equals("hairyharry")) {
                            System.out.println("Adgangskode er forkert. Prøv igen");
                            adgangskode=scanner.next();
                            break;
                        }
                        while (adgangskode.equals("hairyharry")) {
                            Tider.print(true);
                            break;
                        }
                        break;

                    case 5:
                        // registrer betaling
                        System.out.println("Vælg en aftale for at markere som betalt");
                        for (int i = 0; i < Tider.listeMedAftaler.size(); i++) {
                            System.out.println((i + 1) + ". " + Tider.listeMedAftaler.get(i).toString());
                        }
                        int betaltIndex = scanner.nextInt();
                        if (betaltIndex > 0 && betaltIndex <= Tider.listeMedAftaler.size()) {
                            Tider.listeMedAftaler.get(betaltIndex - 1).setBetalt(true);
                            System.out.println("Aftale markeret som betalt.");
                        } else {
                            System.out.println("Ugyldigt nummer.");
                        }
                        break;
                    default:
                        System.out.println("Dette er ikke en mulighed, indtast gyldig værdi\n");
                }
            }
        System.out.println("Programmet lukker hav en god dag");
    }
}
//----------------------------------------------------------------------------------------------------------------------
class Aftale {
    String navn;
    double pris;
    Date dato;
    boolean betalt;

    public Aftale(Date nyAftale, String navn, double pris) {
        this.dato = nyAftale;
        this.navn = navn;
        this.pris = pris;
    }


    public Aftale() {
        final Scanner scanner = new Scanner(System.in);

        //get date
        Date date = getDate(scanner);
        Date tid = getTime(scanner);
        this.dato = new Date(date.getYear(), date.getMonth(), date.getDate(), tid.getHours(), tid.getMinutes());
        System.out.println("Indtast navn");
        this.navn = getInput(scanner);
        System.out.println("Indtast pris");
        this.pris = scanner.nextDouble();
        System.out.println("Aftale registreret.");
        this.betalt = false;

    }

    public boolean isBetalt() {
        return betalt;
    }

    public void setBetalt(boolean betalt) {
        this.betalt = betalt;
    }

    public Date getTime(Scanner scanner) {
        Date t = null;
        while(true) {
            try {
                SimpleDateFormat dt = new SimpleDateFormat("HH:mm");
                System.out.println("Indtast tid (f.eks. 12:30)");
                String input = getInput(scanner);
                t = dt.parse(input);
                return t;
            } catch (ParseException exception) {
                System.out.println("Ikke gyldigt input");
            }
        }

    }

    public Date getDate(Scanner scanner) {
        Date t = null;
        while (true) {
            try {
                SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("Indtast dato (f.eks. 01-10-2023)");
                String input = getInput(scanner);
                t = ft.parse(input);
                return t;
            } catch (ParseException exception) {
                System.out.println("Ikke gyldigt input");
            }
        }
    }

    public String getInput(Scanner scanner) {
        return scanner.next();
    }

    @Override
    public String toString() {
        return dato + " " + navn + " " + pris;
    }

    public String toString(boolean visBetalte) {
        if (visBetalte) {
            return dato + " " + navn + " " + pris + " " + (betalt ? "Betalt" : "Ikke Betalt");
        }
        else {
            return dato + " " + navn + " " + pris;
        }
    }

}

//----------------------------------------------------------------------------------------------------------------------
class Tider extends Aftale {

    public void setNyAftale(Date nyAftale) {
        this.dato = nyAftale;
    }

    public static ArrayList<Aftale> listeMedAftaler = new ArrayList<Aftale>();

    Tider(Date nyAftale, Date tid, String navn, double pris) {
        super(nyAftale, navn, pris);



    }
    public static void print(boolean visBetaling) {
        for (Aftale aftale: listeMedAftaler) {
            System.out.println(aftale.toString(visBetaling));
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------