
package javaapplication1;


public class Armazenamento 
{
    private Cinema[] cinema;
    
    public Armazenamento(int quantCinema){
        this.cinema = new Cinema[quantCinema];
    }
    
    public boolean insereFilme(Cinema c)
    {
        for(Cinema cin : cinema){
            if(cin == null)
            {
                cin = c;
                return true;
            }
        }
        return false;
    }
    
    public void imprimeNomeDosFilmes(){
        for(Cinema c  : cinema){
            System.out.println(c.getNomeFilme());
        }
    }
}
