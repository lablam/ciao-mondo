/* 
   Questo programma sceglie 10000 coppie di numeri casuali tra 
   1 e 100000 e determina quante volte accade che il loro massimo 
   comun divisore (calcolato con l'algoritmo di Euclide) vale 1
   (cioe' determina quante volte i due numeri scelti sono primi
   tra loro). Calcola la frequenza di tale evento e la confronta
   con il numero 6/Pi^2 - Il teorema di Cesaro afferma che i due 
   numeri dovrebbero "coincidere".
*/

public class TestEuclide {

    public static void main(String[] arg) {
	int numMaxCoppie = 100000;
	int limiteNumeri = 9000000;
	int contatore = 0;
	for (int i = 1; i <= numMaxCoppie; i++) {
	    // scelgo due numeri a caso:
	    int a1 = (int)(Math.random()*limiteNumeri + 1);
	    int a2 = (int)(Math.random()*limiteNumeri + 1);
	    // calcolo il loro max com div:
	    int mcd = mcd(a1, a2);
	    if (mcd == 1) 
		contatore++;
	}
	System.out.print("Su " + numMaxCoppie + " coppie di numeri casuali ");
	System.out.print("la frequenza che siano primi tra loro e': ");
	System.out.println((double)contatore/numMaxCoppie);
	System.out.print("\nLa probabilita' (secondo il teorema di Cesaro) e': ");
	System.out.println(6/(Math.PI*Math.PI));


    }

    // Calcola il mcd di due interi positivi usando l'algoritmo
    // di Euclide

    public static int mcd(int a, int b) {
	int n1 = a; 
	int n2 = b;
	while (n2 != 0) {
	    if (n1 > n2)
		n1 -= n2;
	    else
		n2 -= n1;
	}
	return n1;
    }

}
