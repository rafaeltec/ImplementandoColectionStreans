package Main.Java.on.DigitalInnovation.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ExemploHashSet {
    public static void main(String[] args){
        Set<Double> notasAlunos = new HashSet<>();
        //Adiciona as notas no set, porem não garante a ordem, isto é feito para garantir performance
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println(notasAlunos); //testa a remoção

        //retorna a quantidade de itens do set
        System.out.println("total de notas:"+notasAlunos.size());
        //navega em todos os itens do iterator

        Iterator<Double> Iterator = notasAlunos.iterator();

         while (Iterator.hasNext()){
             System.out.println(Iterator.next());
         }
         for (Double nota: notasAlunos)
         {
             System.out.println(nota);
         }

         //notasAlunos.clear();

         //retorna se o set está vazio ou não
         System.out.println(notasAlunos.isEmpty());





}

}
