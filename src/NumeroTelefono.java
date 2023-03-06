public class NumeroTelefono {
    private int codigoPais;
    private String numeroTelefono;

    public NumeroTelefono(String numeroTelefono) {
        if (numeroTelefono.length() > 10) {
            this.codigoPais = Integer.parseInt(numeroTelefono
                    .substring(0, numeroTelefono.length() - 10));
            this.numeroTelefono = numeroTelefono
                    .substring(numeroTelefono.length() - 10);
        } else {
            this.codigoPais = 1;
            this.numeroTelefono = numeroTelefono;
        }
    }

    public NumeroTelefono(int codigoPais, String numeroTelefono) {
        this.codigoPais = codigoPais;
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public String toString() {
        return "ClaseNumeroTelefono{" +
                "Codigo de Pais=" + codigoPais +
                ", Numero de telefono='" + numeroTelefono + '\'' +
                '}';
    }
}
