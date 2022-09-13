
package imdbcerto;

import java.util.ArrayList;
import java.util.List;


public abstract class Streaming 
{
    List<AudioVisual> titulos = new ArrayList<AudioVisual>();
    List<Categoria> categorias = new ArrayList<Categoria>();
    
    public void insereTitulo(AudioVisual a )
    {
        titulos.add(a);
    }
    
    public void imprimeNomeTitulos()
    {
        for(AudioVisual a : titulos)
        {
            System.out.println(a.getNome()+"\n");
            System.out.println(a.getC().getDescricao());
        }
    }
    
    
    
   
    
    
}
