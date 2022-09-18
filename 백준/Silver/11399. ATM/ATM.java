import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 사람의 수

        int[] arr = new int[N]; //인출 시간 배열

        for (int i=0; i<N; i++)
            arr[i] = sc.nextInt();
            Arrays.sort(arr);

            int total_time =0;
            int wait_time=0;

            for (int i=0; i<N; i++) {
                wait_time += arr[i];
                total_time += wait_time;
            }
            System.out.println(total_time);
    }
}
