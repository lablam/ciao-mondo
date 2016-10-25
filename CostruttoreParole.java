/* 
   Questo programma costruisce una parola di 5 lettere 
   casuali con le lettere dell'alfabeto.
*/
public class CostruttoreParole {
    public static void main(String[] a) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        int numeroLettereAlfabeto = alfabeto.length();
        String parola = "";
        System.out.println();
        for (int i = 0; i < 8; i++) {
            // scelgo una delle lettere dell'alfabeto.
            int j = (int)(Math.random() * numeroLettereAlfabeto);
            parola += alfabeto.charAt(j);
        }
        System.out.println("La parola scelta e': " + parola);
        System.out.println();
    }
}