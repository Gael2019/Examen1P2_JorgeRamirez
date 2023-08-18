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
public class Defensa extends Jugador {

    public Defensa(String nombre, int edad, String nacionalidad, String pieHabil, String equipo) {
        super(nombre, edad, nacionalidad, pieHabil, equipo);
    }
    
    
    @Override
    public void fisico() {
        this.fisico = generarCaracteristicaAleatoriaConLimite(13, 70, 100);
    }

    @Override
    public void agarre() {
        this.agarre = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void entrada() {
     this.entrada = generarCaracteristicaAleatoriaConLimite(13, 70, 100);
    }

    @Override
    public void ritmo() {
       this.ritmo = generarCaracteristicaAleatoriaConLimite(13, 70, 100);
    }

    @Override
    public void vision() {
         this.vision = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void passing() {
        this.passing = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void rating() {
    int res = (this.fisico + this.agarre + this.disparo + this.entrada + this.lanzamiento + this.passing + this.ritmo + this.regate + this.vision) / 9;
    this.rating = res;
    }

    @Override
    public void disparo() {
        this.disparo = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void lanzamiento() {
        this.lanzamiento = generarCaracteristicaAleatoria(6, 13);
    }

    @Override
    public void regate() {
        this.regate = generarCaracteristicaAleatoria(6, 13);
    }

    private int generarCaracteristicaAleatoria(int limit, int multip) {
        Random random = new Random();
        int numRand = random.nextInt(limit);
        return numRand * multip;
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
