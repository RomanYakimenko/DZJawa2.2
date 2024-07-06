public class BmiService {
    public int calculate(int kg, double sm) {

        int result;
        result = (int) (kg / (sm * sm));
        return result;

    }

}
