
package assalariado;

public class FuncionarioHorista extends Funcionario
{
    private int horasTrabalhadas;
    private double salarioHora;
    
    public FuncionarioHorista(String nome, String cpf, int horas, double sal)
    {
        super(nome, cpf);
        this.horasTrabalhadas = horas;
        this.salarioHora = sal;
    }
    
    public double calculaSalario()
    {
        if(horasTrabalhadas < 40)
        {
            return salarioHora * horasTrabalhadas;
        } else {
            return (40*salarioHora) + (horasTrabalhadas - 40)*1.5;
        }
    }
    
    
}
