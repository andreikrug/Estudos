
package assalariado;

public abstract class Funcionario 
{
    private String nome; 
    private String cpf;
    
    public Funcionario(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        
        
    }
    
    public double calculaSalario()
    {
        return 0.0;
    }
    
    
    
}
