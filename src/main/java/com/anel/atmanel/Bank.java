package com.anel.atmanel;


public class Bank {
    private BankService bankService;
//ioc
    public Bank(BankService bankService){
        this.bankService = bankService;
    }
 public void infoBank(){
     bankService.checkAcc();
 }



}
