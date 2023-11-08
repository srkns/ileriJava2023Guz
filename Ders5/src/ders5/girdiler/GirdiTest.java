package ders5.girdiler;

import java.util.Scanner;  // Import the Scanner class

class GirdiTest {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Kullanıcı adınızı girin:");

        String userName = tarayici.nextLine();  // Read user input
        System.out.println("Kullanıcı adınız: " + userName);  // Output user input
    }

}
