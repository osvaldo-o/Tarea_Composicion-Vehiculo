
package Piezas;

public class Chasis {
    private float peso;
    private String resistencia; // Alta Resistencia,  Muy Alta Resistencia, Ultra Alta Resistencia

    public Chasis(){
    }
    
    public Chasis(float peso, String resistencia) {
        this.peso = peso;
        this.resistencia = resistencia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
    
    public void resivirImpacto(){
        System.out.println("Impacto amortiguado");
    }
    
    public void estadoDelChasis(){
        System.out.println("Estado del chasis: "+this.resistencia);
    }
    
    
}
