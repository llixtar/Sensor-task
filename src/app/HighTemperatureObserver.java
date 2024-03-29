package app;

public class HighTemperatureObserver extends Observer {

    public HighTemperatureObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        int temperature = subject.getTemperature();

        if (temperature > 0) {
            int weight = 1 + (temperature * 2);

            System.out.println("-> HighTemperatureObserver: \nTemperature = " + temperature +
                    " degrees. \nWeight = " + weight +
                    " gram. \nColor = Black");
        } else System.out.println("-> HighTemperatureObserver: \nI work at temperatures above zero.");
    }
}
