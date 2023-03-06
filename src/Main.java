public class Main {
    public static void main(String[] args) {

        Contacto contactoUno = new Contacto("Sara",
                    new NumeroTelefono("2637263737"));
        Contacto contactoDos = new Contacto("Luis",
                    new NumeroTelefono(41, "9384713401"));
        Contacto contactoTres = new Contacto("sofia",
                    new NumeroTelefono("448474734929"));
        Contacto contactoCuatro = new Contacto("David",
                    "david_gomez@bluewire.com");
        Contacto contactoCinco = new Contacto("Valentina",
                    new NumeroTelefono("2029384982"), "valentinahb@tech.com");

        System.out.println(contactoUno);
        System.out.println(contactoDos);
        System.out.println(contactoTres);
        System.out.println(contactoCuatro);
        System.out.println(contactoCinco);
    }
}


