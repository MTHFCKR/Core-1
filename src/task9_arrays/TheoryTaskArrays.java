package task9_arrays;

/**
 * 1.Что такое "разреженные массивы" (sparse arrays) и как они могут быть реализованы в Java?
 * Какие преимущества и недостатки связаны с использованием разреженных массивов?
 *
 * 2.Что такое "массивы высоких размерностей" (multidimensional arrays) в Java и как они могут быть использованы
 * для решения сложных задач?

 */
public class TheoryTaskArrays {
    /**
     * Что выведет код?
     */
    public class ArrayExample1 {
        public static void main(String[] args) {
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = i * 2;
            }
            for (int i = 0; i < 5; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    /**
     * Что выведет код?
     */
    public class ArrayExample2 {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = new int[arr1.length];

            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i] * 2;
            }

            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }
        }
    }


    /**
     * 1.это массивы, в которых большинство элементов имеют нулевое значение или значение по умолчанию. Они могут быть
     * реализованы в Java с использованием структуры данных, такой как HashMap, где ключами являются индексы элементов,
     * а значениями - сами элементы. Преимущества разреженных массивов включают экономию памяти при хранении больших
     * данных с большим количеством нулевых элементов. Недостатки включают дополнительные затраты на хранение ключей
     * и доступ к элементам, что может сказаться на производительности
     *
     * 2.это массивы, которые содержат другие массивы в качестве элементов. Например, двумерный массив может быть
     * представлен как массив массивов. Они могут быть использованы для решения сложных задач, таких как матричные
     * операции, обработка изображений и многие другие. Java поддерживает многомерные массивы с помощью синтаксиса
     * [][] или создания массивов массивов.
     *
     * 3.      0 2 4 6 8
     * 4.      2 4 6 8 10
     */


}
