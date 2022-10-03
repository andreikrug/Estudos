package sr;
public class Simular
 {  

    public void limparCorpos(Mapa map)
    {   
        for(int i = 0; i<map.getP().length; i++)
        {    
            if(map.getP()[i] != null){
                if(map.getP()[i].getConstituicao() < 0)
             {
                 map.getP()[i] = null;
                 System.out.println("corpo removido com sucesso");
               
             }
            }
             
        }
       
    }
  

    public void simula(Mapa map)
    {    
        int verifica = 1;
         while (verifica == 1){
            
         for(Personagem p : map.getP())
         {   
            limparCorpos(map);
            if(p != null)
            {
                if(map.buscarPosicao(p) == 0 || map.buscarPosicao(p) == 5)
                {
                    verifica = 0;
                    System.out.println("alguem venceu");
                    break;

                }
              
                
                
                    p.atacar(map, p);
                    p.avancar(map, p);
                    System.out.println(p.getNome()+"|"+p.getConstituicao());
                    System.out.println(map.buscarPosicao(p));
                
                
            
            }
            
           
           
            
            
         
    }
   
}
    }
    
}
