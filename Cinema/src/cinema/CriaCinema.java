

package cinema;

public class CriaCinema 
{
    Assentos[] lugares;
    String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
    
    public CriaCinema(int quant)
    {
        lugares = new Assentos[quant];
    }
    
    public void criaLugares()
    {   
        int val1 = 1;
        int val2 = 0;
        
        for(int i = 0; i<lugares.length; i++)
        {   
            
            if(val1  < 15)
            {
                lugares[i] = new Assentos(letras[val2]+val1, false);
                val1 ++;
                
              
                
            } else {
                i--;
                val2++;
                val1 = 1;
                
                
            }
        }
    }
    
    public void ListaLugaresVagos()
    {   
        for(Assentos a : lugares)
        {
            
                System.out.println(a.toString());
            
        }
    }
    
    public boolean reservaLugar(String lugar)
    {
        for(Assentos a : lugares)
        {
            if(a.getLugar().equalsIgnoreCase(lugar))
            {
                if(!a.isReservado())
                {  
                    System.out.println("Lugar vago e vai ser reservado para você");
                    a.setReservado(true);
                    a.setMapa('O');
                    return true;
                    
                } else {
                    System.out.println("Lugar já está reservado, procure reservar outro");
                    return false;
                }
            }
        }
        return false;
      
    }
    
    public void totalDeLugaresOcupados()
    {
        int val = 0;
        for(Assentos a : lugares){
            if(a.isReservado())
            {
                val ++;
            }
        }
        System.out.println("A quantidade de lugares ocupados é: "+val+" de 168");
    }

    public String imprimeMapa()
    {   
        int val = 0;
        int a = 0;
        int letra = 0;
        String retorno = "";
          retorno += "              1   2   3   4   5   6   7   8   9   10  11  12  13  14\n";
         for(Assentos assento : lugares)
         {  
            if(a == letra)
            {
                retorno += "Fileira : "+letras[letra]+"//";
                letra ++;
                
            }
            
           
                retorno += " "+assento.getMapa()+" |";
                val ++; 
                if(val > 13)
                {    
                     retorno += "\n";
                     a ++;
                     val = 0;
                } 
            
         }
         return retorno;
    }


    
            
    
}
