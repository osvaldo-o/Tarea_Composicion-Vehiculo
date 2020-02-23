
package Vehiculo;
import Piezas.*;

public class Vehiculo {
    private String color;
    private int km;
    private String marca;
    private Llanta llantas;
    private Motor motor;
    private Chasis chasis;

    public Vehiculo(String color, int km, String marca) {
        this.color = color;
        this.km = km;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int Km){
        this.km = Km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Llanta getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    public void acelerar(){
        motor.prenderMotor();
        llantas.rodar();
    }
    
    public void frenar(){
        llantas.dejarDeRodar();
        motor.apagarMotor();
    }
}
