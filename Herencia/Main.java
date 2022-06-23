package Herencia;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setModelo("New A1");
        coche.setKm(0);
        coche.setMarca("Audi");
        coche.mensaje();
        System.out.println("-------Coche----");
        System.out.println("Modelo: "+coche.getModelo());
        System.out.println("Km recorridos: "+coche.getKm()+" Km");
        System.out.println("Marca: "+coche.getMarca());;
        System.out.println(" ");

        Moto moto = new Moto();
        moto.setMotor("i-VTEC");
        moto.setKm(0);
        moto.setMarca("Honda");
        System.out.println("-------Moto-------");
        System.out.println("Marca: "+moto.getMarca());
        System.out.println("Km recorridos: "+moto.getKm()+" Km");
        System.out.println("Motor: "+moto.getMotor());

    }
}
