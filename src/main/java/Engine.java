public class Engine {

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    protected int power;

    public String getFuelType() {
        return "A500";
    }

    public static void main(String[] args) {

        class XFuelEngine extends Engine {
            @Override
            public String getFuelType() {
                return "XFuel";
            }
        }

        Engine engine = new Engine();

        System.out.println(engine.getFuelType());

        Engine basicEngine = new Engine();
        System.out.println(basicEngine.getFuelType()); //A500

        Engine xFuelEngine = new XFuelEngine();
        System.out.println(xFuelEngine.getFuelType()); //XFuel
    }
}