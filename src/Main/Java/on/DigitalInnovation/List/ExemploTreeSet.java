package Main.Java.on.DigitalInnovation.List;
import com.sun.source.tree.Tree;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.TreeSet;
public class ExemploTreeSet {
    public static void main(String[] args){
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianòpolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("Sãp Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        //exibe a arvore
        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println("Primeiro valor da árvore:"+treeCapitais.first());

        //retorna a última capital no final da arvore
        System.out.println("Último valor da árvore:"+treeCapitais.last());

        //retorna a primeira capital abaixo na árvore da capital parametrizado
        System.out.println(treeCapitais.lower("Florianòpolis"));

        //retorna a primeira capital acima na árvore de capital parametrizado
        System.out.println(treeCapitais.higher("Florianópolis"));

        //retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //exibe a arvore
        System.out.println(treeCapitais);






    }
}
