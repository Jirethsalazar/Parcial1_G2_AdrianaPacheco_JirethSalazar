package parcial1_g2_adrianapacheco_jirethsalazar;



public class ChevroletSail extends Sedan {
    private String tanque;
    private boolean seguro;



    public ChevroletSail(String placa, int modelo, double precio, double motor, boolean frenos, String tanque, boolean seguro) {
        super(placa, modelo, precio, motor, frenos);
        this.tanque = tanque;
        this.seguro = seguro;
    }

    public String Seguro() {
        if (seguro) {
            return "El automóvil tiene seguro todo riesgo";
        } else {
            return "El automóvil no tiene seguro todo riesgo";
        }
    }

    public String precioSeguro() {
        if (getPrecio() > 50000000) {
            double valorSeguro = getPrecio() * 0.10;
            return "El valor del seguro es: " + valorSeguro;
        } else {
            return "No hay valor del seguro puesto que el valor del automóvil es menor a 50.000.000";
        }
    }

    public String getTanque() {
        return tanque;
    }

    public boolean getSeguro() {
        return seguro;
    }
}
