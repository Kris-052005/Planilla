/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author krist
 */
public class Puestos {
    private int idPuesto;
    private String nomPuesto;
    private double Salario;

    public Puestos(int idPuesto, String nomPuesto, double Salario) {
        this.idPuesto = idPuesto;
        this.nomPuesto = nomPuesto;
        this.Salario = Salario;
    }
 public Puestos() {
        this.idPuesto = 0;
        this.nomPuesto = "";
        this.Salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public double getSalario() {
        return Salario;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
}
