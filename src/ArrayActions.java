/**
 * Created by kolesnik_s on 09.01.16.
 */
public class ArrayActions {
    private int[] numbers;
    private String sortingName = "Gnome Sorting";

    public ArrayActions(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getSortingName() {
        return sortingName;
    }

    /**
     * Find minimal value and return it
     * @return
     * @param inMinMax - is string where "MIN" when find minimal value,
     *                   "MAX" - when maximal.
     */
    public int findMinMax (String inMinMax ) {
        int counter = 0;
        int minMax = this.numbers[0];

        while (counter < this.numbers.length) {
            switch (inMinMax) {
                case "MAX" :
                    if (minMax < this.numbers[counter])
                        minMax = this.numbers[counter];
                    break;
                case "MIN" :
                    if (minMax > this.numbers[counter])
                        minMax = this.numbers[counter];
                    break;
                default:
                    System.out.println("Unknown find method ["+inMinMax+"] you should use MIN or MAX");
                    return 0;
            }

            counter++;
        }

        System.out.println( inMinMax+" is "+minMax+".");
        return minMax;
    }

    /**
     * This method sort array
     * with Gnome sorting method.
     */
    public int[] gnomeSorting () {
        printArray(true);
        int counter = 1;
        while(counter < this.numbers.length) {
            if(counter==0 ||
               this.numbers[counter - 1] <= this.numbers[counter])
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
