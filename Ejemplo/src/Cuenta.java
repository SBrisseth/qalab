public class Cuenta {
    private String titular;
    private double cantidad;

    //constructor
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //metodos
    public double ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }
        return this.cantidad;
    }

    public double retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad = this.cantidad - cantidad;
        }
        return this.cantidad;
    }
}


