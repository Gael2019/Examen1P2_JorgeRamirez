/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_jorgeramirez;

import java.util.Random;

/**
 *
 * @author Jorge Ramirez
 */
public class Portero extends Jugador {
    
    public Portero(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }

    @Override
    public void fisico() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agarre() {
        this.agarre = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void entrada() {
       this.entrada = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void ritmo() {
       
    }

    @Override
    public void vision() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void passing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void rating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void disparo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void lanzamiento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void regate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int generarCaracteristicaAleatoria(int limit, int multiplier) {
        Random random = new Random();
        int numRand = random.nextInt(limit);
        return numRand * multiplier;
    }

    private int generarCaracteristicaAleatoriaConLimite(int limit, int min, int max) {
        boolean vf = true;
        int res = 0;

        while (vf) {
            res = generarCaracteristicaAleatoria(limit, 12);
            if (res >= min && res < max) {
                vf = false;
            }
        }
        return res;

    }
}
