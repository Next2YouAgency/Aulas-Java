package idiomasistema;

import java.util.Locale;//biblioteca para visualizar o pacote de idioma do sistema

public class IdiomaSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();//Encontra o idioma
        System.out.print("O meu sistema é em: ");
        System.out.println(loc.getDisplayLanguage());//mostra "português"
        System.out.println(loc.getLanguage());//mostra "pt"
    }
    
}
