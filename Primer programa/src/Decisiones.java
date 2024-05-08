public class Decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }
        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible en su plan actual");
        }
// ejemplo de usar switch case//
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }

    }
}
