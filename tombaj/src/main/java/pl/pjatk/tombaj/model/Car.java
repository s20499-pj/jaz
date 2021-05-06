package pl.pjatk.tombaj.model;

public class Car {
    private String model;

    public Car(){
        this.model = "multipla";
    }

    public Car(String model){
        this.model=model;
    }

    public String getModel() {
        return model;
    }
}
