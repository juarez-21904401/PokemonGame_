import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa Ash= new Pessoa("Ash",0,0,1);

        System.out.println(" Introduza os passos do Ash , apenas serão permetidos passos como N(NORTE),S(SUL),E(ESTE),O(OESTE)");
        Scanner s = new Scanner(System.in);

        String Passos = s.nextLine();
        int resultado= Ash.movimento(Passos,Ash);
        System.out.println(resultado);




    }
}