package parcial1_g2_adrianapacheco_jirethsalazar;



public class Sport extends Moto {
    private String motor;
    private String potencia;
    private String tanque;

    public Sport(String placa, int modelo, int cilindraje, String motor, String potencia, String tanque) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public String motorGarantia() {
        if (motor.equals("4T")) {
            return "La garantía de esta moto es por 2 años";
        } else if (motor.equals("monocilindricoo")) {
            return "La garantía de esta moto es por 1 año";
        } else {
            return "Es Tipo de motor no es reconocido";
        }
    }
}
