public class BmiService {

    public int calculate (double heightMeters, double weightKgs){

        double bmi = weightKgs/Math.pow(heightMeters,2);

        return (int) bmi;
    }
}
