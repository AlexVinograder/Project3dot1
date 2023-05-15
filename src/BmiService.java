public class BmiService {
    public int calculate (double height, int weight) {
        double index = (double) (height * height);
        int bmi = (int) (weight / index);
        return bmi;
    }
}
