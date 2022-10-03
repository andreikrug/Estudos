package sr;

public class Guerreiro extends Personagem 
 {
    public Guerreiro(String nome, int forca, int agilidade, int inteligencia, int constituicao, boolean sociedade)
    {
           super(nome, forca, agilidade, inteligencia, constituicao, sociedade);
    }

    public void atacar(Mapa mapa, Personagem personagem)
    {   
        int casa = mapa.buscarPosicao(personagem);
        if(personagem.isSociedade())
        {
               if(casa <= 8)
               {
                    if(mapa.getP()[casa+1] != null && !mapa.getP()[casa+1].isSociedade())
              {  
                  
                     mapa.getP()[casa+1].setConstituicao(mapa.getP()[casa+1].getConstituicao() - personagem.getForca()*2);
                     System.out.println("atacou");
                     System.out.println(mapa.getP()[casa+1].getConstituicao());
                  
                  
              } else {
                System.out.println("Não atacou");
              } 
               }
              
        } else 
        {
          if(mapa.getP()[casa-1] != null && mapa.getP()[casa-1].isSociedade())
          {   if(casa >= 1){
               mapa.getP()[casa-1].setConstituicao(mapa.getP()[casa-1].getConstituicao() - personagem.getForca()*2);
              System.out.println("atacou");
              System.out.println(mapa.getP()[casa-1].getConstituicao());
          }
             
          } else {
            System.out.println("Não atacou");
          }
        }

        
    }

    

         public void avancar(Mapa mapa, Personagem personagem)
        {   
              int casa = mapa.buscarPosicao( personagem);
            if(personagem.isSociedade())
            {
              
              if(mapa.getP()[casa+1] == null && casa+1 <10 )
              {
                   mapa.getP()[casa] = null;
                   mapa.getP()[casa+1] = personagem;
                   System.out.println("personagem avançou uma casa");
              }
            } else {
              if(mapa.getP()[casa-1] == null )
        {
             mapa.getP()[casa] = null;
             mapa.getP()[casa-1] = personagem;
             System.out.println("Orc avançou uma casa");
        }
            }
        }
    
    
    
}
