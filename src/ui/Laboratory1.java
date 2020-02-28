import java.util.Scanner;

public class Laboratory1 {

  public static void main(String args[]){

    Scanner lector = new Scanner(System.in);
    boolean salir = false;
    int opciones;//Guardaremos la opcion del usuario
    String cadenas1 = "";
    String cadenas2 = "";
    String cadenas3 = "";
    int i;
    double numero1 = 0;
    double numero2 = 0;
    double resultado = 0;
    double residuo = 0;
    

    while(!salir){

        System.out.println("1.- Ingrasar tres cadenas de caracteres");
        System.out.println("2.- Desplegar la longitud de cada una de las cadenas");
        System.out.println("3.- Concatenar las tres cadenas y mostrar en pantalla");
        System.out.println("4.- Mostrar el carácter ubicado en una posición de la cadena");
        System.out.println("5.- Mostrar los tres caracteres de cada una de las tres cadenas");
        System.out.println("6.- Ingresar dos números reales mayores a cero");
        System.out.println("7.- Mostrar la división de ambos números");
        System.out.println("8.- Mostrar la división y el residuo de la parte entera de ambos números");
        System.out.println("9.- Salir");

        System.out.println("Ingrese la acción a realizar: "); //Pretendo que el usuario escriba el número de opción
        opciones=lector.nextInt();

        switch(opciones){
            case 1:
                System.out.println("Has seleccionado la opcion 1");
                   System.out.print("Ingrese una cadena de caracteres");
                   lector.nextLine();
                   cadenas1 = lector.nextLine();
                   cadenas2 = lector.nextLine();
                   cadenas3 = lector.nextLine();
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
                   int length = cadenas1.length();
                   System.out.println("La longitud de una cadena es:" + cadenas1.length());
                   System.out.println("La longitud de una cadena es:" + cadenas2.length());
                   System.out.println("La longitud de una cadena es:" + cadenas3.length());
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3");
                   String union;
                   union = cadenas1+cadenas2+cadenas3;
                   System.out.println(union);
                break;
            case 4:
                System.out.println("Has seleccionado la opcion 4");
                    System.out.println("Ingrese la posicion");
                    i = lector.nextInt();
                    if(i < cadenas1.length() && i >= 0){
                      System.out.println(cadenas1.charAt(i));
                    } else {
                      System.out.println("Posicion no valida.");
                    }    
                break;
            case 5:
                System.out.println("Has seleccionado la opcion 5");
                    System.out.print("Ingrese la posicion");
                    i = lector.nextInt();
                    System.out.println(cadenas1.charAt(i));
                    System.out.println(cadenas2.charAt(i));
                    System.out.println(cadenas3.charAt(i));
                break;
            case 6:
                System.out.println("Has seleccionado la opcion 6");
                System.out.println("Introdusca dos números a partir del cero.");
                numero1 = lector.nextDouble();
                numero2 = lector.nextDouble();
                break;
            case 7:
                System.out.println("Has seleccionado la opcion 7");

                resultado = numero1/numero2;
                System.out.println("La division es " + numero1 + " / " + numero2 +" = " + resultado);
                break;
            case 8:
                System.out.println("Has seleccionado la opcion 8");

                resultado = (int)numero1/(int)numero2;
                residuo = (int)numero1%(int)numero2;
                System.out.println("La division es " + numero1 + " / " + numero2 +" = " + resultado);
                System.out.println("El residuo es " + numero1 + " % " + numero2 +" = " + residuo);
                break;
            case 9:
                salir=true;
                break;
            default:
                System.out.println("Solo números entre 1 y 9");
                break;
       }

     }

  }

}