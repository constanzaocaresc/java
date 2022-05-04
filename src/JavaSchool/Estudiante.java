package JavaSchool;

public class Estudiante {

    private String rut, nombre;
    private Carrera carrera;

    public Estudiante(String rut, String nombre, Carrera carrera) {
        this.rut = rut;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public Estudiante() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void mostrarEstudiante() {
        System.out.println("Nombre          : " + nombre);
        System.out.println("Rut             : " + rut);
        System.out.println("Carrera         : " + carrera.getCarrera());

    }
}
