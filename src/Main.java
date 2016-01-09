/**
 * Created by kolesnik_s on 09.01.16.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Start first task from 5 module
         */
        int[] num = {3,5,7,8,9,12,2};
        ArrayActions arrAct;
        arrAct = new ArrayActions(num);
        System.out.println("Minimal is "+arrAct.findMinimal());
        /**
         * End first task
         */

        /**
         * Start second task from 5 module
         */
         arrAct.someSorting();
        /**
         * End second task
         */
    }
}
