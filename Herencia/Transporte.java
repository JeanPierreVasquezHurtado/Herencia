package Herencia;

public class Transporte {

    protected double km;

    protected String marca;


    public void mensaje()
    {
        System.out.println("**********MEDIOS DE TRANSPORTE*********");
    }

    public void setKm(double v)
    {
        this.km = v;
    }

    public double getKm()
    {
        return km;
    }

    public void setMarca(String n) {
        this.marca = n;
    }

    public String getMarca() {
        return marca;
    }
}
