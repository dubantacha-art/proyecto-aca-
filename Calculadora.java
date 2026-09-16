import java.util.ArrayList;

public class Calculadora {
    private String marca;
    private ArrayList<Double> historialResultados;

    public Calculadora(String marca) {
        this.marca = marca;
        this.historialResultados = new ArrayList<>();
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double sumar(double a, double b) {
        double resultado = a + b;
        historialResultados.add(resultado); // Agregamos a la lista
        return resultado;
    }

    public double restar(double a, double b) {
        double resultado = a - b;
        historialResultados.add(resultado);
        return resultado;
    }

    public double multiplicar(double a, double b) {
        double resultado = a * b;
        historialResultados.add(resultado);
        return resultado;
    }

    public double dividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            throw new DivisionPorCeroException("Error: No se puede dividir entre cero.");
        }
        double resultado = a / b;
        historialResultados.add(resultado);
        return resultado;
    }

    public void mostrarHistorial() {
        System.out.println("--- Historial de resultados ---");
        // Recorrido de la lista utilizando un ciclo for-each
        for (Double resultado : historialResultados) {
            System.out.println("Resultado: " + resultado);
        }
    }
} 
