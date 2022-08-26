// encapsulation
// copy objects

public class Automobile {
    
    private String make;
    private String model;
    private int year;

    Automobile(String make, String model, int year){

        // this.make = make;
        this.setMake(make);
        // this.model = model;
        this.setModel(model);
        // this.year = year;
        this.setYear(year);
    }

    // copy constructor - copy objects(direct)
    Automobile(Automobile x){
        this.copy(x);
    }

    // getter methods
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    // setter methods
    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    // copy objects
    public void copy(Automobile x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }
}
