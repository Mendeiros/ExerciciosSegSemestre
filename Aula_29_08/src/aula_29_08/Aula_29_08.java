package aula_29_08;

public class Aula_29_08 {

    public static void main(String[] args) {
        String string1 = "Hello how are you?";
        
        System.out.println(string1.startsWith("Hello"));
        System.out.println(string1.endsWith("you?"));
        
        // / //
        
        String[] nome = {"aria", "Jose"};
        System.out.println("nome: "+nome[0].startsWith("m"));
        System.out.println("nome: "+nome[1].endsWith("se"));
    }
    
}
