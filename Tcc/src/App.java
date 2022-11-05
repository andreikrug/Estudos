public class App {
    public static void main(String[] args) throws Exception
    {
        Pessoa pessoa = new Pessoa("Joao", "123", 1.80, 90, 20, 'M');
        Principal principal = new Principal();

        System.out.println(principal.calcularImc(pessoa));
    }
}
