public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 56.6;
        double height = 170.1;

        double index = service.calculate(weight, height);

        System.out.println(index);


    }
}

