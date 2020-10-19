
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Account {
    private int id;
    private double balance;
    private Date dateCreated;
    private static double annualInteresRate=0.1;

    public Account() {
        this.id=0;
        this.balance=0;
        this.dateCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated= new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInteresRate(double annualInteresRate) {
        Account.annualInteresRate = annualInteresRate;
    }
    
    public void withdraw(double kiveszek)
    {
        this.balance=this.balance-kiveszek;
    }
    
    public void deposit(double beteszek)
    {
        this.balance=this.balance+beteszek;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + '}';
    }
    
}
