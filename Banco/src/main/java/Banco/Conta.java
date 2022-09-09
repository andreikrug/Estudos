
package Banco;


public class Conta
{
    private double saldo;
    private String numero;
    
    public Conta(double saldo, String numero){
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String Sacar(int valor)
    {
        if(valor > this.saldo)
        {
            return "Saldo menor do que o valor de resgate";
        } else {
            saldo -= valor;
            return "Saque efetuado, novo saldo: "+this.saldo;
        }
    }
    
    public String Depositar(int valor){
        saldo += valor;
        return "Novo saldo: "+this.saldo;
    }

    @Override
    public String toString() 
    {
        return "Conta{" + "saldo=" + saldo + ", numero=" + numero + '}';
    }
    
    
    
    
    
}
