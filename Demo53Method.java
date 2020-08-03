public class Demo53Method {
    public static void main(String[] args) {
        int[] array = new int[] {5,15,25,20,100};
        int max = getMax(array);
        System.out.println(max);

    }
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}