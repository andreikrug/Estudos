
package Banco;


public class Main {

   
    public static void main(String[] args) 
    {
        Conta c = new Conta(1000, "123");
        System.out.println(c.Sacar(500));
        
        System.out.println(c.Depositar(1000));
        
        System.out.println(c.Sacar(3000));
    }
    
}
