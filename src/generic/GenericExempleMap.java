package generic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GenericExempleMap {
    Map<String, Integer> mapaGeneric = new HashMap<>();

    public void hashMap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja começar o Map ?: 1 yes, 0 not");
        int valor = scanner.nextInt();
        while (valor != 0){
            System.out.println("Digite um numero:");
            int num = scanner.nextInt();
            mapaGeneric.put("Chave 1", num);
            System.out.println("Digite outro numero:");
            int num1 = scanner.nextInt();
            mapaGeneric.put("Chave 2", num1);
            System.out.println("Deseja continuar ?: 1 yes, 0 not");
            valor = scanner.nextInt();

        }
        // Iterando e imprimindo os elementos do mapa
        for (Map.Entry<String, Integer> entry : mapaGeneric.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
