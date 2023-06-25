// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int w = 98;
        double h = 1.87;
        int bmiIndex = service.calculate(w, h);
        System.out.println("Body Mass Index: " + bmiIndex);

    }
}
