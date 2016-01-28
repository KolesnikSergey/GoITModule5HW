import java.util.Scanner;

/**
 * Created by kolesnik_s on 09.01.16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] num;
        ArrayActions arrAct;
        int counter = 0;

        /**
         * Enter array length
         */
        System.out.print("Enter array length: ");
        num = new int[keyboard.nextInt()];

        /**
         * Entering data for array
         */
        System.out.print("Enter numbers for array:");
        while (num.length > counter) {
            num[counter] = keyboard.nextInt();
            counter++;
            System.out.print((counter == num.length) ? "last.\n" : "next:");
        }

        /**
         * Create object arrAct
         */
        arrAct = new ArrayActions(num);

        /**
         * Start first task from 5 module
         */
        arrAct.findMinMax("MIN");
        /**
         * End first task
         */

        /**
         * Find MAX value
         */
        arrAct.findMinMax("MAX");
        /**
         * End find MAX
         */

        /**
         * Start second task from 5 module
         */
        System.out.println("Use "+arrAct.getSortingName());
        arrAct.gnomeSorting();
        /**
         * End second task
         */
    }
}
