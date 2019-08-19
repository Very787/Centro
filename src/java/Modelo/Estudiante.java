
package Modelo;


public class Estudiante {
  String ced;
  String nom;
  String ape;

    public Estudiante(String ced) {
       
    }

    public Estudiante(String nom, String ape) {
        this.nom = nom;
        this.ape = ape;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

   
  
   
  
}
