import java.text.DecimalFormat;

public class Ui 
{    
    DecimalFormat df = new DecimalFormat("#,###.00");
    public void imprimeInfo(Pessoa p)
    {
          
        String gord = df.format(p.getGordura()); 
        String im = df.format(p.getImc()); 
        System.out.println("Ola,"+ p.getNome()+"\nSeu peso atual e: "+p.getPeso()+"\nSeu imc e: "+im+
        "Sua gordura e: "+gord
        );
    }
}
