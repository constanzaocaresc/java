package JavaSchool;

public class Nota extends Estudiante {

    private Double nota;
    private String asignatura;
    private Fecha fecha = new Fecha();

    public Nota(Double nota, String asignatura, Fecha fecha, String rut, String nombre, Carrera carrera) {
        super(rut, nombre, carrera);
        this.nota = nota;
        this.asignatura = asignatura;
        this.fecha = fecha;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
   public void mostrarNota() {
      
        super.mostrarEstudiante();
        System.out.println("Asignatura      : " + asignatura);
        System.out.println("Notas           : " + nota);
        System.out.println("Fecha           : " + fecha.getFecha());
        

    }
 
    
}
