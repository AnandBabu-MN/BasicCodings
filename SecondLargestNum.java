public class SecondLargestNum {
    public static void main(String[] args) {
        int a[] = {12, 14, 64, 34, 33};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[a.length - 2]);
    }
}
