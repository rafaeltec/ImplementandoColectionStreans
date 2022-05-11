package Main.Java.on.DigitalInnovation.Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[]args){

        Map<String, Integer> campeoesMuldialFifa = new HashMap<>();
        //adiciona os campeões mundiais fifa no map
        campeoesMuldialFifa.put("Brasil", 5);
        campeoesMuldialFifa.put("Alemanha", 4);
        campeoesMuldialFifa.put("Itália", 4);
        campeoesMuldialFifa.put("Uruguai", 2);
        campeoesMuldialFifa.put("Argentina", 2);
        campeoesMuldialFifa.put("França", 2);
        campeoesMuldialFifa.put("Inglaterra", 1);
        campeoesMuldialFifa.put("Espanha", 1);


        System.out.println(campeoesMuldialFifa);

        //atualiza o valor para a chave Brasil mudando o valor de campeonatos para 7
        campeoesMuldialFifa.put("Brasil", 7);
        System.out.println(campeoesMuldialFifa);

        //retorna a argentina
        System.out.println(campeoesMuldialFifa.get("Argentina"));

        //retorna se existe ou nao um campeão frança
        System.out.println(campeoesMuldialFifa.containsKey("França"));

        //retorna se existe ou não alguma seleção hexa compeã
        System.out.println(campeoesMuldialFifa.containsValue(6));

        //retorna o tamanho do mapa
        System.out.println(campeoesMuldialFifa.size());

        System.out.println(campeoesMuldialFifa);

        //navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMuldialFifa.entrySet()){
            System.out.println(entry.getKey() +"=" +entry.getValue());
        }
        System.out.println("----------------------------------");
        //navega nos registros do mapa
        for (String key : campeoesMuldialFifa.keySet()){
            System.out.println(key+"="+campeoesMuldialFifa.get(key));
        }
        System.out.println(campeoesMuldialFifa);

        //verifica se o mapa contem a chave estador unidos
        System.out.println(campeoesMuldialFifa.containsKey("Estados Unidos"));

        // verifica se o mapa contem o valor 5
        System.out.println(campeoesMuldialFifa.containsKey(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMuldialFifa.size());
        //limpa o map depois exibe o tamanho
        campeoesMuldialFifa.clear();
        System.out.println(campeoesMuldialFifa.size());
    }
}
