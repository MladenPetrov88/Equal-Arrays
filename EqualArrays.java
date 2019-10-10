import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split(" ");
        String[] secontInput = scanner.nextLine().split(" ");

        int[] firstArray = new int[firstInput.length];
        int[] secondArray = new int[secontInput.length];
        int sum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = Integer.parseInt(firstInput[i]);
        }

        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = Integer.parseInt(secontInput[i]);
            }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                return;
            } else {
                sum += firstArray[i];

            }
        }
        System.out.printf("Arrays are identical. Sum: %d" ,sum);
    }
}

