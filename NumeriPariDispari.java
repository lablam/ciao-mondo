/*
  Questo programma sceglie a caso un numero intero compreso 
  tra 1 e 100 (estremi inclusi) e dice se e' pari o dispari
*/
public class NumeriPariDispari {
    public static void main(String[] arg) {
        int numeroIntero;
        System.out.println();
        for (int j = 0; j < 20; j++) {
            numeroIntero = (int)(Math.random() * 101 + 1);
            System.out.print("Numero scelto: " + numeroIntero + ":");
            if (numeroIntero % 2 == 0) {
                System.out.print(" pari\n");
            } else
                System.out.print(" dispari\n");
            System.out.println();
        }
    }
}
