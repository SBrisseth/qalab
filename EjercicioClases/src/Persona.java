public class Persona {
    //declaramos sus atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    // para el peso ideal constantes
    public  static int pesoBajo = -1;
    public  static int pesoMedio = 0;
    public static  int pesoAlto = 1;

    public Persona(){
        this("", 0, "M", 0, 0);

    }

    // constructor que recibe 5 parametros
    public Persona(String nombre,int edad,String sexo,double peso,double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    //metodos get and set
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //
    public int calcularIMC(){
        double pesoIdeal =  peso/Math.pow(altura,2);
        if (pesoIdeal<20){

            return pesoBajo;
        } else if (20<=pesoIdeal && pesoIdeal<=25) {
            return pesoMedio;
        }else{
            return pesoAlto;
        }
    }
    public boolean esMayordeEdad(){
        boolean Mayor = false;
        if (edad>=18){
            Mayor = true;
        }
        return Mayor;
    }
    public String comprobarSexo(String sexo){
        if (sexo=="H"){
            sexo = "Hombre";

        }else{
            sexo = "Mujer";

        }
        return  "Sexo :" + sexo;

    }



}
