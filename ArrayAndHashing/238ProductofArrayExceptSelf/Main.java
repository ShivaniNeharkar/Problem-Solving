public class Main {
    public static void main(String[] args) {
        int[] numbers= {1,9,3,0};
        Solution s= new Solution();
        int[] array =s.productExceptSelf(numbers);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);}
    }
}
