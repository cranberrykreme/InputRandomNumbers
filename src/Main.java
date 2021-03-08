import java.io.*;               // Needed for file I/O classes
import java.util.Random;        // Needed for Random class
import javax.swing.JOptionPane; // Needed for input from user

/**
 * This program is a slight change to practice program in
 * "Starting Out with Java - From Control Structures Through Ojbects"
 * It is not fully my own work
 */
public class Main {
    static Random rand;
    static PrintWriter out;

    public static void main(String[] args) throws Exception {
        System.out.println("This program will ask the user to " +
                            "input the amount of numbers that should be " +
                            "written into a new text file.");

        String number;                      // How many numbers the program should create
        number = getNumber();               // Get the amount of numbers
        int num = Integer.parseInt(number); // Change the string to integer
        createRandomNumbers(num);           // Create the file with random numbers in it

        // Completion messge
        JOptionPane.showMessageDialog(null, ".txt file created with " + num + " numbers.");
    }

    /**
     * This method gets the user to input the number of random numbers
     * that they want to generate and then returns the number back
     * to the main class
     * @return number of random numbers the user wants
     */
    public static String getNumber(){
        String num = JOptionPane.showInputDialog("How many random numbers should there be?");
        return num;
    }
    
    /**
     * This method will create the file with all of the
     * random numbers the user requested in it
     * @param num
     * @throws Exception
     */
    public static void createRandomNumbers(int num) throws Exception {
        rand = new Random();                    // Random numbers to be generated
        out = new PrintWriter("random.txt");    // Create file to output to
        int number;                             // Store the random number value

        // Simple for loop to create the numbers
        for(int i = 0; i < num; i++){
            number = rand.nextInt();    // Create the random numbers

            out.println(number);        // Write the numbers to a .txt file
        }

        // Close the file
        out.close();
    }
}
