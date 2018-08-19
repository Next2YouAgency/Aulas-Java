/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritimeticos;

/**
 *
 * @author hugo
 */
public class OperadoresAritimeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int n1 = 3;
//        int n2 = 5;
//        float m = (n1+n2)/2;
//        System.out.println("A média é igual a: "+m);

//        int numero = 5;
//
//        int valor = 5 + numero++;
//
//        System.out.println(valor);
//        System.out.println(numero);

//        int x = 4;
//        x += 2; //x = x + 2
//        System.out.println(x);
//        
//        int y = 4;
//        y -= 2;//y = y - 2
//        System.out.println(y);
//        
//        int z = 4;
//        z *= 2; //z = z * 2;
//        System.out.println(z);
//        
//        int w = 4;
//        w /= 2; //w = w / 2
//        System.out.println(w);
//        
//        int q = 4;
//        q %= 2; //q = q % 2
//        System.out.println(q);


//        float x = -8.4f;
//        float abs = (float)Math.abs(x);
//        float floor = (float)Math.floor(x);
//        float ceil = (float)Math.ceil(x);
//        float round = (float)Math.round(x);
//        
//        System.out.println("Valor natural de X: " + x);
//        System.out.println("Valor absoluto de X: " + abs);
//        System.out.println("Valor de X arredondado para baixo: " + floor);
//        System.out.println("Valor de X arredondado para cima: " + ceil);
//        System.out.println("Valor de X arredondado aritimeticamente: " + round);

        //Valores Aleatórios e testes
        double random = Math.random();
        System.out.println("Valor Gerado aleatóriamente: " + random);
        
        int n = (int) (2 + random * (70-2)); // valor inicial + valor aleatório * (valor final - valor inicial)
        System.out.println("Valor Gerado aleatóriamente de 2 a 70: " + n);
    }

}
