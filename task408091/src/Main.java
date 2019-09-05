public class Main {
    public static void main(String[] args) {
        StopWatch s1 = new StopWatch();
        s1.Start();
        int[] arr = StopWatch.Random(10000);
        s1.Stop();

        long time = s1.getElapsedTime();
        System.out.println(time + " milli second");
        Print(arr);
    }

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
