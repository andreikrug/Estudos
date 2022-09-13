
package imdbcerto;


public class Filme extends AudioVisual
{   private int duracao;
    public Filme(String nome, int codigo, int ano, String gen, String c, int duracao)
    {
        super(nome, codigo, ano, gen, c );
        this.duracao = duracao;
    }
}
