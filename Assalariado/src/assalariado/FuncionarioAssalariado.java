

package assalariado;


public class FuncionarioAssalariado extends Funcionario
{  
    private double salarioFixo;
    public FuncionarioAssalariado(String nome, String cpf, double salarioFixo)
    {
        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }
    
  

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calculaSalario()
    {
        return salarioFixo;
    }
    
    
}
