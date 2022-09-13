

package imdbcerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Serie extends AudioVisual
{
    
    

    public List<Temporadas> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporadas> temporadas) {
        this.temporadas = temporadas;
    }
    
   List<Temporadas> temporadas = new ArrayList<Temporadas>();
   
   public void insereTemporada(Temporadas t)
   {
       temporadas.add(t);
   }
   
   Scanner scanner = new Scanner(System.in);
   
   public Serie(String nome, int codigo, int ano, String gen, String c, int temporadas)
    {
        super(nome, codigo, ano, gen, c);
        for(int i = 0; i<temporadas; i++)
        {
            System.out.println("Digite a quantidade de episodios da temporada "+(i+1));
            int val = scanner.nextInt();
            this.temporadas.add(new Temporadas(val));
        }
       
    }
   public void listaEpisodiosPorTemporada()
   {   int i = 1;
       for(Temporadas t : temporadas)
       {
           System.out.println("Numero de episodios na temporada "+i+" :"+ t.getEpisodios());
           i++;
       }
   }
}
