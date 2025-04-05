package electronics;

public class GPS {
    private String model;
    
    public GPS(String model) {
        this.model = model;
    }
    
    public void navigate(String destination) {
        System.out.println(model + " GPS navigating to " + destination);
    }
}