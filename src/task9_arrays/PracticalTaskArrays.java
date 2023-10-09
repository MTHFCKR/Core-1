package task9_arrays;

/**
 * У вас есть массив целых чисел. Найдите максимальную
 * подпоследовательность, в которой каждый следующий элемент больше
 * предыдущего на 1.
 */
public class PracticalTaskArrays {











































    /**
     * public class MaxIncreasingSubsequence {
     *     public static void main(String[] args) {
     *         int[] arr = {1, 2, 3, 4, 0, 1, 2, 3, 4, 5};
     *         int[] result = findMaxIncreasingSubsequence(arr);
     *
     *         System.out.print("Максимальная подпоследовательность: ");
     *         for (int num : result) {
     *             System.out.print(num + " ");
     *         }
     *     }
     *
     *     public static int[] findMaxIncreasingSubsequence(int[] arr) {
     *         int n = arr.length;
     *         int maxLength = 0;
     *         int endIndex = 0;
     *         int currentLength = 1;
     *
     *         for (int i = 1; i < n; i++) {
     *             if (arr[i] == arr[i - 1] + 1) {
     *                 currentLength++;
     *             } else {
     *                 currentLength = 1;
     *             }
     *
     *             if (currentLength > maxLength) {
     *                 maxLength = currentLength;
     *                 endIndex = i;
     *             }
     *         }
     *
     *         int[] result = new int[maxLength];
     *         for (int i = 0; i < maxLength; i++) {
     *             result[i] = arr[endIndex - maxLength + 1 + i];
     *         }
     *
     *         return result;
     *     }
     * }
     */
}
