public class BmiService {

    public int calculate(int weightImMetres, double heightInCentimetres) {
        int bmi = (int) (weightImMetres / (heightInCentimetres * heightInCentimetres));
        return bmi;
    }
}
