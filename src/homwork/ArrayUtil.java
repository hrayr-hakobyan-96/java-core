package homwork;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8,};
        // Տպել բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով։
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //Տպել մասիվի առաջին էլեմենտը
        System.out.println("the first element of the array=" + numbers[0]);
        //Տպել մասիվի վերջին էլեմենտը
        int LastElement = 0;
        for (int i = 0; i < numbers.length; i++) {
            LastElement = i;
        }
        System.out.println("the last element of the array=" + LastElement);
        //Տպել մասիվի երկարությունը
        System.out.println("the length of the array=" + numbers.length);
        //Տպել մասիվի ամենափոքր թիվը
        int min = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        System.out.println("min=" + min);

        int array = 0;
        int elements = 0;
        //Տպել մասիվի մեջտեղի թիվը, ստուգել որ 2-ից մեծ լինի երկարությունը, եթե փոքր կամ հավասար էղավ, տպեք որ
        // can't print middle values. եթե զույգ է մասիվի մեջի էլեմենտների թիվը, տպեք մեջտեղի երկու էլեմենտները,
        // եթե կենտ է մի հատը։
        int cnetr = 0;
        for (int i = 0; i < numbers.length; i++) {
            cnetr = numbers[numbers.length / 2];
        }
        if (cnetr<=2)
            System.out.println("can't print middle values");
        if (numbers.length % 2 == 0)
            System.out.println(numbers[(numbers.length / 2) - 1] + " " + numbers[numbers.length / 2]);
        else {
            System.out.println(numbers[numbers.length / 2]);

        }
        System.out.println("centr array=" + cnetr);


    }
}


