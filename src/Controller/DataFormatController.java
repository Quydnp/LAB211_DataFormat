/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.DataFormatRepo;
import View.Menu;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class DataFormatController extends Menu<String>{
    private DataFormatRepo dataFormat;
    static String[] options = {
        "Validate phone number",
        "Validate email",
        "Validate date",
        "Exit"
    };
    Scanner sc;
    public DataFormatController() {
        super("========= VALIDATE PROGRAM =========", options);
        dataFormat = new DataFormatRepo();
        sc = new Scanner(System.in);
    }
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter phone number: ");
                String phone = sc.nextLine();
                System.out.println(dataFormat.checkPhone(phone));
                break;
            case 2:
                System.out.println("Enter email: ");
                String email = sc.nextLine();
                System.out.println(dataFormat.checkEmail(email));
                break;
            case 3:
                System.out.println("Enter date: ");
                String date = sc.nextLine();
                System.out.println(dataFormat.checkDate(date));
                break;
            case 4:
                System.exit(0);
        }
    }
    
}
