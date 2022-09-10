
package assalariado;


public class FuncionarioComissionadoComBase extends FuncionarioComisionado
{
    private double salarioBase;
    private double taxa;
    private double vendas;
    public FuncionarioComissionadoComBase(String nome, String cpf, double vendasBrutas, double salario) 
    {
        super(nome, cpf, vendasBrutas);
        this.salarioBase = salario;
        this.taxa = 0.2;
        this.vendas = vendasBrutas;
    }
    
    public double calculaSalario()
    {
        return (vendas*taxa)+(salarioBase);
    }
    
}
