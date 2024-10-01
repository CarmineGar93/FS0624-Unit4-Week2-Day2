package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un valore intero N maggiore di zero");
        int nrElementi;
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
        System.out.println("L'array è: ");
        ArrayList<Integer> randoms = arrayRandom(nrElementi);
        System.out.println(randoms);
        System.out.println("L'array in ordine inverso è: ");
        System.out.println(reverse(randoms));
        System.out.println("Vuoi stampare i numeri in posizione pari (1) o dispari (2)");
        int option;
        while (true){
            String scelta = sc.nextLine();
            try {
                option = Integer.parseInt(scelta);
                if(option <= 0 || option > 2) System.out.println("Devi inserire 1 o 2");
                else break;
            } catch (NumberFormatException e){
                System.out.println("Devi inserire un numero");
            }
        }
        boolean scelta = option == 1;
        System.out.println("L'array di numeri in posizione " + (scelta ? "pari" : "dispari") + " è: ");
        System.out.println(evenOdd(randoms, scelta));
    }
    public static ArrayList<Integer> arrayRandom(int n){
        ArrayList<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randoms.add((int) (Math.random() * 101));
        }
        Collections.sort(randoms);
        return randoms;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> arrayRandom){
        ArrayList<Integer> reversed = new ArrayList<>(arrayRandom);
        Collections.reverse(reversed);
        return reversed;
    }

    public static ArrayList<Integer> evenOdd(ArrayList<Integer> array, boolean b){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = b ? 0 : 1; i < array.size(); i += 2) {
            result.add(array.get(i));
        }
        return result;
    }

}
