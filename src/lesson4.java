public class lesson4 {
    public static void main(String[] args) {
        //1980-1985-выводить, какой это год
        int year = 1980;
        for (int j = 0;j < 6; j++) {
            System.out.println("Год" + year++);
        }
        //Массивы
        int[] array = new int[5];
        System.out.println(array[4]);
        array[3] = 67;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        array = new int[]{1, 2, 3, 4, 5};
        array[4] = 78;
        System.out.println(array[4]);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        for (int item : array) {
            System.out.println(item);
        }


            }
        }
class DoubleArray {
    public static void main(String[] args) {
        int[][] darray = new int[8][8];
        darray[0][0] = 5;
        darray[0][1] = 55;

        System.out.println(darray[0][1] + darray[0][0]);
    }
}