import java.util.Scanner;

public class Cancion {
    
    public static void main(String[] args) {
        audio repro = new audio();
        repro.setVisible(true);
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al cuestionario musical!");

      
        System.out.println("¿Quién es el artista de esta canción?");
        String respuestaArtista = scanner.nextLine();

        System.out.println("¿Cuál es el título de la canción?");
        String respuestaTitulo = scanner.nextLine();
        
        System.out.println("¿Que genero de musica es el que se esta reproduciendo?");
        String respuestaGenero = scanner.nextLine();
        
        System.out.println("Te gusta este cantante?");
        String respuestaCantante = scanner.nextLine();
        
        

        System.out.println("¡Cuestionario completado!");
        System.out.println("Tus respuestas:");
        System.out.println("Artista: " + respuestaArtista);
        System.out.println("Título: " + respuestaTitulo);
        System.out.println("El genero es: " + respuestaGenero);
        System.out.println("Te gusta el cantante: " + respuestaCantante);
        
    }

    
        
}

