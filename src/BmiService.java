public class BmiService {

    public double calculate (double heightMeters, double weightKg) {
        double index = (weightKg / (heightMeters * heightMeters));
        return index;
    }
}
