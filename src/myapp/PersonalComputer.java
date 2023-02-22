package myapp;

// inherits only one class!
public class PersonalComputer extends Product{
    
    // using composition to build this class!
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;


    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // *** hides the compenents from the main program !!!
    // public ComputerCase getComputerCase() {
    //     return computerCase;
    // }


    // public Monitor getMonitor() {
    //     return monitor;
    // }


    // public Motherboard getMotherboard() {
    //     return motherboard;
    // }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }
    
}
