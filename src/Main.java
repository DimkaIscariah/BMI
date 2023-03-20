public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        int weight = 76;
        double height = 1.77;
        double bmi = service.calculate(weight, height);

        System.out.println(bmi);

    }
}