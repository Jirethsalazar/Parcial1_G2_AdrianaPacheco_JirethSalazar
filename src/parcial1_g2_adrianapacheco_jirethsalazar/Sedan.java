package parcial1_g2_adrianapacheco_jirethsalazar;


public class Sedan extends Automovil {
    private double motor;
    private boolean frenos;

    public Sedan(String placa, int modelo, double precio, double motor, boolean frenos) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public boolean getFrenos() {
        return frenos;
    }

    public String frenosABS() {
        if (frenos) {
            return "El automóvil tiene frenos ABS";
        } else {
            return "El automóvil no tiene frenos ABS";
        }
    }
}

