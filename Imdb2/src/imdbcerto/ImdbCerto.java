
package imdbcerto;


public class ImdbCerto 
{

    public static void main(String[] args) 
    {
       Filme f1 = new Filme("novo", 123, 2000, "acao", "exclusivo", 90);
       Serie s1 = new Serie("dark", 145, 2004, "acao", "exclusivo", 1);
       
       Atores a1 = new Atores("andrei");
       Atores a2 = new Atores("leonardo");
       
       f1.AdicionaAtor(a1);
       s1.AdicionaAtor(a2);
       
       Netflix n = new Netflix();
       
       n.insereTitulo(f1);
       n.insereTitulo(s1);
       n.imprimeNomeTitulos();
       

       s1.listaEpisodiosPorTemporada();
       
   
      
    }
    
}
