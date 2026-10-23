import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter information for one computer: ");
        Computer computer = new Computer();

        System.out.println("Enter ID: ");
        computer.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter manufacturer: ");
        computer.setManufacturer(scanner.next());
        scanner.nextLine();

        System.out.println("Enter price: ");
        computer.setPrice(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Computer information: ");
        computer.displayInfo();

        ArrayList<Computer> computers = new ArrayList<>();
        System.out.print("How many computers do you want to enter? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Computer " + i);
            Computer c = new Computer();

            System.out.print("Enter ID: ");
            c.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Enter manufacturer: ");
            c.setManufacturer(scanner.next());
            scanner.nextLine();

            System.out.print("Enter year of manufacture: ");
            c.setYear(scanner.nextInt());

            System.out.print("Enter price: ");
            c.setPrice(scanner.nextDouble());

            computers.add(c);
        }

        System.out.println("=== List of all computers ===");
        for (int i = 0; i < computers.size(); i++) {
            computers.get(i).displayInfo();
        }
        scanner.close();
    }
}
