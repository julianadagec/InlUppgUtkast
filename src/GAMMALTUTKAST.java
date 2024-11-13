// Uppgift:
// Skriv ett program som läser in text ifrån kommandoraden
// rad för rad tills användaren skriver ordet stop.
// När användaren är klar skriver programmet ut antal tecken och hur
// många rader som användaren har skrivit, exklusive raden med ordet stop


import java.util.Scanner;

public class GAMMALTUTKAST {

    // börjar med psvm för att starta programmet
    public static void main(String[] args) {

        // skapar en scanner för att kunna läsa in texten som matas in från kommandoraden
        Scanner scanner = new Scanner(System.in);

        // skapar en string för att lagra text som skrivs in av användaren
        String text;

        // räknare för antal tecken och antal rader i int eftersom vi inte har decimaler av tecken eller rader
        int totalCharacters = 0;
        int totalLines = 0;


        System.out.println("Skriv en text rad för rad med gemener. Skriv sedan 'stop' för att avsluta programmet):");

        // använder do för att loopa programmet tills att användaren skriver 'stop,
        do {
            text = scanner.nextLine();

            // equalsIsIgnoreCase för att användar ska kunna skriva stop på flera olika sätt
            // med gemener och versaler men att programmet ska kunna avslutats oavsett det
            if (!text.equalsIgnoreCase("stop")) {

                // så länge ordet stop inte skrivs ut kommer programmet att räkna antal tecken och rader
                totalCharacters += text.length();
                totalLines++;
                System.out.println("Du skrev: " + text);
            }
        }

        while (!text.equalsIgnoreCase("stop"));

        System.out.println("Du har skrivit 'stop', programmet avslutas.");
        System.out.println("Totala antalet tecken du har skrivit är: " + totalCharacters);
        System.out.println("Totala antalet rader du har skrivit är: " + totalLines);

        System.out.println("Du har skrivit 'stop', programmet avslutas.");

        scanner.close();

    }

}
