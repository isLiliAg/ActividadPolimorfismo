public class Contacto {
    private String nombre;
    private NumeroTelefono numeroTelefono;
    private String correoElectronico;

    public Contacto(String nombre, NumeroTelefono numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    public Contacto(String nombre, NumeroTelefono numeroTelefono) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }
    public Contacto(String nombre, String correoElectronico) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "ClaseContacto{" +
                "Nombre='" + nombre + '\'' +
                ", Numero de Telefono=" + numeroTelefono +
                ", Correo electronico='" + correoElectronico + '\'' +
                '}';
        }
    }


