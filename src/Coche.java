/**
 * Coche.java
 *
 * Clase que representa un coche con matrícula, modelo y velocidad.
 *
 * @version 1.0
 */
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }
}
