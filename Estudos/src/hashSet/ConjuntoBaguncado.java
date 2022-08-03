package hashSet;

import java.util.HashSet;

public class ConjuntoBaguncado 
{   
    // Colections não aceitam tipos primitivos
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        HashSet conjunto = new HashSet();

        conjunto.add("olá"); // Converte de tipo primitivo para classe
        conjunto.add(true);
        conjunto.add(1.2);

        System.out.println(conjunto.size());

        System.out.println(conjunto.remove("olá"));

        System.out.println(conjunto.contains(true));
    }
}
