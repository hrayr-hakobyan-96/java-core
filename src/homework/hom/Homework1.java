package homework.hom;

public class Homework1 {
    public static void main(String[] args) {
        //1//
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");


        }
        //2//
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
        //3//
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //4//
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < 5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        //5//
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}









