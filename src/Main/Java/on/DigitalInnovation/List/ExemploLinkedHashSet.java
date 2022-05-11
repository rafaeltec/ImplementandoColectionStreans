package Main.Java.on.DigitalInnovation.List;

import com.sun.tools.javac.Main;

import javax.management.MBeanAttributeInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[]args){
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);

        System.out.println(sequenciaNumerica);

        //remove o número do set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //retorna a quantidade do itens do set
        System.out.println("total de itens contidos no HashSet:"+sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer numero: sequenciaNumerica){
            System.out.println(numero);
        }
        //sequenciaNumerica.clear();
        //retorna se está vazia ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }

}
