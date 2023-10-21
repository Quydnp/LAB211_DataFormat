/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class DataFormatRepo implements IDataFormat {
    Scanner sc = new Scanner(System.in);
    private static final String PHONE_VALID = "(0[3|5|7|8|9])+([0-9]{8})";

    private static final String EMAIL_VALID
            = "[A-Za-z]\\w+@\\w+(\\.\\w+){1,3}$";

    @Override
    public String checkPhone(String phone) {
        String regex = PHONE_VALID;
        if (phone.equals("")) {
            System.out.print("Please input a non-empty string: ");
        } else if (!phone.matches(regex)) {
            System.out.println("Phone must not contain letters and start with 03/05/07/09 and contain exact 10 digits. ");
            System.out.println("Please enter a valid phone number:" + regex);
        }
        return "Phone number is valid ";
    }

    @Override
    public String checkEmail(String email) {
        String regex = EMAIL_VALID;
        if (email.equals("")) {
            System.out.print("Please input a non-empty string: ");

        } else if (!email.matches(regex)) {
            System.out.println("Please enter a valid email:" + regex);

        }
        return "Email is valid";
    }

    @Override
    public String checkDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false); // Tắt tính linh hoạt của định dạng
        try {
            Date parsedDate = dateFormat.parse(date);
            return "Date is valid"; // Định dạng đúng, không có lỗi
        } catch (ParseException e) {
            System.out.println("Date unvalid.");
            return "Date in correct format (dd/MM/yyyy)"; // Định dạng sai, trả về thông báo lỗi
        }
    }
}
