package com.anel.atmanel;

import java.util.HashMap;
import java.util.Scanner;

public class UserReal implements BankService{
    HashMap<Integer, Integer> passw = new HashMap<>();
    String username,name,phone;
    double balance = 100000;
   Scanner in = new Scanner(System.in);
    public void checkBalance() {
        System.out.println("Your balance: " + balance);
    }

    public void withDraw() {
        System.out.println("Введите сумму которую хотите вывести: ");
        int minus = in.nextInt();
        balance = balance - minus;
        System.out.println("Сумма на счету: " + balance);
    }

    public void topUp() {
        System.out.println("Введите сумму которую на которую хотите пополнить счет: ");
        int plus = in.nextInt();
        balance = balance + plus;
        System.out.println("Сумма на счету: " + balance);
    }

    public void checkAcc() {
        System.out.println("Enter pin code: ");
        int pin = in.nextInt();
        if(passw.containsKey(pin)){
            System.out.println("OK!!");
        }
        else{
            System.out.println("Ошибка!!");
        }
    }
}
