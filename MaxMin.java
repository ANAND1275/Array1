
public class MaxMin {
    public void max() {
        int arr[] = {1, 2, 3, 4, 5};
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println("Maximum score : " + maximum);
    }

    public void min() {
        int arr[] = {1, 2, 3, 4, 5};
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("Minimum score : " + minimum);
    }

    public static void main(String[] args) {
        MaxMin m = new MaxMin();
        m.max();
        m.min();
    }
}
