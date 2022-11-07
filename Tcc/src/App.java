public class App {
    public static void main(String[] args) throws Exception
    {
        Pessoa pessoa = new Pessoa("Joao", "123", 180, 90, 20, 'M');
        Pessoa pessoa2= new Pessoa("Joao", "123", 180, 90, 20, 'F');
        Principal principal = new Principal();
        principal.inserirPessoa(pessoa);
        principal.inserirPessoa(pessoa2);
        principal.operacaoPrincipal();


    
    }
}
