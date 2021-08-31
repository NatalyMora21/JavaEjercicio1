package infoUser;

import java.util.Scanner;

public class UseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario");
        String name = sc.next();

        System.out.println("Ingrese el nùmero de celular");
        String tel = sc.next();

        System.out.println("Ingrese la edad");
        int age = sc.nextInt();

        System.out.println("Bienvenid@ señor(a) " + name + " es un placer para nosotros contar con una persona de " + age + " años. " +
                "Próximamente nos comunicaremos con usted al numero " + tel + "\nFeliz Dia");

    }
}

