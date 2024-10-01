package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un intero N maggiore di zero");
        int nrElementi;
        HashSet<String> inputs = new HashSet<>();
        HashSet<String> duplicated = new HashSet<>();
        while (true){
            String scelta = sc.nextLine();
            try {
                nrElementi = Integer.parseInt(scelta);
                if(nrElementi <= 0) System.out.println("Devi inserire un numero maggiore di zero");
                else break;
            } catch (NumberFormatException e){
                System.out.println("Devi inserire un numero");
            }
        }

        for (int i = 0; i < nrElementi; i++) {
            System.out.println("Inserisci una stringa");
            String input = sc.nextLine();
            if(!inputs.add(input)){
                duplicated.add(input);
            }
        }
        System.out.println("Le parole distinte sono " + inputs);
        System.out.println("Il numero di parole distinte è: " + inputs.size());
        System.out.println("Le parole duplicate sono: " + duplicated);

    }
}