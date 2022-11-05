import java.util.List;
import java.util.ArrayList;
public class Principal{
   private ArrayList<Pessoa> pessoas ;

   public void inserirPessoa(Pessoa pessoa){
        pessoas.add(pessoa);

   }

   public double calcularImc(Pessoa pessoa){
        
        System.out.println(pessoa.getAltura());

       return (pessoa.getPeso())/ (pessoa.getAltura()*pessoa.getAltura());
        
        

   }

   public String imcStatus(Pessoa pessoa)
   {
        double resultado = calcularImc(pessoa);
        if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f')
        {
            if(resultado < 19.1)
            {
                return "Abaixo do peso" ;
            } else if( resultado >= 19.1 && resultado <= 25.8)
            {
                return "Peso ideal";
            } else {
                return "Obesa, vá treinar ";
            }
        } else if(pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm')
        {
            if(resultado < 20.7)
            {
                return "Abaixo do peso" ;
            } else if( resultado >= 20.7 && resultado <= 26.4)
            {
                return "Peso ideal";
            } else {
                return "Obeso, vá treinar ";
            }
        } else {
            return "Pessoa genêro inválido";
        }

   }


   public double pesoIdeal(Pessoa pessoa)
   {
    if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
        return (pessoa.getAltura() - 100) - ((pessoa.getAltura() - 150)/2);
    } else {
        return (pessoa.getAltura() - 100) - ((pessoa.getAltura() - 150)/4);
    }

    
   }

   public double taxaGordura(Pessoa pessoa)
   {
       double imc = calcularImc(pessoa);
        if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
            return (1.2*imc) + (0.23 * pessoa.getIdade()) - 5.4;
    } else {
        return (1.2*imc) - 10.8 + (0.23 * pessoa.getIdade()) - 5.4;
    }

    
   }





    
}
