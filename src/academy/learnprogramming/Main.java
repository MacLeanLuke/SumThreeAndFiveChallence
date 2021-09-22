package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create a for statement using a range of numbers from 1 to 1000  inclusive
        int total = 0;
        int count = 0;
        for (var i = 1; i <= 1000; i++){
            // sum all the numbers that can be divided with both 3 and also with 5
            if ((i % 3 == 0) && (i % 5 == 0)){
                total += i;
                // for those number that met the above conditions, print out the number
                System.out.println(i + " can be evenly divided by 3 and 5");
                // break out of the loop once you find 5 numbers that met the above conditions
                count++;
                if (count == 5){
                    break;
                }
            }

        }
        // after breaking out of the loop print the sum of the number that met the above conditions
        System.out.println(total + " is the total value of the numbers");
    }
}
