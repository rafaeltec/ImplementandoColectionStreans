package Main.Java.on.DigitalInnovation.Map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[]arg){
        Hashtable<String, Integer> estudantes = new Hashtable<>();
        estudantes.put("Carlos", 21);
        estudantes.put("Mariana", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);

        System.out.println(estudantes);

        estudantes.put("Pedro", 55);
        System.out.println(estudantes);

        //remove um estudante de indice zero
        estudantes.remove("Pedro");
        System.out.println(estudantes);

        //recupera um estudante no indice 2
        int idadeEstudante = estudantes.get("Mariana");

        System.out.println(idadeEstudante);
        System.out.println(estudantes.size());

        //navega nos registros do mapa

        for (Map.Entry<String, Integer>entry: estudantes.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

        System.out.println(idadeEstudante);

        for(String key : estudantes.keySet()){
            System.out.println(key+"--"+ estudantes.get(key));
        }
        System.out.println(idadeEstudante);

    }
}
