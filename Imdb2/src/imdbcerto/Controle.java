package imdbcerto;

import java.util.Scanner;

public class Controle 
{   
    
    Scanner scanner = new Scanner(System.in);
    int i = -1;
    public void fazerTudo(Streaming stream)
    {
        while(i<0)
        {
             System.out.println("!!!!!Menu de opcoes: ");
             System.out.println("#Digite 1 para ver o catalogo\n"
             +"#Digite 2 para pesquisar os filmes conforme sua categoria\n"+"#Digite 3 para sair do menu");
             System.out.println("***************************************************************");

             int valor = scanner.nextInt();

             if(valor == 1)
             {
                 stream.imprimeNomeTitulos();
                 System.out.println("***************************************************************");
             } else if(valor == 2)
             {   
                 System.out.println("digite a categoria desejada:\n "+"1. Maratonar\n"+"2. Top10\n"+"3. Exclusivo");
                 String entrada = scanner.next();
                 stream.pesquisarPorCategoria(entrada);
                 System.out.println("***************************************************************");
             } else if( valor == 3){
                 System.out.println("***************************************************************");
                 break;
             }
        }
    }
}
