import java.time.LocalDate;

public class Car {
    private String name;
    private int  dateProduction;
    private  int km;
    private String owner;


  public  Car() {

    }

   public  Car(String name,int dateProduction,int km,String owner){
        this.name=name;
        this.dateProduction=dateProduction;
        this.km=km;
        this.owner=owner;

    }

    public String getName() {
        return name;
    }
    public  void setName(String name){
        this.name=name;
    }
    public int getDateProduction(){
        return dateProduction;
    }
    public void setDateProduction(int dateProduction){
        this.dateProduction=dateProduction;
    }
    public int getKm() {
        return km;
    }
    public void setKm(int km){
        this.km=km;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }

}
