package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvenuto nella rubrica, che cosa vuoi fare? ");
        while (true) {
            int opzione;
            System.out.println("1 Aggiungi contatto");
            System.out.println("2 Cancella contatto");
            System.out.println("3 Cerca contatto per nome");
            System.out.println("4 Cerca contatto per numero");
            System.out.println("5 Stampa contatti");
            System.out.println("0 Esci dalla rubrica");
            while (true){
                String scelta = sc.nextLine();
                try {
                    opzione = Integer.parseInt(scelta);
                    if(opzione < 0 || opzione > 6) System.out.println("Devi inserire un numero compreso tra zero e 5");
                    else break;
                } catch (NumberFormatException e){
                    System.out.println("Devi inserire un numero");
                }
            }
            switch (opzione){
                case 0 -> {
                    System.out.println("A presto");
                    return;
                }
                case 1 -> {
                    System.out.println("Inserisci il nome del contatto");
                    String nome = sc.nextLine();
                    System.out.println("Inserisci il numero del contatto");
                    String numero = sc.nextLine();
                    Rubrica.add(nome, numero);
                    System.out.println("Contatto salvato");
                }
                case 2 -> {
                    System.out.println("Inserisci il nome del contatto da cancellare");
                    String nome = sc.nextLine();
                    Rubrica.remove(nome);
                    System.out.println("Contatto eliminato");
                }
                case 3 -> {
                    System.out.println("Inserisci il nome del contatto da cercare");
                    String nome = sc.nextLine();
                    String numero = Rubrica.searchPerson(nome);
                    if(numero.equals("Nessun risultato")) System.out.println(numero);
                    else System.out.println("Il numero della persona cercata è: " + numero);
                }
                case 4 -> {
                    System.out.println("Inserisci il numero del contatto da cercare");
                    String numero = sc.nextLine();
                    String nome = Rubrica.searchNumber(numero);
                    if(nome.equals("Nessun risultato")) System.out.println(nome);
                    System.out.println("Il nome del numero cercato è: " + nome);
                }
                case 5 -> {
                    Rubrica.stampaRubrica();
                }
            }
        }

    }
}
