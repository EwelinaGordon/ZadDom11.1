import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList <>();
        Scanner scn = new Scanner(System.in);
        boolean flag = false;


        while (!flag) {
            System.out.println("Podaj liczbę: ");
            try {int number = scn.nextInt();
                if (number>=0) {
                    list.add(number);}
                else flag = true;
            }
            catch (InputMismatchException ex) {
                System.out.println("To nie jest liczba, spróbuj ponownie: ");
                scn.nextLine();
            }
        }

        NumberList.printList(list);
        NumberList.printSum(list);
        System.out.println();
        System.out.println("Maksymalna wartośc: " + NumberList.maxNumber(list));
        System.out.println("Minimalna wartośc: " + NumberList.minNumber(list));
    }

    static void printList(ArrayList<Integer> arrayList) {
        int lenght = arrayList.size();
        System.out.print("Liczby w kolejności odwrotnej niż były wprowadzone: ");
        for(int i = lenght -1; i>=0; i--) {
            System.out.print(arrayList.get(i)+ " ");
        }
    }

    static void printSum(ArrayList<Integer> arrayList) {
        System.out.println();
        System.out.print("Suma liczb:  ");
        for(int i = 0; i<arrayList.size(); i++) {
            if (i == 0) {
                System.out.print(arrayList.get(i) );
            } else {System.out.print(" + " + arrayList.get(i));}
        }
        int sum = 0;
        for(Integer i: arrayList) {
            sum +=i;
        }
        System.out.print(" = " + sum);
    }

    static Integer minNumber(ArrayList<Integer> arrayList ) {
        int min = arrayList.get(0);

        for (int i = 0; i<arrayList.size();i++){
            if (min > arrayList.get(i))
                min = arrayList.get(i);}
                return min;
        }

    static Integer maxNumber(ArrayList<Integer> arrayList ) {
        int max = arrayList.get(0);

        for (int i = 0; i<arrayList.size();i++){
            if (max < arrayList.get(i))
                max = arrayList.get(i);}
        return max;
    }
}