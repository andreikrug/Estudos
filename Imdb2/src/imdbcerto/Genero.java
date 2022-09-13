
package imdbcerto;

public enum Genero 
{
    ACAO("acao"),
    COMEDIA("comedia"),
    TERROR("terror");
    
    private String descricao;
    
    Genero(String desc){
        this.descricao = desc;
    }
    
    public String getDescricao()
    {
        return descricao;
    }
    
}
