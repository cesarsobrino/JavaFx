/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author cesar
 */
public class Agenda {
    private String nombre,sexo,foto,f_color;
    private float n_ingles;

    public Agenda(String nombre, String sexo, String foto, String f_color, float n_ingles) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.foto = foto;
        this.f_color = f_color;
        this.n_ingles = n_ingles;
    }

    public float getN_ingles() {
        return n_ingles;
    }

    public void setN_ingles(float n_ingles) {
        this.n_ingles = n_ingles;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

   
    public String getF_color() {
        return f_color;
    }

    public void setF_color(String f_color) {
        this.f_color = f_color;
    }

    @Override
    public String toString() {
        return "Agenda{" + "nombre=" + nombre + ", sexo=" + sexo + ", foto=" + foto + ", n_ingles=" + n_ingles + ", f_color=" + f_color + '}';
    }
    
}
