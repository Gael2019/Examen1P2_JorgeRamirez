/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public abstract class Jugador {
    String nombre;
    int edad;
    String nacionalidad;
    String pieHabil;
    int rating;
    String equipo;
    int agarre;
    int lanzamiento;
    int ritmo;
    int entrada;
    int fisico;
    int vision;
    int passing;
    int regate;
    int disparo;

    public Jugador(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.pieHabil = pieHabil;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public int getRating() {
        return rating;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getAgarre() {
        return agarre;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public int getRitmo() {
        return ritmo;
    }

    public int getEntrada() {
        return entrada;
    }

    public int getFisico() {
        return fisico;
    }

    public int getVision() {
        return vision;
    }

    public int getPassing() {
        return passing;
    }

    public int getRegate() {
        return regate;
    }

    public int getDisparo() {
        return disparo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", pieHabil=" + pieHabil + ", rating=" + rating + ", "
         + "equipo=" + equipo + ", agarre=" + agarre + ", lanzamiento=" + lanzamiento + ", ritmo=" + ritmo + ", entrada=" + entrada + ", fisico=" + fisico + ", vision=" + vision + ", passing=" + passing + ", regate=" + regate + ", disparo=" + disparo + '}';
    }
    
    public abstract void fisico();
    public abstract void agarre();
    public abstract void entrada();
    public abstract void ritmo();
    public abstract void vision();
    public abstract void passing();
    public abstract void rating();
    public abstract void disparo();
    public abstract void lanzamiento();
    public abstract void regate();
    
}



