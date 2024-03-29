package app;

public class LowTemperatureObserver extends Observer{

    public LowTemperatureObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int temperature = subject.getTemperature();

        if (temperature <= 0) {
            System.out.println("-> LowTemperatureObserver: \nTemperature = " + temperature +
                    " degrees. \nWeight = 1 gram. \nColor = White");
        }
       else System.out.println("-> LowTemperatureObserver: \nI work at zero temperature or below zero.\n");
    }
}
