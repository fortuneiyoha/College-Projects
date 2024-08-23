public class SumArrayValues {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArrayValues(array);
        System.out.println("Sum of array values: " + sum);
    }
    
    public static int sumArrayValues(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}