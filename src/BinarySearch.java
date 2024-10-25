import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] number = {1, 44, 8, 5, 32, 64, 99, 3, 23, 11, 84};
        Arrays.sort(number);
        int left = 0;
        int right = number.length - 1;
        int index = binarySearch(number, left, right, 33);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(number[index]);
        }

    }

    public static int binarySearch(int[] number, int left, int right, int key) {
        int mid = left + (right - left) / 2;
        if (right >= left) {
            if (key == number[mid]) {
                return mid;
            } else if (key > number[mid]) {
                return binarySearch(number, mid + 1, right, key);
            } else {
                return binarySearch(number, left, mid- 1, key);
            }
        }
        return -1;
    }
}
