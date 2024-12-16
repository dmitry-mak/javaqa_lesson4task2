public class Main {
    public static void main(String[] args) {

        double bodyHeightMeters = 1.87;
        double bodyWeightKgs = 98;
        BmiService service = new BmiService();

        System.out.println("Индекс массы тела составляет: " + service.calculate(bodyHeightMeters, bodyWeightKgs));

    }
}