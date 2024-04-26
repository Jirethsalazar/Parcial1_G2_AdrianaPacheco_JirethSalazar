package parcial1_g2_adrianapacheco_jirethsalazar;

import javax.swing.JOptionPane;

public class Parcial1_G2_AdrianaPacheco_JirethSalazar {


    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenu();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    public static int mostrarMenu() {
        String[] opciones = {"Registro de automóviles", "Registro de motos", "Vendedor", "Salir"};
        String menu = "CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.\nREGISTRO DE VEHÍCULOS VENDIDOS\n\n";
        for (int i = 0; i < opciones.length; i++) {
            menu += (i + 1) + ". " + opciones[i] + "\n";
        }
        menu += "\nSeleccione una opción:";
        String opcionSeleccionada = JOptionPane.showInputDialog(null, menu);
        return Integer.parseInt(opcionSeleccionada);
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarAutomovil();
                break;
            case 2:
                registrarMoto();
                break;
            case 3:
                mostrarNombreApellido();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese una opción válida.");
                break;
        }
    }

    private static void registrarAutomovil() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa del automóvil (letras y números):");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del automóvil:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del automóvil:"));

        JOptionPane.showMessageDialog(null, "Registrando automóvil:\nPlaca: " + placa + "\nModelo: " + modelo + "\nPrecio: " + precio);
    }

    private static void registrarMoto() {
        String placa = JOptionPane.showInputDialog("Ingrese la placa de la moto (letras y números):");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo de la moto:"));
        int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje de la moto:"));

        JOptionPane.showMessageDialog(null, "Registrando moto:\nPlaca: " + placa + "\nModelo: " + modelo + "\nCilindraje: " + cilindraje);
    }

    private static void mostrarNombreApellido() {
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        JOptionPane.showMessageDialog(null, "Nombre del vendedor: " + nombreVendedor);
    }
}
