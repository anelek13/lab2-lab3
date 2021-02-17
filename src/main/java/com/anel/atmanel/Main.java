package com.anel.atmanel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//       BankService bankService =  context.getBean("userBean", BankService.class);
//       Bank bank = new Bank(bankService);

        //di
        DBConnection dbConnection = context.getBean(DBConnection.class);
        System.out.println(dbConnection.getWelcomemsg());
        context.close();

//        Bank bank = context.getBean("bankBean", Bank.class);
//       bank.infoBank();
//       context.close();

        ArrayList<UserReal> accounts = new ArrayList<>();
        Scanner in = new Scanner(System.in);


//        UserReal user = new UserReal();
//        System.out.println(user.passw.put(12344,6789));
//        user.checkAcc();
        UserProxy userProxy = new UserProxy();
        System.out.println(userProxy.passw.put(12344, 6789));
        userProxy.checkAcc();
        System.out.println("Выберите действие: ");
        System.out.println("1.Check Balance");
        System.out.println("2.WithDraw");
        System.out.println("3.TopUp");
        System.out.println("4. Exit");
        int a = in.nextInt();

        switch (a) {
            case 1:
                userProxy.checkBalance();
                break;
            case 2:
                userProxy.withDraw();
                break;

            case 3:
                userProxy.topUp();
                break;

            case 4:
                System.out.println("Goodbye!!");
                System.exit(0);
        }
        }

    }


