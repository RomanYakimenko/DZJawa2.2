public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int BMI = service.calculate(77, 1.73);
        System.out.println(BMI);
    }
}