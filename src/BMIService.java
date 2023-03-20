public class BMIService {
    public double calculate(int weight, double height) {
        double bmi = weight / (height * height);
        return (int) bmi;

    }
}
