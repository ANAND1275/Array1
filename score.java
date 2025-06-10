public class score {
    public void calculateScore() {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum of scores : " + sum);
        int avg = sum / arr.length;
        System.out.println("average of scores : " + avg);
    }
    public static void main(String[] args) {
        score s = new score();
        s.calculateScore();
    }
}
