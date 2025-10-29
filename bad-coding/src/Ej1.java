import java.util.Random;
import java.util.Scanner;
public class Ej1 {
// Corregido por Javi, segun la creadora solo había que hacer que funcione y parar el bucle, no darle sentido
    public void main(String[] args) {
        startCode();
    }

    public void startCode() {
        while (true) {
            String idk = randomCode();
           // String experiment = randomWord();

            System.out.println("lol " + idk);
            break;
        }
    }

    public String randomCode() {
        Random random = new Random();
        int randomizer = random.nextInt(3);

        if (randomizer == 0) return "hola";
        if (randomizer == 1) return "hi";
        return "hello";
    }

    public String randomWord() {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        String literallyNothing = "";
        //Esta funcion no sirve para nada, estaba para despistar

        switch (choice) {
            case 1:
                System.out.println("aisdhoa");
                System.out.println(literallyNothing + " tf");
                break;
            case 2:
                System.out.println("mskadiwo");
                break;
            case 3:
                System.out.println("suaodyhwuoia");
                System.out.println(literallyNothing + " wtf");
                break;
            case 4:
                System.out.println("sioada");
                break;
            case 5:
                System.out.println("siofjanwka");
                break;
        }
        // no se como hacer algo simple no entendible ayuda
        return literallyNothing;
    }
}

