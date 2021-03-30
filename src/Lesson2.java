public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        //System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3,4));
    }

    public static int sum(int a, int b) {

        if ( a + b > Integer.MAX_VALUE){
            return -1;
        }
        else return a + b;
    }

    public static int max(int a, int b) {
        if ( a > b){
            return a;
        }
        else{
            return b;
        }

    }
    public static double average(int[] array) {
        int sum = 0;
        int countNum = array.length;
        double avg = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return avg = (double)sum/countNum ;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if ( max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static double calculateHypotenuse(int a, int b) {
        return (int)Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

    }
}
