import hashCode.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Produto p1 = new Produto("arroz", "20");
        Produto p2 = new Produto("arroz", "20");

        System.out.println(p1.equals(p2));
    }
}
