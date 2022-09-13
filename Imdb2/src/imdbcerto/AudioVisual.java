
package imdbcerto;

import java.util.ArrayList;
import java.util.List;


public abstract class AudioVisual 
{
    private String nome;
    private int codigo;
    private int ano;
    private Genero genero;
    private Categoria c;
    List<Streaming> streams = new ArrayList<Streaming>();
    
    List<Atores> atores = new ArrayList<Atores>();
    
    public AudioVisual(String nome, int codigo, int ano, String gen, String c)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.ano = ano;
        switch(gen)
        {
            case "acao":
                this.genero = Genero.ACAO;
                break;
            
            case "comedia":
                this.genero = Genero.COMEDIA;
                break;
            
            case "terror":
                this.genero = Genero.TERROR;
                break;
            
            default:
                System.out.println("Falhou");
               
                
        }
        
        switch(c)
        {
            case("maratonar"):
                this.c = Categoria.MARATONAR;
                break;
            
            case("top10"):
                this.c = Categoria.TOP10;
                break;
                
            case("exclusivo"):
                this.c = Categoria.EXCLUSIVO;
                break;
        } 
        
        
       
    }
    
    public void AdicionaAtor(Atores a)
    {
        atores.add(a);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void adicionaStreaming(Streaming s)
    {
        streams.add(s);
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Categoria getC() {
        return c;
    }

    public void setC(Categoria c) {
        this.c = c;
    }
    
    
    
    
     
    
}
