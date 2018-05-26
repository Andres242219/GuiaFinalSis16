
package clases;

/**Nombre de la clase: Ejercicio5
 *Fecha: 25-05-2018
 * Version: 1.0
 * Copyright: ITCA-FEPADE
 * @author Orlando Andres Flores Benavides
 */
public class Ejercicio5 {
   
    private String nombre;
    private String carnet;
    private double promedioTeoria;
    private double promedioPractica;
    private double promedioFinal;

    public Ejercicio5() {
    }

    public Ejercicio5(String nombre, String carnet, double promedioTeoria, double promedioPractica, double promedioFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedioTeoria = promedioTeoria;
        this.promedioPractica = promedioPractica;
        this.promedioFinal = promedioFinal;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioTeoria() {
        return promedioTeoria;
    }

    public void setPromedioTeoria(double promedioTeoria) {
        this.promedioTeoria = promedioTeoria;
    }

    public double getPromedioPractica() {
        return promedioPractica;
    }

    public void setPromedioPractica(double promedioPractica) {
        this.promedioPractica = promedioPractica;
    }
    
}
