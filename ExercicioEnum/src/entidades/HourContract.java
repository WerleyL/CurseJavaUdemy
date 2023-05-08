package entidades;
import java.util.Date;
public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

// construtor
    public HourContract(Double valuePerHour, Integer hours,Date date) {
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.date = date ;
    }
// metodos

    public Double totalValue(){
      return   valuePerHour * hours ;

    }//get and setter

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
