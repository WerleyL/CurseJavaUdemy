package entidades;


public class worker {
    private String name;
    private Double income;
    private Double basesalary;
    private WorkerLevel level;
// Construtor
    public worker(String name,Double basesalary, WorkerLevel level) {
        this.name = name;
        this.basesalary = basesalary;
        this.level = level;

    }//metodos

    public void addContract(HourContract contract){
        contract.add(contract);
    }
    public void removeContract(HourContract contract){}
    public Double income(int year, int  month){
         return year + "/" + month;

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