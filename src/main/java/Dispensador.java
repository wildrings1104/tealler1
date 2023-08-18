public class Dispensador {

    public String serial;

    public String marca;
    public int cantidadMaxima;
    public double cantidaActual;
    public boolean temperatura;

    public Dispensador(String serial, String marca, int cantidadMaxima, boolean temperatura) {
        this.serial = serial;
        this.marca = marca;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidaActual = 0; // Se inicia vacío
        this.temperatura = temperatura;
    }

    // Servir una cantidad especificada
    public void servir(int cantidad) {

        if (cantidaActual >= cantidad) {
            cantidaActual -= cantidad;
            System.out.println("Se han servido " + cantidad + " unidades.");
        } else {
            System.out.println("No hay suficiente cantidad para servir.");
        }

    }

    public void llenar() {
        cantidaActual = cantidadMaxima;
        System.out.println("El dispensador ha sido llenado.");
    }
    public void vaciar() {
        cantidaActual = 0;
        System.out.println("El dispensador ha sido vaciado.");
    }
    public void calentar(boolean temperatura){
        this.temperatura= true;
        System.out.println("El dispensador esta caliente.");
    }
    public void enfriar(boolean temperatura){
        this.temperatura= false;
        System.out.println("El dispensador esta Frio.");
    }
    public void mostrarNivel() {
        System.out.println("Nivel actual de cantidad: " + cantidaActual);
    }


}

