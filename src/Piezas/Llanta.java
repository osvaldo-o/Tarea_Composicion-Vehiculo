
package Piezas;

public class Llanta {
    private float diametro;
    private String marca;

    public Llanta(){
    }
    
    public Llanta(float diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void rodar(){
        System.out.println("Acelerando auto");
    }
    
    public void dejarDeRodar(){
        System.out.println("Frenando auto");
    }
}
