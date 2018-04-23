
package poo_u3p1_herencia;

public class Estudiante extends Persona {
    private String noControl;
    private float promedio;
    
    public void setNoControl(String noControl){
        this.noControl = noControl;
    }
    public void setPromedio(float promedio){
        this.promedio = promedio;
    }
    public String getNoControl(){
        return this.noControl;
    }
    public float getPromedio(){
        return this.promedio;
    }
    
    public String consultarDatos(){
        return this.getRfc()+", "+this.getNombre()+", "+this.getNoControl()+", "+this.getPromedio()+", "+this.getEmail();
    }
}
