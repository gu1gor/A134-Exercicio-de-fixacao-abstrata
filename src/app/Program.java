package app;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List <TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" +(i+1)+ " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0); 
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                
                list.add(new Individual(name, anualIncome, healthExpenditures));
                
            }else{
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
            
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(TaxPayer tp : list){
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
            
            
        }
        
        double sum = 0.0;
        for(TaxPayer tp : list){
            sum += tp.tax();
            
        
        
    }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        
        
        
        
        System.out.println("TESTE GITHUB");
        
        
        sc.close();
    }
    
}
