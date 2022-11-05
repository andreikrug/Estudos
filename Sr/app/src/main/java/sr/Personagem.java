package sr;

public   class Personagem 
{
    protected int     forca;
    protected int     agilidade;
    protected int     inteligencia;
    protected int     sentido;
    protected String  nome;
    protected int constituicao;


    
    public Personagem(String nome, int forca, int agilidade, int inteligencia,
                     int constituicao, boolean sociedade)
    {
        this.nome         = nome;
        this.forca        = forca;
        this.agilidade    = agilidade;
        this.inteligencia = inteligencia;
        this.constituicao = constituicao;
        this.sociedade    = sociedade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public int getConstituicao() {
        return constituicao;
    }
    public void setConstituicao(int constituicao) {
        this.constituicao = constituicao;
    }
    public boolean isSociedade() {
        return sociedade;
    }
    public void setSociedade(boolean sociedade) {
       this.sentido = (sociedade)?1:-1;
    }

    public void atacar(Mapa map, Personagem p)
    {
         
    }

    public void avancar(Mapa map, Personagem p)
    {

    }

}
