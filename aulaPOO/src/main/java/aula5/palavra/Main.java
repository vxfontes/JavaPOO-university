package aula5.palavra;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Faça um programa que leia uma frase e informe o
    número de ocorrências de cada palavra da frase
    – Use Map para fazer essa contagem -> hashmap
 *
 * @author vxfontes
 */
public class Main {

    public static void main(String[] args) {

        String frase;
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println("Insira a frase desejada");
        frase = scan.nextLine();
        
        String[] words = frase.split(" ");
    
        for (String word : words) {
 
            Integer inteiro = hashMap.get(word);
 
            if (inteiro == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, inteiro + 1);
            }
        }
        System.out.println(hashMap);
    }
}
