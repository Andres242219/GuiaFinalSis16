package clases;

/**Nombre de la clase: Facultad
 *Fecha: 25-05-2018
 * Version: 1.0
 * Copyright: ITCA-FEPADE
 * @author Orlando Andres Flores Benavides
 */
public class Facultad {
    private String universidad="UES";
    private String sede="San Salvador";
    private int numeroCarreras=29;

    public Facultad() {
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public int getNumeroCarreras() {
        return numeroCarreras;
    }
    public void setNumeroCarreras(int numeroCarreras) {
        this.numeroCarreras = numeroCarreras;
    }
    
    
}
