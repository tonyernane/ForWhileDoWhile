import java.util.Random;

public class ImplementDoWhile {
public static void main(String[] args) {
    System.out.println("Thalia ligando");

    do {
    System.out.println("celular tocando");    
    } 
    while (tocando());
    System.out.println("oi thalia");

}
private static boolean tocando(){
boolean gizellyAtendeu = new Random().nextInt(3)==1;
System.out.println("gizelly atendeu ? " + gizellyAtendeu);
return ! gizellyAtendeu;
}
}