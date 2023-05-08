import entidades.HourContract;
import entidades.Worker;
import entidades.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc1 = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter Worker data:");
        System.out.println("Enter name ");
        String name = sc1.nextLine();
        System.out.println(" Level ");
        String level = sc1.nextLine();
        System.out.println("Base Salary:") ;
        double basesalary = sc1.nextDouble();

        Worker worker = new Worker(name,basesalary, WorkerLevel.valueOf(level));
        System.out.println(" Hou many contracts to this worker?");
        int n=  sc1.nextInt();
        for(int i =1;i <= n;i++){
            System.out.println("Enter contract #" + i + "data");
            System.out.print("Date DD/MM/YYYY");
            Date date = sdf.parse(sc1.next());
            System.out.println("Enter value per hour");
        Double valuePerHour = sc1.nextDouble();
            System.out.println("enter Duration ");
            int hours= sc1.nextInt();
            HourContract contract= new HourContract(valuePerHour, hours,date);
worker.addContract(contract);

        }
        System.out.println();
        System.out.println(" Enter month and year to calculate income(MM/YYYY");
     String mAndY = sc1.next();
     int month = Integer.parseInt(mAndY.substring(0,2));
     int year = Integer.parseInt(mAndY.substring(3));
        System.out.println("Name:" + worker.getName());
        System.out.println("Income for " + month + ":" +String.format("%.2f", worker.income(year, month)) );


















    }
}