import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String nome;
        
        System.out.println("Hellow World!");
        System.out.print("Qual seu nome? ");
        nome = leia.nextLine();

        System.out.print("Iae " + nome + ", como você está???");

        leia.close();
    }
}
