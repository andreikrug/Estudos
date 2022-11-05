public class Pessoa
{   
    private String nome ;
    private String codigo;
    private double altura, peso;
    private int idade;
    private char sexo;
    public Pessoa(String nome, String codigo, double altura, double peso, int idade, char sexo) {
        this.nome = nome;
        this.codigo = codigo;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

   

    
     
}