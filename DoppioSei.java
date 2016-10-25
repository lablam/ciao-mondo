/*
  Questo programma simula il lancio di due dadi un certo 
  numero di volte e calcola la frequenza del punteggio 12
  (corrispondente al doppio sei). 
*/
public class DoppioSei {
    public static void main(String[] a) {
        int numeroLanci = 10; // il numero di lanci dei 2 dadi
        int doppioSei = 0;
        int dado1, dado2; // i due dadi.

        for (int j = 0; j < 4; j++) {

            numeroLanci = (int)(Math.random() * 999999 + 10);

            for (int i = 0; i < numeroLanci; i++) {
                dado1 = (int)(Math.random() * 6 + 1);
                dado2 = (int)(Math.random() * 6 + 1);
                int somma = dado1 + dado2;
                if (somma == 12) {
                    doppioSei++;
                }
            }

            // Abbiamo lanciato i dadi "numeroLanci" volte. Vediamo 
            // la frequenza del doppio sei:
            double frequenza = (double) doppioSei / numeroLanci;
            System.out.println("\n\nEffettuo " + numeroLanci + " lanci");
            System.out.println("Ottenendo " + doppioSei + " doppi sei");
            System.out.print("\nLa frequenza del doppio sei \u00E8: ");
            System.out.print(frequenza);
            System.out.println();
            System.out.println("\nLa probabilit\u00E0 invece \u00E8: " + 1. / 36);
            System.out.println();
        }
    }
}