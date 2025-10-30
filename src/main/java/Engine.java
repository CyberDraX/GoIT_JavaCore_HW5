public class Engine {
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private int power;

    public String getFuelType() {
        return "A500";
    }

    static void main(String[] args) {
        Engine engine = new Engine();

        System.out.println(engine.getFuelType());
    }
}