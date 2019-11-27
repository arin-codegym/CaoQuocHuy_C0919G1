package MangVaPhuongThucJava;


import java.util.Random;

public class StopWatch {
    private long startTime;
    private long endTime;

    private StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    private void start() {
        this.startTime = System.currentTimeMillis();
    }

    private void stop() {
        this.endTime = System.currentTimeMillis();
    }

    private long getElapsedTime() {
        return (this.endTime - this.startTime);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        for (int value : array) {
            System.out.println(value + " ");
        }
    }
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        time.start();
        Random random = new Random();
        int[] arr = new int[100000];
        System.out.println("Danh sach phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(arr[i] + " ");
        }
        System.out.println("sau khi sap xep.");
        sort(arr);
        time.stop();
        System.out.println("\ntime is :" + time.getElapsedTime());
        System.out.println(arr[50000]);
    }
}

