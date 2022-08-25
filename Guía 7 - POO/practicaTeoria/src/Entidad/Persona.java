package Entidad;
public class Persona {
    public String nombre;
    public int edad;
    public String lugarDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, int edad, String lugarDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }

    public void setLugarDeNacimiento(String lugarDeNacimiento) {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }
    
    
}
