public class App {
    public static void main(String[] args) throws Exception {
        String dia1 = "";
        String stringdia1 = "";
        int numDia1 = 0;
        boolean correctodia1 = false;

        do {
            System.out.println("Por favor introduzca la primera hora.");
            dia1 = System.console().readLine("Día: ").toLowerCase();

            switch (dia1) {
                case "1", "lunes" -> {
                    correctodia1 = true;
                    numDia1 = 1;
                    stringdia1 = "lunes";
                }
                case "2", "martes" -> {
                    correctodia1 = true;
                    numDia1 = 2;
                    stringdia1 = "martes";
                }
                case "3", "miércoles", "miercoles" -> {
                    correctodia1 = true;
                    numDia1 = 3;
                    stringdia1 = "miercoles";
                }
                case "4", "jueves" -> {
                    correctodia1 = true;
                    numDia1 = 4;
                    stringdia1 = "jueves";
                }
                case "5", "viernes" -> {
                    correctodia1 = true;
                    numDia1 = 5;
                    stringdia1 = "viernes";
                }
                case "6", "sabados" -> {
                    correctodia1 = true;
                    numDia1 = 6;
                    stringdia1 = "sabado";
                }
                case "7", "domingo" -> {
                    correctodia1 = true;
                    numDia1 = 3;
                    stringdia1 = "domigo";

                }
                default -> {
                    System.out.println(
                            "Introduce dia de la semana (lunes, Martes, miercoles, jueves, viernes, sabado y domingo) o su numero correspondientediente (1-7)");
                    correctodia1 = false;
                }
            }

        } while (!correctodia1);

        int hora1 = 0;
        boolean correctohora1 = false;

        do {
            hora1 = Integer.parseInt(System.console().readLine("Hora: "));
            if (hora1 >= 0 && hora1 <= 23)
                correctohora1 = true;
            else {
                correctohora1 = false;
                System.out.println("Debe introducir una hora entre 0 y 23");
            }
        } while (!correctohora1);

        String dia2 = "";
        String stringdia2 = "";
        int numDia2 = 0;
        boolean correctodia2 = false;

        do {
            System.out.println("Por favor introduzca la segunda hora.");
            dia2 = System.console().readLine("Día: ").toLowerCase();

            switch (dia2) {
                case "1", "lunes" -> {
                    correctodia2 = true;
                    numDia2 = 1;
                    stringdia2 = "lunes";
                }
                case "2", "martes" -> {
                    correctodia2 = true;
                    numDia2 = 2;
                    stringdia2 = "martes";
                }
                case "3", "miércoles", "miercoles" -> {
                    correctodia2 = true;
                    numDia2 = 3;
                    stringdia2 = "miércoles";
                }
                case "4", "jueves" -> {
                    correctodia2 = true;
                    numDia2 = 4;
                    stringdia2 = "jueves";
                }
                case "5", "viernes" -> {
                    correctodia2 = true;
                    numDia2 = 5;
                    stringdia2 = "viernes";
                }
                case "6", "sabados" -> {
                    correctodia2 = true;
                    numDia2 = 6;
                    stringdia2 = "sabados";
                }
                case "7", "domingo" -> {
                    correctodia2 = true;
                    numDia2 = 7;
                    stringdia2 = "domingo";
                }
                default -> {
                    System.out.println(
                            "Introduce dia de la semana (lunes, Martes, miercoles, jueves, viernes, sabado y domingo) o su numero correspondientediente (1-7)");
                    correctodia2 = false;
                }
            }
            if (dia1.equals(dia2) || numDia1 > numDia2) {
                System.out.println("Debes inroducir un dia posterior al anterior");
                correctodia2 = false;
            }

        } while (!correctodia2);

        int hora2 = 0;
        boolean correctohora2 = false;

        do {
            hora2 = Integer.parseInt(System.console().readLine("Hora: "));
            if (hora2 >= 0 && hora2 <= 23)
                correctohora2 = true;
            else {
                correctohora2 = false;
                System.out.println("Debe introducir una hora entre 0 y 23");
            }
        } while (!correctohora2);

        int horaprimerdia = ((numDia1 - 1) * 24) + hora1;
        int horasegudodia = ((numDia2-1) * 24) + hora2;
        int horastranscuridad = horasegudodia - horaprimerdia;

        System.out.printf("Entre las %d:00h del %s y las %d:00h del %s hay %d horas/s", hora1, stringdia1, hora2,
                stringdia2, horastranscuridad);
    }
}
