/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jorgeramirez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Ramirez
 */
public class Equipo {
    String nombre;
    String pais;
    List<Jugador> plantilla;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.plantilla = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(List<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", plantilla=" + plantilla + '}';
    }
    

    public void agregarJugador(Jugador jugador) {
        plantilla.add(jugador);
    }

    public int calcularRatingPromedio() {
        int totalRating = 0;
        for (Jugador jugador : plantilla) {
            totalRating += jugador.rating;
        }
        return totalRating / plantilla.size();
    }
}
