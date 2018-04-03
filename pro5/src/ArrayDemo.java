public class ArrayDemo {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 66, 7, 7, 88};
        String result = ArrayTools.PrintArrayItem(arr);
        int max = ArrayTools.getArrayItemMax(arr);
        System.out.println(result);
        System.out.println(max);
    }
}
