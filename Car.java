import java.awt.*;

public abstract class Car implements Movable {
    protected double enginePower;
    private double currentSpeed;
    private Color color;
    private final String modelName;
    private Point position;
    private double direction;

    public Car(String modelName, double enginePower, Color color) {
        this.modelName = modelName;
        this.enginePower = enginePower;
        this.color = color;
        this.currentSpeed = 0;
        this.position = new Point();
        this.direction = 0.0;
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

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
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

    @Override
    public void move() {
        position.translate((int) (Math.cos(Math.toRadians(direction)) * currentSpeed),
                           (int) (Math.sin(Math.toRadians(direction)) * currentSpeed));
    }

    @Override
    public void turnLeft() {
        direction = (direction - 90) % 360;
    }

    @Override
    public void turnRight() {
        direction = (direction + 90) % 360;
    }
}


