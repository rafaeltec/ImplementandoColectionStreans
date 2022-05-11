package Main.Java.on.DigitalInnovation.Map;

import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[]args){
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta a árvore com as capitais
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.firstKey());








    }
}
