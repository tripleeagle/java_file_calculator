package eu.cz.lyalival.view;

import eu.cz.lyalival.controller.MainController;

import java.util.Scanner;

/**
 * @author lyalival
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the filePath:");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println("Result = " + MainController.calculateFromFile(sc.next()));
        }
    }
}
