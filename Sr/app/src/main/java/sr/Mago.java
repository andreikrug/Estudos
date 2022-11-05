package sr;

public class Mago extends Personagem implements Maia
{
  public Mago(String nome, int forca, int agilidade, int inteligencia, int constituicao, boolean sociedade) {
        super(nome, forca, agilidade, inteligencia, constituicao, sociedade);
        //TODO Auto-generated constructor stub
    }

public void falar(){

  }
  
int dano()
{
    return this.inteligencia;
}

@Override
public void Ressucitar() {
  // TODO Auto-generated method stub
  
}

  
public void atacar(Mapa mapa, Personagem personagem)
{
   if(personagem.isSociedade())
   {
    for(Personagem p : mapa.getP())
    {
         if( p != null && !p.isSociedade())
         {
            p.setConstituicao(p.getConstituicao() -personagem.getInteligencia());
            System.out.println("Personagem atacou");
            System.out.println(p.getConstituicao());
         }
    }

   } else {
    for(Personagem p : mapa.getP())
    {
         if( p != null && p.isSociedade())
         {
            p.setConstituicao(p.getConstituicao() -personagem.getInteligencia());
            System.out.println("Personagem atacou");
            System.out.println(p.getConstituicao());
         }
    }
   }
}

public void avancar(Mapa mapa, Personagem personagem)
{
   if(personagem.isSociedade()){
    int casa = mapa.buscarPosicao(personagem);
        int valor = 0;
        for(int i = 0; i<mapa.getP().length; i++)
        {
            if(mapa.getP()[i] != null){
                valor ++;
            }
        }
        if(valor <= 1)
        {
            mapa.getP()[casa+1] = personagem;
            mapa.getP()[casa] = null;
            System.out.println("Gandalf avançou uma casa");
        } else {
            System.out.println("Existem mais peronagens no mapa");
        }
 
   } else {
    int casa = mapa.buscarPosicao(personagem);
        int valor = 0;
        for(int i = 0; i<mapa.getP().length; i++)
        {
            if(mapa.getP()[i] != null){
                valor ++;
            }
        }
        if(valor <= 1)
        {
            mapa.getP()[casa-1] = personagem;
            mapa.getP()[casa] = null;
            System.out.println("Saruman avançou uma casa");
        } else {
            System.out.println("Existem mais peronagens no mapa");
        }
   }
}
}
