public class MinNMax {
    public static void main(String[] args) {
        int arr[] = {5, 3, 2, 4, 1, 7};
        int min = arr[0];
        int max = arr[0];
        int posmin = 0;
        int posmax = 0;

        for(int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                posmin = i + 1;
            }
            if (arr[i] > max){
                max = arr[i];
                posmax = i + 1;
            }
        }
        System.out.println("Minimum Element is " + min);
        System.out.println("Position of Minimum Element is " + posmin);
        System.out.println("Maximum Element is " + max);
        System.out.println("Position of Maximum Element is " + posmax);
    }
}
