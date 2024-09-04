import java.util.concurrent.ThreadLocalRandom;
public class WhileImplement {
public static void main(String[] args) {
     Double salario = 2800.0;

     while (salario > 0) {
     Double valorItem = valorAleatorio(); 
     if (valorItem > salario)
         valorItem = salario; 
      
         System.out.println("um produto de r$ " + valorItem + " foi adicionado ao carrinho");
      salario = salario - valorItem;      
    }
          System.out.println("sobrou r$" + salario + " do dinheiro do sicrano");
}
private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(3, 7);
}
}