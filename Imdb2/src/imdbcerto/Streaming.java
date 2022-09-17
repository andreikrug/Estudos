
package imdbcerto;

import java.util.ArrayList;
import java.util.List;


public class Streaming 
{
    List<AudioVisual> titulos = new ArrayList<AudioVisual>();
    List<Categoria> categorias = new ArrayList<Categoria>();
    private String nomeString;
    
    public void insereTitulo(AudioVisual a )
    {
        titulos.add(a);
    }
    
    public String getNomeString() {
        return nomeString;
    }

    public void setNomeString(String nomeString) {
        this.nomeString = nomeString;
    }
    
    // Metodo para retornar o nome de todos os filmes e series e sua respectiva categoria
    public void imprimeNomeTitulos()
    {
        for(AudioVisual a : titulos)
        {   
            if(a instanceof Filme)
            {
                System.out.println("Nome do filme: "+a.getNome());
                System.out.println("Categoria do filme: "+a.getC().getDescricao()); 
                System.out.println("Duracao do filme: "+((Filme)a).imprimeDuracaoDoFilme());
                System.out.println();
            } else 
            {
                System.out.println("Nome da serie: "+a.getNome());
                 System.out.println("Categoria da serie: "+a.getC().getDescricao()); 
                 System.out.println();
            }
           
        }
    }
    

    // Metódo construtor da classe Streaming
    public Streaming(String nome)
    {
        this.nomeString = nome;
    }
    

    // Procurar quantidade de temporadas e quantidade de episódios por temporada
    public void imprimirQuantidadeDeTemporadas( String nome)
    {
        for(AudioVisual a : titulos){
            if(a instanceof Serie)
            {
                if(a.getNome().equalsIgnoreCase(nome))
                {
                    ((Serie)a).listaEpisodiosPorTemporada();
                }
            }
        }
    }
    
    // Imprime todos os tiulos de determinada categoria
    public void pesquisarPorCategoria(String categoria)
    {
         for(AudioVisual a : titulos)
         {
            if(a.getC().getDescricao().equals(categoria))
            {
                 System.out.println("Nome do titulo: "+a.getNome());
            }
         }
    }

    
    
    
    
   
    
    
}
