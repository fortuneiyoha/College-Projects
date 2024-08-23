public class SumArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        
        int[] resultArray = sumArrays(array1, array2);
        
        System.out.print("Result array: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] sumArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays must be of equal length");
            return null;
        } else {
            int[] result = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }
            return result;
        }
    }
}