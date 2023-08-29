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
        int[][] array = new int[4][4];

            array[0] = new int[2];
            array[1] = new int[2];
            array[2] = new int[2];
            array[3] = new int[3];

                array[0][1] = 1;
                array[1] [1]= 2;
                array[2][1] =3;
                array[3][1] =4 ;
                array[0][2] = 10;
                array[1] [3]= 20;
                array[2][4] =30;
                array[3][5] =40 ;


            System.out.println(array [1][3]);
        }

    }

