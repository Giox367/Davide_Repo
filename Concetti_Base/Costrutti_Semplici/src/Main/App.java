package Main;

public class App {

	public static void main(String[] args) {
		sez("1) Operatori di confronto e logici");
        int eta = 17;
        boolean maggiorenne = eta >= 18;                 // confronto
        boolean sconto = (eta < 12) || (eta >= 65);      // logici: ||, &&, !
        System.out.printf("eta=%d -> maggiorenne? %b%n", eta, maggiorenne);
        System.out.println("Ha diritto a sconto? " + sconto);

        sez("2) if / else if / else");
        int temp = 24;
        if (temp >= 30) {
            System.out.println("Fa caldo");
        } else if (temp >= 20) {
            System.out.println("Clima mite");
        } else {
            System.out.println("Fa fresco");
        }

        sez("3) Operatore ternario (condizione ? A : B)");
        String stato = maggiorenne ? "maggiorenne" : "minorenne";
        System.out.println("Stato: " + stato);

        sez("4) switch classico (int/String) con break");
        int giorno = 3; // 1=lun, 2=mar, 3=mer, ...
        switch (giorno) {
            case 1: System.out.println("Lunedì"); break;
            case 2: System.out.println("Martedì"); break;
            case 3: System.out.println("Mercoledì"); break;
            case 4: System.out.println("Giovedì"); break;
            case 5: System.out.println("Venerdì"); break;
            default: System.out.println("Weekend");
        }

        sez("5) switch come espressione (Java 14+)");
        String voto = "B";
        int punti = switch (voto) {
            case "A" -> 5;
            case "B" -> 4;
            case "C" -> 3;
            case "D" -> 2;
            case "E" -> 1;
            default  -> 0;
        };
        System.out.println("Punti per voto " + voto + " = " + punti);

        sez("6) for: somma da 1 a N");
        int N = 5, somma = 0;
        for (int k = 1; k <= N; k++) {
            somma += k;
        }
        System.out.printf("Somma 1..%d = %d%n", N, somma);

        sez("7) while: conto alla rovescia");
        int c = 3;
        while (c > 0) {
            System.out.println(c);
            c--;
        }
        System.out.println("Via!");

        sez("8) do-while: esegue almeno una volta");
        int x = 0, passi = 0;
        do {
            x += 3; passi++;
        } while (x < 10);
        System.out.printf("x=%d raggiunto in %d passi da +3%n", x, passi);

        sez("9) for-each su array");
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sommaPari = 0;
        for (int v : arr) {
            if (v % 2 == 0) sommaPari += v;
        }
        System.out.println("Somma dei pari = " + sommaPari);

        sez("10) break e continue");
        int[] nums = {5, 8, 0, 12, 99};
        for (int v : nums) {
            if (v == 0) {
                System.out.println("Trovato 0 → break");
                break;                          // interrompe il ciclo
            }
            if (v % 2 != 0) continue;           // salta i dispari
            System.out.println("Numero pari: " + v);
        }

        sez("11) break con etichetta (uscire da 2 cicli annidati)");
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        boolean trovato = false;
        ricerca:
        for (int r = 0; r < matrice.length; r++) {
            for (int col = 0; col < matrice[r].length; col++) {
                if (matrice[r][col] == target) {
                    trovato = true;
                    break ricerca;              // esce da entrambi i for
                }
            }
        }
        System.out.println("Trovato " + target + "? " + trovato);

        sez("12) try/catch/finally (gestione errori di base)");
        try {
            int y = 10 / 0;                     // genera ArithmeticException
            System.out.println(y);              // non viene eseguito
        } catch (ArithmeticException e) {
            System.out.println("Divisione per zero catturata: " + e.getMessage());
        } finally {
            System.out.println("finally: eseguito comunque (chiusure/cleanup)");
        }

        sez("13) Mini quiz (atteso in commento)");
        System.out.println("(3 > 2 && 2 > 1) = " + (3 > 2 && 2 > 1));  // true
        System.out.println("Operatore ternario: 7%2==0 ? \"pari\" : \"dispari\" -> "
                + (7 % 2 == 0 ? "pari" : "dispari"));                  // "dispari"
    }

    private static void sez(String titolo) {
        System.out.println();
        System.out.println("=== " + titolo + " ===");
    

	}

}
