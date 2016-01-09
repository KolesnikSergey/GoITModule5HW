/**
 * Created by kolesnik_s on 09.01.16.
 */
public class ArrayActions {
    private int[] numbers;

    public ArrayActions(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Find minimal value and return it
     * @return
     */
    public int findMinimal () {
        int counter = 0;
        int minimal = this.numbers[0];

        while (counter < this.numbers.length) {
            if (minimal > this.numbers[counter])
                minimal = this.numbers[counter];
            counter++;
        }

        return minimal;
    }

    /**
     * This method sort array
     */
    public int[] someSorting () {
        printArray(true);
        int counter = 1;
        while(counter < this.numbers.length) {
            if(counter==0 || this.numbers[counter - 1] <= this.numbers[counter])
                counter++;
            else {
                int temp = this.numbers[counter];
                this.numbers[counter] = this.numbers[counter - 1];
                this.numbers[counter - 1] = temp;
                counter--;
            }
        }
        printArray(false);
        return this.numbers;
    }

    /**
     * This method just print array with condition flag
     * @param isBeforeSort - true if print before sort,
     *                       false if after.
     */
    private void printArray(boolean isBeforeSort) {
        int counter = 0;

        System.out.print(isBeforeSort?"Incoming":"After sorting");
        System.out.print(" array: [");
        while(counter < this.numbers.length) {
            switch(counter){
                case 0: System.out.print(" "+this.numbers[counter]);
                    break;
                default: System.out.print(" ,"+this.numbers[counter]);
            }
            counter++;
        }
        System.out.println(" ].");
    }
}
