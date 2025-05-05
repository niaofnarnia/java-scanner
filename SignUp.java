import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIntroduce tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("\nIntroduce tu apellido:");
        String apellido = scanner.nextLine();

        System.out.println("\nElige un nombre de usuario:");
        String usuario = scanner.nextLine();

        System.out.println("\nElige una contraseña:");
        String contrasena = scanner.nextLine();

        System.out.println("\nHola " + nombre + " " + apellido + ", tu nombre de usuario es " + usuario + " y tu contraseña es " + contrasena + ", gracias por registrarte.");
    }
}
        //Vamos a crear un formulario de registro
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta