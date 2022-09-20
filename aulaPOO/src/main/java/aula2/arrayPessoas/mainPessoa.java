package aula2.arrayPessoas;

import java.util.*;
import static java.util.Collections.sort;

/**
 *
 * @author vxfontes
 */
public class mainPessoa {
    public static void main(String[] args) {

        int num, idade;
        String nome;
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o numero de pessoas do array: ");
        num = scan.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print("Digite o nome da pessoa: ");
            nome = scan.next();
            
            System.out.print("Digite a idade da pessoa: ");
            idade = scan.nextInt();
            
            pessoas.add(new Pessoa(nome, idade));
        }
        
        
        
        for(Pessoa p: pessoas) {
            System.out.println(p.toString());
        }
        
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome).thenComparingInt(Pessoa::getIdade));
        
        System.out.println("Agora printando todas as pessoas ordenadas");
        
        for(Pessoa p: pessoas) {
            System.out.println(p.toString());
        }
    }
}
