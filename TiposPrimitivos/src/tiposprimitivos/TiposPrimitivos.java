package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno " + nome +": ");
        float nota = teclado.nextFloat();
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é %.2f \n",nome,nota);
        System.out.format("A nota de %s é %.2f \n", nome,nota);
    }
    
}
