package com.booleanuk.core;

import java.util.ArrayList;

public class Costumer {

    private String costumerId;
    private ArrayList<Account> accounts = new ArrayList<>();

    Costumer(String id) {
        this.costumerId = id;
    }

    public void openAccount(Account account) {
       accounts.add(account);
    }


    public ArrayList<Account> getAccountsForCostumer() {
        return accounts;
    }
}
