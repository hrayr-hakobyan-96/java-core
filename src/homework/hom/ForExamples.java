package homework.hom;

public class ForExamples {
    public static void main(String[] args) {

        int[] number= new int[1001];
        for (int i = 1; i <= number.length; i++) {
            number[i] = i + 1;
            System.out.print(i);
            char[] sim = new char[1];
            for (int j = i; j < number.length - 1; j++) {
                sim[0] = '-';
            }
            System.out.print(sim);
        }
        int[] array = new int[101];
        for (int k = 1; k <= array.length; k++) {
            array[k] = k + 1;
            if (array[k]%2!=0){
                System.out.print(k+" ");
            }
        }
        System.out.println();

        int[] num = {2, 5, 8, 4, 9, 3, 7};
       int max=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println(max);
    }
}























