package sr;

public class Aragorn extends Guerreiro implements Homem
{

    public Aragorn(String nome, int forca, int agilidade, int inteligencia, int constituicao, boolean sociedade) {
        super(nome, forca, agilidade, inteligencia, constituicao, sociedade);
       
    }

    @Override
    public String fala() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void envelhecer() 
    {
        super.setConstituicao(super.getConstituicao()-1);
        
    }

    

    
    
    
}
