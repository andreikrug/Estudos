
package javaapplication1;

import javaapplication1.Atores;

public class Cinema 
{
    private int codigo;
    private String nomeFilme;
    private int anoFilme;
    private String diretorFilme;
    
    private Atores[] atores = new Atores[2];
    private char tipo;

    public Cinema(int codigo, String nomeFilme, int anoFilme, String diretorFilme,  char tipo) 
    {
        this.codigo = codigo;
        this.nomeFilme = nomeFilme;
        this.anoFilme = anoFilme;
        this.diretorFilme = diretorFilme;
        
        this.tipo = tipo;
    }
    
    public boolean insereAtor(Atores a){
        for(Atores at : atores){
            if(at == null){
                at = a;
                return true;
            }
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    public String getDiretorFilme() {
        return diretorFilme;
    }

    public void setDiretorFilme(String diretorFilme) {
        this.diretorFilme = diretorFilme;
    }

    public Atores[] getAtores() {
        return atores;
    }

    public void setAtores(Atores[] atores) {
        this.atores = atores;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
