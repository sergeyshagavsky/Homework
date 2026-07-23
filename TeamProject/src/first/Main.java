package first;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите пароль: ");
        int password = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите e-mail: ");
        String mail = scanner.nextLine();

        User user = new User(name, password, mail);

        System.out.println(user);

    }

}