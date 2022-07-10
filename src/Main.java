public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(78.0,1.82);
        System.out.println(index);
    }
}

