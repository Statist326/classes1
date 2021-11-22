package by.epam.lab;

public class BusinessTrip {
    private double expenses;
    private int days;
    private String account;
    private final static double DAILY_ALLOWANCE = 40.20;
    public BusinessTrip(){

    }
    public BusinessTrip(String account,double expenses, int days) {
        this.expenses = expenses;
        this.days = days;
        this.account = account;
    }

    public double getExpenses() {
        return expenses;
    }

    public int getDays() {
        return days;
    }

    public String getAccount() {
        return account;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setAccount(String account) {
        this.account = account;
    }
   public double getTotal(){
        return (expenses+DAILY_ALLOWANCE)*days;
   }
    public void show(){
        System.out.println("rate = "+DAILY_ALLOWANCE+"\n"+"account = "+getAccount()+"\n"+"transport = "+getExpenses()+"\n"+"days = "+getDays()+"\n"+"total = "+getTotal());
    }

    @Override
    public String toString() {
        return account + ";"+expenses+";"+days+";"+getTotal();
    }
}