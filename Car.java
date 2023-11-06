import java.awt.*;

public abstract class Car {
    protected double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;

    public Car(String modelName, double enginePower, Color color) {
        this.modelName = modelName;
        this.enginePower = enginePower;
        this.color = color;
        this.currentSpeed = 0;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    protected void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }
    
    public abstract void incrementSpeed(double amount);
    public abstract void decrementSpeed(double amount);
    
    public void gas(double amount) {
        incrementSpeed(amount);
    }

    public void brake(double amount) {
        decrementSpeed(amount);
    }
}
