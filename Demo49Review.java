public class Demo49Review {
    public static void main(String[] args) {
        int[] array = {8, 20, 6, 1, 3, 5};
        inverse(array);
        bubble(array);
        arrayPrint(array);

    }

    /**
     * 打印数组规范
     *
     * @param array
     */
    public static void arrayPrint(int[] array) {
        System.out.print("[ ");
        for (int i = 0, j = array.length - 1; i <= j; i++) {
            if (i < j) {
                System.out.print(array[i] + " , ");
            } else {
                System.out.println(array[i] + " ]");
            }
        }
    }

    public static void inverse(int[] array) {
        for (int i = 0, j = (array.length) / 2; i <= j; i++) {
            if ((array.length) % 2 == 0) {
                int temp;
                temp = array[i];
                array[i] = array[2 * j - i - 1];
                array[2 * j - i - 1] = temp;
            } else {
                int temp;
                temp = array[i];
                array[i] = array[2 * j - i];
                array[2 * j - i] = temp;
            }

        }
    }

    public static void bubble(int[] array) {
        for (int a = 0, j = array.length; a < j - 1; a++){
            for(int i = 0; i < j - 1 - a; i++){
                if(array[i] > array[i + 1]){
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
