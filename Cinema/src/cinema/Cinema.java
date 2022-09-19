
package cinema;

import java.util.Scanner;


public class Cinema {

    
    public static void main(String[] args) 
    {   
        Scanner scanner = new Scanner(System.in);
        
        CriaCinema c = new CriaCinema(168);
        c.criaLugares();
       // c.ListaLugaresVagos();
        //System.out.println("\n\n!!!! Conforme os lugares apresentados, digite o lugar desejado");
        //String lugar = scanner.next();
        //c.reservaLugar(lugar);
         
       
       // c.totalDeLugaresOcupados();
       System.out.println( c.imprimeMapa());
        
        
        
        
    }
    
}
