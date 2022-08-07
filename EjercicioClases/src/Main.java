import java.util.Scanner;
public class Main {
    public static void  main(String[] args) {
     Scanner cmd = new Scanner(System.in);
     System.out.println("Ingrese su nombre:");
     String nombre = cmd.nextLine();

     System.out.println("Ingrese su edad:");
     int edad = cmd.nextInt();

     System.out.println("Ingrese su sexo:");
     String sexo = cmd.next();

     System.out.println("Ingrese su peso:");
     double peso = cmd.nextDouble();

     System.out.println("Ingrese su altura:");
     double altura = cmd.nextDouble();

     Persona persona1 = new Persona();
     Persona persona2 = new Persona(nombre, edad, sexo, peso, altura);

     //metodos set and get
     persona1.setNombre("Doly");
     persona1.setEdad(30);
     persona1.setSexo("M");
     persona1.setPeso(30);
     persona1.setAltura(1.30);

     System.out.println("Persona 1");
     MuestraMensajePeso(persona1);
     MuestraMensajeEdad(persona1);
     MuestraInformacion(persona1);
     System.out.println("Persona 2");
     MuestraMensajePeso(persona2);
     MuestraMensajeEdad(persona2);
     MuestraInformacion(persona2);





    }
 public static void MuestraMensajePeso(Persona p){
  int IMC =p.calcularIMC();
  if(IMC== p.pesoMedio){
   System.out.println("Se encuentra en su peso ideal");
  }else if (IMC==p.pesoBajo){
   System.out.println("La persona esta por debajo de su peso ideal");
  }else{
   System.out.println("La persona tiene sobrepeso");
  }
 }
 public static void MuestraMensajeEdad(Persona p){

  if(p.esMayordeEdad()){
   System.out.println("Es mayor de edad");

  }else{
   System.out.println("No es mayor de edad");
  }


 }
 public static void MuestraInformacion(Persona p){
  System.out.println("Persona :");
  System.out.println("Nombre :" + p.getNombre());
  System.out.println("Edad :" + p.getEdad());
  System.out.println("Sexo :" + p.getSexo());
  System.out.println("Peso :" + p.getPeso());
  System.out.println("Altura: "+ p.getAltura());


 }



}