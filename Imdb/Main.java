
package javaapplication1;


public class Main
{
    
    public static void main(String[] args)
    {
        Atores a = new Atores("leonardo");
        Atores a1 = new Atores("pedro");
        Cinema c = new Cinema(1, "sei la", 2014, "luciando", 'F');
        c.insereAtor(a);
        c.insereAtor(a1);
        Armazenamento arm = new Armazenamento(1);
        arm.insereFilme(c);
        arm.imprimeNomeDosFilmes();
       
        
    }
    
}
