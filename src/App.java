public class App {
    public App(){
    }
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int Computesum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int Computesum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers. 
     */

    /**
     * 
     * Create method that returns the greater integer value
     */
    public static int greaterValue(int num1, int num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    /**
     * 
     * Create method that returns the greater double value
     */
    public static double greaterValue(double num1, double num2){
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
        System.out.println("The sum of two numbers, 33 and 36, is " + Computesum2(33, 36));
        System.out.println("The sum of the three numbers, 200, 122, and 122 is " + Computesum3(200, 122, 122));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 350 and 311 is " + greaterValue(350,311));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 6.9 and 24.1 is " + greaterValue(6.9,24.1));

    }
}