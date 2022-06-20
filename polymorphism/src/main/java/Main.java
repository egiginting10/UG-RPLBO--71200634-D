import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public boolean isValid(String choose) {
        if(choose.equalsIgnoreCase("Triple Pythagoras") || choose.equalsIgnoreCase("Pangkat")) {
            return true;
        }
        return false;
    }
    public Main() {

        int x,y,z;
        String choose;
        do {
            System.out.print("Choose Math Expression {Triple Pythagoras | Pangkat}: ");
            choose = scanner.nextLine();
        } while (!isValid(choose));

        if(choose.equalsIgnoreCase("Triple Pythagor")) {
            System.out.print("Input x: ");
            x = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input y: ");
            y = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input z: ");
            z = scanner.nextInt();
            scanner.nextLine();
            TriplePythagoras triple = new TriplePythagoras(x,y,z);
            triple.display();
        }
        else {
            System.out.print("Input x: ");
            x = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Input y: ");
            y = scanner.nextInt();
            scanner.nextLine();
            Pangkat pangkat = new Pangkat(x,y);
            pangkat.display();
        }




    }

    public static void main(String[] args) {

        new Main();
    }

}