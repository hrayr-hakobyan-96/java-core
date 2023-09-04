package homework.hom;

public class ArrayUtil {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        double f = 0;

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            a = numbers[i];
            System.out.print(i + " ");
            c = c + numbers[i];
            f = c;
            if (numbers[i] > a) {
            }
            if (numbers[i] < max) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println();
        System.out.print(numbers[0]);
        System.out.println();
        System.out.println(a + " ");
        System.out.println(numbers.length);
        System.out.println(max);
        System.out.println(c);
        System.out.println(f / numbers.length);
        int odd = 0, ivn = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                odd++;
            } else {
                ivn++;
            }
        }
        System.out.println(odd);
        System.out.println(ivn);
        System.out.println();
        int k = 0;
        int r = 0;
        for (int i = 0; i < numbers.length; i++) {
            k = numbers.length / 2;
            r = numbers[k];
        }
        if (r < 2) ;
        else System.out.println("can't print middle values");
        if (numbers.length % 2 == 0) System.out.print(r + " " + numbers[r + 1]);
        else System.out.println(r);
    }

}







