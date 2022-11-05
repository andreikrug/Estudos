package sr;

public class Arqueiro extends Personagem 
{
    public Arqueiro(String nome, int forca, int agilidade, int inteligencia, int constituicao, boolean sociedade)
    {
           super(nome, forca, agilidade, inteligencia, constituicao, sociedade);
    }

    public void avancar(Mapa mapa, Personagem personagem)
    {
        int casa = mapa.buscarPosicao( personagem);
        if(personagem.isSociedade())
        {
          
          if(mapa.getP()[casa+1] == null )
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
         System.out.println("personagem avançou uma casa");
    }
        }
    }

    public void atacar(Mapa mapa, Personagem personagem)
    {
        int casa = mapa.buscarPosicao(personagem);
        int passo = -1;
        if(personagem.isSociedade())
        {
             passo = 1;
        }
            if(mapa.getP()[casa+3*passo] != null && !mapa.getP()[casa+3*passo].isSociedade())
            {
               mapa.getP()[casa+3].setConstituicao(mapa.getP()[casa+3].getConstituicao() - personagem.getAgilidade());
            } else  if(mapa.getP()[casa+2*passo] != null && !mapa.getP()[casa+2].isSociedade())
            {
               mapa.getP()[casa+3].setConstituicao(mapa.getP()[casa+2].getConstituicao() - personagem.getAgilidade());
            } else  if(mapa.getP()[casa+1] != null && !mapa.getP()[casa+1].isSociedade())
            {
               mapa.getP()[casa+3].setConstituicao(mapa.getP()[casa+1].getConstituicao() - personagem.getAgilidade());
            }
        
        }

    }




    }


    




