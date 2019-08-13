package exercicio01;

public class Numeros {

   public static void exibeImpar(int [] n) {
       while(n[0] <= n[1]) {
           if (n[0] % 2 != 0) {
               System.out.println("\n" +n[0]);
           }
           n[0]++;
       }
   }


}
