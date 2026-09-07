import java.util.Scanner;

public class BudgetCalculator{
   public static void main(String[] arg){
   
   Scanner input= new Scanner(System.in);
   int hourlyWage;
   int hoursPerWeek;
   int rent;
   double foodCost;
   double transport;
   // asking user for each value and read from input
   
   System.out.print("Hourly Wage: ");
   hourlyWage = input.nextInt();
   
   System.out.print("Hours Per Week: ");
   hoursPerWeek = input.nextInt();
   
   System.out.print("Rent Fee: ");
   rent = input.nextInt();
   
   System.out.print("Amount on food: ");
   foodCost = input.nextDouble();
   
   System.out.print("Transport fee cost: ");
   transport = input.nextDouble();
   
   int weekly_income = hourlyWage * hoursPerWeek;
   int monthly_income = weekly_income * 4;
   double total_monthly_expenses = rent + foodCost + transport;
   double remaining_money = monthly_income - total_monthly_expenses;
   
   System.out.println("Weekly income is $" + weekly_income);
   System.out.println("For a month is $" + monthly_income);
   System.out.println("Total monthly expenses will be $"+ total_monthly_expenses);
   System.out.println("Remaining expenditure is $" + remaining_money);
  } 
}