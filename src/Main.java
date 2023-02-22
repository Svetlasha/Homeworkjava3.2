public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        double weightKg = 98;
        double heightMeters = 1.87;
        double index = (int) service.calculate (heightMeters, weightKg);
        System.out.println(index);
    }
}