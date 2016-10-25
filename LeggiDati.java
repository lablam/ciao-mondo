 /*
 * Questa classe fornisce un modello per leggere dati in input. 
 * I dati considerati sono di tipo int, double e String. La lettura
 * dei dati in input viene ripetuta, finche' non e' corretta.
 */

import java.io.*; // importo il pacchetto per l'Input Output

public class LeggiDati
{
    // si noti che ora il metodo main non lancia (throws) la IOException.

    public static void main(String[] a) 
    {
        // creo un oggetto per leggere dati dalla finestra di console
        BufferedReader console = new BufferedReader(
            new InputStreamReader(System.in));

	// Leggo l'intero dato dall'utente.
	// Prima di tutto scrivo un messaggio che chiede all'utente 
	// di inserire un numero intero:

        System.out.println("Dammi un numero di tipo intero");
        
  // leggo l'intero dato dall'utente. La lettura e' inserita in 
	// un ciclo do .. while in modo da ripetere la lettura, se il 
	// dato inserito e' di tipo errato.

        boolean datoErrato = true;
        int interoDato = 0;
        do {
            try 
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                interoDato = Integer.parseInt(inputA);
                datoErrato = false;
            }
            catch (NumberFormatException e) 
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
            catch (IOException e) {
                System.out.println("Errore di input");   
		System.exit(1);
            }
        }
        while (datoErrato);
        
	// Ripeto l'operazione di lettura per un dato di tipo double:
        System.out.println("dammi un numero di tipo double: ");
        datoErrato = true;
        double doubleDato = 0;
        do {
            try 
            {
                String inputB = console.readLine();
                // converto la stringa in double:
                Double d = new Double(inputB);
                doubleDato = d.doubleValue();
                datoErrato = false;
            }
            catch (NumberFormatException e) 
            {
                System.out.println("devi darmi un numero double! Riprova: ");
            }
            catch (IOException e) {
                System.out.println("Errore di input");   
                System.exit(1);
            }
        }
        while (datoErrato);
        
        // Ripeto l'operazione per un dato di tipo String:
        String inputC = "";
        System.out.println("Dammi una stringa: ");
        // leggo la stringa:
        try {
            inputC = console.readLine();
            }
        catch (IOException e) {
            System.out.println("Errore di input");
            System.exit(1);
        }
        
        // stampo i dati letti:
        System.out.println("Il numero intero dato e': " + interoDato +
                            "\nIl numero double dato e': " + doubleDato +
                            "\nLa stringa data e': " + inputC);
    }   
}  // fine classe LeggiDati
