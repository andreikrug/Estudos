package hashCode;

public class Produto 
{
    private String nome;
    private String preco;

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }



    public boolean Equals(Object objeto)
    {
         if(objeto instanceof Produto)
         {
             Produto p = (Produto) objeto;

             boolean nomeIgual = p.nome.equals(this.nome);
             boolean precoIgual = p.preco.equals(this.preco);

             return nomeIgual && precoIgual;
            
                
             

         } else {
            return false;
         }
    }

   
}
