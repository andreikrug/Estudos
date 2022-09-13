
package imdbcerto;


public enum Categoria 
{
    MARATONAR("Maratonar"),
    TOP10("Top10"),
    EXCLUSIVO("Exclusivo");
    
    private String descricao;
    
    Categoria(String descricao)
    {
        this.descricao = descricao;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
}
