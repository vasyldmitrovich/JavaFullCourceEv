package practical__05;

public class task__01 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, -3, 4, 5, -6, 7, 8, -9, 10};
        //Max number
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max);


        //Sum of positive numbers
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of positive numbers is: " + sum);

        //Amount of negative numbers
        int amount = 0;
        int positiveNumbers;
        String moreValues;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                amount++;
            }
        }
        System.out.println("Amount of negative nubmers is: " + amount);
        positiveNumbers = arr.length - amount;
        if (positiveNumbers > amount) {
            moreValues = " So there are more positive numbers.";
        } else if (positiveNumbers == amount) {
            moreValues = " There are equally negative and positive numbers.";
        } else {
            moreValues = " So there are more negative numbers.";
        }
        System.out.println("There are " + amount + " negative numbers and " + positiveNumbers + " positive numbers." + moreValues);
    }
}
