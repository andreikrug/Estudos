
package assalariado;


public class Assalariado {

    
    public static void main(String[] args) 
    {
      FuncionarioAssalariado fa = new FuncionarioAssalariado("andrei", "123", 1234);
      FuncionarioComisionado fc = new FuncionarioComisionado("andrei", "123" , 10000);
      FuncionarioHorista fh = new FuncionarioHorista("andrei", "1243", 39, 180);
      FuncionarioComissionadoComBase fcb = new FuncionarioComissionadoComBase("andrei", "1233", 1000, 1000);
      System.out.println(fa.calculaSalario());
      System.out.println(fc.calculaSalario());
      System.out.println(fh.calculaSalario());
      System.out.println(fcb.calculaSalario());
    }
    
}
