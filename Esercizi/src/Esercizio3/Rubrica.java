package Esercizio3;

import java.util.HashMap;
import java.util.Set;

public abstract class Rubrica {
    private static HashMap<String, String> rubrica = new HashMap<>();

    public static void add(String nome, String nr){
        rubrica.put(nome, nr);
    }

    public static void remove(String nome){
        rubrica.remove(nome);
    }

    public static String searchPerson(String nome){
        if(rubrica.get(nome) == null) return "Nessun risultato";
        else return rubrica.get(nome);
    }

    public static String searchNumber(String nr){
        Set<String> nomiRubrica = rubrica.keySet();
        String searched = "Nessun risultato";
        for (String nome : nomiRubrica){
            String numero = rubrica.get(nome);
            if(numero.equals(nr)){
                searched = nome;
            }
        }
        return searched;
    }

    public static void stampaRubrica(){
        Set<String> nomiRubrica = rubrica.keySet();
        for (String nome : nomiRubrica){
            System.out.println("Nome contatto: " + nome + " - Numero: " + rubrica.get(nome));
        }
    }
}
