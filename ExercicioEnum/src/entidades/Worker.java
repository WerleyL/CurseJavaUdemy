package entidades;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Double income;
    private Double basesalary;
    private WorkerLevel level;
    private List<HourContract> contracts = new ArrayList<>();

    // Construtor
    public Worker(String name, Double basesalary, WorkerLevel level) {
        this.name = name;
        this.basesalary = basesalary;
        this.level = level;

    }//metodos

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = basesalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c : contracts) {
            calendar.setTime(c.getDate());
            int c_year = calendar.get(Calendar.YEAR);
            int c_month = 1 + calendar.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }


    // get and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(Double basesalary) {
        this.basesalary = basesalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

}