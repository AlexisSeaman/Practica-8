package Practica8;
import java.util.Scanner;

class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Neumatico {
    private String marca;
    private int diametro;

    public Neumatico(String marca, int diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public int getDiametro() {
        return diametro;
    }
    
}

class Transmision {
    private String tipo;
    private int numVelocidades;

    public Transmision(String tipo, int numVelocidades) {
        this.tipo = tipo;
        this.numVelocidades = numVelocidades;
    }

    public String getTipo() {
        return tipo;
    }

    public int getnumVelocidades() {
        return numVelocidades;
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;
    private Transmision transmision;
    private Neumatico[] neumaticos;

    public Vehiculo(String marca, String modelo, Motor motor, Transmision transmision, Neumatico[] neumaticos) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.transmision = transmision;
        this.neumaticos = neumaticos;
    }

    public void imprimirDatosVehiculo() {
        System.out.println();
        System.out.println("Datos del Vehiculo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo de motor: " + motor.getTipo());
        System.out.println("Potencia del motor: " + motor.getPotencia());
        System.out.println("Tipo de transmision: " + transmision.getTipo());
        System.out.println("Numero de Velocidades: " + transmision.getnumVelocidades());

        System.out.println();
        System.out.println("Neumaticos:");
        for (int i = 0; i < neumaticos.length; i++) {
            System.out.println("Neumatico: " + (i + 1) + " Marca " + neumaticos[i].getMarca() + ", Diametro: " + neumaticos[i].getDiametro());
        }
    }
    
}


public class MainVehiclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Creacion de Vehiculo--");
        System.out.print("Cantidad de Neumaticos: ");
        int cantidadLlantas = scanner.nextInt();
        scanner.nextLine();
        Neumatico[] llantas = new Neumatico[cantidadLlantas];
        for (int i = 0; i < cantidadLlantas; i++) {
            System.out.println("Detalles de los Neumaticos " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Diametro: ");
            int diametro = scanner.nextInt();
            scanner.nextLine();
            llantas[i] = new Neumatico(marca, diametro);
        }

        System.out.println("Detalles del vehículo:");
        System.out.print("Marca: ");
        String marcaVehiculo = scanner.nextLine();
        System.out.print("Modelo: ");
        String modeloVehiculo = scanner.nextLine();
        System.out.print("Tipo de motor: ");
        String tipoMotor = scanner.nextLine();
        System.out.print("Potencia del motor: ");
        int potenciaMotor = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tipo de transmisión: ");
        String tipoTransmision = scanner.nextLine();
        System.out.print("Número de Velocidades: ");
        int numMarchas = scanner.nextInt();
        scanner.nextLine();

        Motor motor = new Motor(tipoMotor, potenciaMotor);
        Transmision transmision = new Transmision(tipoTransmision, numMarchas);
        Vehiculo coche = new Vehiculo(marcaVehiculo, modeloVehiculo, motor, transmision, llantas);
        coche.imprimirDatosVehiculo();

        scanner.close();
    }
}
