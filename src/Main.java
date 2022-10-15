public class Main {

    // Methode zum Berechnen eines Wochentages
    static void berechneWochentag(int pTag, int pMonat, int pJahr) {
        int wochentag; // Deklaration der Variable wochentag

        // Januar und Februar als Monat 13 und 14 des Vorjahres setzen
        if(pMonat == 1 || pMonat == 2) {
            pMonat = pMonat + 12 ;
            pJahr = pJahr - 1;
        }

        int jahrImJahrhundert = pJahr % 100; // Ermittlung Jahr im Jahrhundert aus Parameter jahr
        int jahrhundert = pJahr / 100; // Ermittlung Jahrhundert aus Parameter jahr

        // Prüft, ob das eingegebene Datum valide ist
        boolean tagValide = false;
        boolean monatValide = false;
        boolean jahrValide = false;

        if (pTag >= 1 && pTag <= 31) {
            tagValide = true; // wenn Tag valide wird Variable true gesetzt
        }
        if (pMonat >= 3 && pMonat <= 14) {
            monatValide = true; // wenn Monat valide wird Variable true gesetzt
        }
        if (jahrImJahrhundert >= 0 && jahrImJahrhundert <= 99) {
            jahrValide = true; // wenn Jahr im Jahrhundert valide wird Variable true gesetzt
        }


        // wenn Datum valide, wird der Wochentag berechnet und ausgegeben
        if (tagValide && monatValide && jahrValide) {
            
            // Berechnung des Wochentags
            wochentag = (pTag + 26 * (pMonat + 1) / 10 + 5 * jahrImJahrhundert / 4 + jahrhundert / 4 + 5 * jahrhundert - 1) % 7;

            // Zuordnung vom berechneten Wochentag zur passenden Ausgabe
            switch (wochentag) {
                case 0:
                    System.out.println("Wochentag: Sonntag");
                    break;
                case 1:
                    System.out.println("Wochentag: Montag");
                    break;
                case 2:
                    System.out.println("Wochentag: Dienstag");
                    break;
                case 3:
                    System.out.println("Wochentag: Mittwoch");
                    break;
                case 4:
                    System.out.println("Wochentag: Donnerstag");
                    break;
                case 5:
                    System.out.println("Wochentag: Freitag");
                    break;
                case 6:
                    System.out.println("Wochentag: Samstag");
                    break;
            }
        }
        else {
            System.out.println("Das Datum ist nicht gültig!"); // Datum nicht valide
        }

    }

    public static void main(String[] args) {
        // Datum zur Berechnung des Wochentags
        int tag = 15;
        int monat = 10;
        int jahr = 2022;

        berechneWochentag(tag, monat, jahr); // Aufruf der Methode berechneWochentage mit Datum als Parameter
    }

}