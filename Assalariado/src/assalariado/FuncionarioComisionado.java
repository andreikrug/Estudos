
package assalariado;


public class FuncionarioComisionado extends Funcionario
{
   private double taxaComissao;
   private double vendasBrutas;
   
   public FuncionarioComisionado(String nome, String cpf, double vendasBrutas)
   {
       super(nome, cpf);
       this.vendasBrutas = vendasBrutas;
       this.taxaComissao = 0.2;
   }
   
   public double calculaSalario()
   {
       return this.vendasBrutas * this.taxaComissao;
   }
}

