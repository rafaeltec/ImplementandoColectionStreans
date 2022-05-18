package Main.Java.on.DigitalInnovation.Stream;

import javax.management.modelmbean.DescriptorSupport;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemplosStremAPI {
    public static void main(String[] args){

        //cria a coleção de estudantes
        List<String> estudantes = new ArrayList<>();
        //adjiciona 7 estudandes para a coleção
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
        // exibe a coleção de estudantes
        System.out.println(estudantes);

        //retorna a contagem de elementos do stream
        System.out.println("Contagem:"+ estudantes.stream().count());
        //retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letras:" + estudantes.stream().count());
        //retorna o elemento com o menor numero de letras
        System.out.println("Menor numero de letras:" + estudantes.stream().min(Comparator.comparing(String::length)));
        //retorna os elementos com a letra R no nome
        System.out.println("Com a letra R no nome:" + estudantes.stream().filter((estudante)->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        // exibe a coleção de estudantes
        System.out.println(estudantes);
        //retorna uma nova coleção, com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("Retorna uma coleção com a quantidae de letras de cada nome:" + estudantes.stream().map(estudante->
                estudante.concat("=").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        // exibe a coleção de estudantes
        System.out.println(estudantes);
        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos da coleção:" + estudantes.stream().limit(3).collect(Collectors.toList()));
        // exibe cada elemento no console sem retornar a mesma coleção
       System.out.println("Retorna os elementos novamente:");
       estudantes.stream().forEach(System.out::println);
       //retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem algum elemento com W no nome:" + estudantes.stream().anyMatch((elemento) -> elemento.contains("W")));
        //Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("Retorna o primeiro elemento da coleção:");
                 estudantes.stream().findFirst().ifPresent(System.out::println);

        //Exemplo de operação encadeada
        System.out.println("Operação encadeda:");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat("-").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));

     /*Ou este :*/
            //    .collect(Collectors.joining(",")));

    /*Ou este :*/
            //   .collect(Collectors.toSet()));
    /*Ou este :*/





    }
}
