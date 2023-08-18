/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Estadio {
    String nombre;
    String ciudad;
    int capacidad;
    Equipo equipo;

    public Estadio(String nombre, String ciudad, int capacidad, Equipo equipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo = equipo;
    }
}
