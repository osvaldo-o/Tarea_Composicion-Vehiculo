
package Vehiculo;

import Piezas.Chasis;
import Piezas.Llanta;
import Piezas.Motor;

public class main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo("Rojo",0,"Hyundai");
        auto.setLlantas(new Llanta(14, "Michelin"));
        auto.setMotor(new Motor("atmosférico", 320));
        auto.setChasis(new Chasis(1575, "Alta resistencia"));
        
        System.out.println("Datos del Vehiculo");
        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Color: "+auto.getColor());
        System.out.println("Km: "+auto.getKm());
        System.out.println("Tipo de motor: "+auto.getMotor().getTipo());
        System.out.println("Caballos de fuerza: "+auto.getMotor().getCaballos());
        System.out.println("Peso: "+auto.getChasis().getPeso()+"kg");
        System.out.println("");
        
        auto.acelerar();
        auto.getChasis().resivirImpacto();
        auto.getChasis().estadoDelChasis();
        auto.frenar();
        
    }
}
