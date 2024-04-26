package parcial1_g2_adrianapacheco_jirethsalazar;

public class Automovil {
    private String placa;
    private int modelo;
    private double precio;

    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}
