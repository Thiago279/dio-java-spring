import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Integer.sum;

public class Main {



    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    public static void mostraOrdemNumerica(){

        List<Integer> result = numeros.stream().sorted().toList();
        System.out.println(result);
    }

    public static void somaPares(){
        List<Integer> pares = numeros.stream().filter(i -> i % 2 == 0 ).toList();
        Integer cont = 0;
        for(Integer par : pares){
            cont+= par;
        }
        System.out.println("soma dos pares = "+ cont);
    }

    public static boolean verificaSePositivos(){
        List<Integer> negativos = numeros.stream().filter(i -> i < 0).toList();
        if(negativos.isEmpty()){
            System.out.println("Todos os números são positivos");
            return true;
        }
        else {
            System.out.println("Existem números negativos");
            return false;
        }
    }

    public static void removeImpares(){
        System.out.print("números pares: ");
        List<Integer> pares = numeros.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(pares.stream()
                .map(String::valueOf) // Convert each number to a String
                .collect(Collectors.joining(", ")));
    }

    public static double calculaMediaMaioresCinco(){
        List<Integer> maiores = numeros.stream().filter(i -> i > 5).toList();
        int tamanho = maiores.size();
        Integer cont = 0;
        int soma = maiores.stream().mapToInt(Integer:: intValue).sum();

        double media = soma/tamanho;
        System.out.println("media: " + media);
        return media;

    }

    public static boolean verificaMaiorDez(){
        List<Integer> maiores = numeros.stream().filter(i -> i > 10).toList();
        if(maiores.isEmpty()){
            System.out.println("Todos os números são menores que 10");
            return false;
        }
        else {
            System.out.println("Existem número(s) maiores que 10");
            System.out.println(maiores.stream().map(String::valueOf).collect(Collectors.joining(", ")));;
            return true;
        }
    }

    public static int encontraSegundoMaior(){
        List<Integer> ordenados = new ArrayList<>();
        ordenados = numeros.stream().sorted().toList();
        int tamanho = ordenados.size();
        System.out.println("Segundo maior: "+ ordenados.get(tamanho-2));
        return ordenados.get(tamanho-2);
    }

    public static boolean verificaRepetidos(){
        Map<Integer, Long> frequencias = numeros.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting())); // Conta ocorrências de cada número

        List<Integer> repetidos = frequencias.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Filtra números que aparecem mais de uma vez
                .map(Map.Entry::getKey) // Pega apenas os números repetidos
                .toList();
        if (repetidos.isEmpty()){
            System.out.println("nenhum número repetido");
            return true;
        }
        else{
            System.out.println("numeros repetidos:");
            System.out.println(repetidos.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            return false;
        }
    }
    public static void main(String[] args) {

        mostraOrdemNumerica();
        somaPares();
        verificaSePositivos();
        removeImpares();
        calculaMediaMaioresCinco();
        verificaMaiorDez();
        encontraSegundoMaior();
        verificaRepetidos();

    }
}
