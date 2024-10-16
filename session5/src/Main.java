import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // for loop
        int[] values = {555, 233, 321, 444, 5323};
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        // enhanced for loop
        for (int value : values) {
            System.out.println(value);
        }

        int evenNumbers = 0;
        for (int i = 1; i <= 100_000_000; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                evenNumbers++;
            }

            // break the loop if we found 5 even numbers
            if (evenNumbers == 5) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // too many jumping statements are not recommended
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 5) {
                break;
            }

            if (i == 3) {
                continue;
            }

            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        // labeled break
        mare: for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break mare;
                }
                System.out.println("j: " + j);
            }
        }

        // labeled continue
        bogdan: for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);

            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    continue bogdan;
                }
                System.out.println("j: " + j);
            }

            System.out.println("here");
        }

        // won't work
        for (int i = 0; i < 10; i++) {
            outer:
            System.out.println("i: " + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    // won't work
                    // continue outer;
                }
                System.out.println("j: " + j);
            }
        }

        int x = 1;
        System.out.println(x);
        // post-increment
        x++; // x = x + 1; x += 1;
        System.out.println(x);

        // pre-increment
        ++x; // x = x + 1; x += 1;

        int y = 1;
        y = y + 1;
        System.out.println(y);

        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            // 'i' should be between [0, arr.length - 1] (inclusive)
        }

        // multi-dimensional array
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            // hardcoded means that we have a fixed value
            //System.out.println(matrix[i][0]);

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "]: " + matrix[i][j]);
//                for (int k = 0; k < matrix[i][j].length; k++) {
//                    for (int l = 0; l < matrix[i][j][k].length; l++) {
//
//                    }
//                }
            }
        }

        int[] array = {1, 2, 3, 4, 5};
        // sub-array
        int[] subArr = Arrays.copyOfRange(array, 1, 3);

        // sort the sub-array using Arrays.sort which uses the quicksort algorithm
        Arrays.sort(subArr);
        // binary search
        int i1 = Arrays.binarySearch(subArr, 10);
        System.out.println(i1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] otherArray = new int[n]; // by default all elements are 0

        for (int i = 0; i < otherArray.length; i++) {
            otherArray[i] = i;
        }

        // Arrays way
        int[] newArray = Arrays.copyOf(array, 15);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("newArray[" + i + "]: " + newArray[i]);
        }

        System.out.print("Enter the number of elements to add: ");
        int m = scanner.nextInt();
        int newSize = n + m;

        // Easy method
        int[] newOtherArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newOtherArray[i] = array[i];
        }

        // Hard method
        System.out.print("Enter the position where you want to add the elements: ");
        int position = scanner.nextInt();

        int[] tempArray = new int[n];
        for (int i = 0; i < n; i++) {
            tempArray[i] = array[i];
        }

        array = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            if (i < position || i >= m + position) {
                int tempArrayIndex = i;
                if (i >= position) {
                    tempArrayIndex = i - m;
                }
                array[i] = tempArray[tempArrayIndex];
            }
        }

        for (int i = 0; i < newSize; i++) {
            System.out.println("array[" + i + "]: " + array[i]);
        }
    }
}