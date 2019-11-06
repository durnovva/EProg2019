import java.util.Random;
import java.util.Scanner;

public class RechenUebungen {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie viele Terme maximal? ");
        int maxTerme = scanner.nextInt();
        System.out.print("Wie grosse Zahlen maximal? ");
        int maxZahl = scanner.nextInt();
        
        if(maxTerme < 2 || maxZahl < 1)
            System.out.println("Ungültige Eingabe");
        else
            rechenUebungen(maxTerme, maxZahl);
    }
    
    static void rechenUebungen(int maxTerme, int maxZahl) {
        int fehler = 0;
        int punkte = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int[] terme = zufallsTerme(maxTerme, maxZahl, random);
            System.out.print(aufgabe(terme));
            int summe = summe(terme);
            int antwort = scanner.nextInt();
            if(antwort == summe)
                punkte++;
            else {
                System.out.println("Falsch! Das Resultat ist " + summe + ".");
                fehler++;
            }
        } while(fehler < 3);
        System.out.println("Du hast " + punkte + " Punkte!");
    }
    
    static int[] zufallsTerme(int maxTerme, int maxZahl, Random random) {
        int terme[] = new int[random.nextInt(maxTerme - 1) + 2];
        for(int i = 0; i < terme.length; i++)
            terme[i] = random.nextInt(maxZahl) + 1;
        return terme;
    }
    
    static String aufgabe(int[] terme) {
        String aufgabe = "" + terme[0];
        for(int i = 1; i < terme.length; i++)
            aufgabe += " + " + terme[i];
        return aufgabe + " = ";
    }
    
    static int summe(int[] terme) {
        int summe = 0;
        for(int i = 0; i < terme.length; i++)
            summe += terme[i];
        return summe;
    }
}
