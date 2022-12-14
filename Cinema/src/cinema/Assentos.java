
package cinema;


public class Assentos
{
    private String lugar;
    private boolean reservado;
    private char mapa = 'L';

    public String getLugar() {
        return lugar;
    }

    public char getMapa() {
        return mapa;
    }

    public void setMapa(char mapa) {
        this.mapa = mapa;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    public Assentos(String lugar, boolean reservado)
    {
        this.lugar = lugar;
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Assentos{" + "lugar=" + lugar + ", reservado=" + reservado + '}';
    }
    
    
    
    
}
