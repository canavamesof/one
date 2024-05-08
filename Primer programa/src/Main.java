public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Película:Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media =( 8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """ 
                El programador informático Thomas Anderson, 
                más conocido en el mundo de los "hacker" como Neo, 
                está en el punto de mira del temible agente Smith. 
                Fue lanzada en: 
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);
/*
        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String nombre2 = "Kenneth";
        int aulas = 4;

        String mensaje= """
                  Hola, %s!
                  Bienvenido al curso de Java.
                  Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje""".formatted(nombre2, aulas);

        System.out.println(mensaje); */

        int clasificacion = (int) (media /2);
        System.out.println(clasificacion);


    }
}