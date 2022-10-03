package sr;

public class Mapa 
{
    
    Personagem[] p = new Personagem[15];

    public Personagem[] getP() {
        return p;
    }

    

    public void setP(Personagem[] p) {
        this.p = p;
    }

    public int buscarPosicao(Personagem personagem)
    { 
        for(int i = 0; i<p.length; i++)
        {    if(p[i] != null)
            {
              if( personagem.getNome().equalsIgnoreCase(p[i].getNome()))
              {
               return i;
             }
        }
             
        } 
        return -1;

    }

    public void inserePersonagem(Personagem personagem, int posicao) throws
                      PersonagemJaEstaNoMapaException
    {
        if(p[posicao] == null)
        {
            
        }
        else
        {
            throw new PersonagemJaEstaNoMapaException();
        }
    }
}
