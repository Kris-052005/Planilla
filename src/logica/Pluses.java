/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author krist
 */
public class Pluses {
    private int idPlus;
    private String nomPlus;
    private float porcIncremento; 

    public Pluses(int idPlus, String nomPlus, float porcIncremento) {
        this.idPlus = idPlus;
        this.nomPlus = nomPlus;
        this.porcIncremento = porcIncremento;
    }
   public Pluses() {
        this.idPlus = 0;
        this.nomPlus = "";
        this.porcIncremento = 0;
    }

    public int getIdPlus() {
        return idPlus;
    }

    public String getNomPlus() {
        return nomPlus;
    }

    public float getPorcIncremento() {
        return porcIncremento;
    }

    public void setIdPlus(int idPlus) {
        this.idPlus = idPlus;
    }

    public void setNomPlus(String nomPlus) {
        this.nomPlus = nomPlus;
    }

    public void setPorcIncremento(float porcIncremento) {
        this.porcIncremento = porcIncremento;
    }
   

    
}
