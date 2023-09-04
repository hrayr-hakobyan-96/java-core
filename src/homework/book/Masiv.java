package homework.book;

public class Masiv {
    public static void main(String[] args) {
//        int[] month_days;
//        month_days = new int[12];
//        month_days[0] = 30;
//        month_days[1] = 30;
//        month_days[2] = 30;
//        month_days[3] = 30;
//        month_days[4] = 30;
//        month_days[5] = 30;
//        month_days[6] = 30;
//        month_days[7] = 30;
//        month_days[8] = 30;
//        month_days[9] = 30;
//        month_days[11] = 30;
//        System.out.print("B апреле " + month_days[3] + " дней.");
//        System.out.println();
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println();
//        int[] sum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int k = 0;
//        for (int i = 0; i < sum.length; i++) {
//            k = k + i;
//            double c = k;
//            System.out.println(c / sum.length);
//        }
//        char[] chars = {'%', '&', '*', '#',};
//        int[] book = {1,2,3,4,6};
//        for (int i = 0; i < book.length; i++) {
//            System.out.println(chars[i]+" "+book[i]);
//        }
//        int[][] twoD = new int [4] [5] ;
//        int i,j  = 0;
//        for ( i=0 ; i<4 ; i++)
//            for (j=0; j <5; j ++);{
//                int k=0;
//                twoD[i][j]=k;
//              k++ ;
//            }
//        for ( i=0 ; i<4 ; i++) {
//            for (j = 0; j < 5; j++)
//                System.out.print(twoD[i][j] + " ");
//            System.out.println();
//
//        }
        //հայտարարել 50 հատանոց մասիվ
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(i + "-");
        }
        System.out.println();
// մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.print(max);
        System.out.println();
        // մասիվի ամենափոքր թիվը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println(min);
        System.out.println();
        //մասիվի զույգ էլէմեննտները
        for (int i = 0; i < array.length; i++) {
            int k = i + 1;
            if (array[i] % 2 == 0) {
                k = array[i];
                System.out.print(k + " ");


            }

        }
        System.out.println(

        );
        //մասիվի կենտ  էլէմեննտները
        for (int i = 0; i < array.length; i++) {

            int f = i + 1;
            if (array[i] % 2 != 0) {
                f = array[i];
                System.out.print(f + " ");
            }

        }
        //մասիվի գումարը
        System.out.println();
        int j = 0;
        for (int i = 0; i < array.length; i++) {

            j = j + i;

        }

        System.out.print(j);
        // մասիվի միջին թվաբանականը
        System.out.println();
       double a=0;
        for (int i = 0; i < array.length; i++) {
            a=a+i;


        }
        System.out.print(a/array.length);
        System.out.println();


        int i=0;
        for (int k = 1; k <= 15; k++) {
            System.out.print(k+" ");
        }

    }
}

