public class Exam2 {
    public static void main(String[] args) {

        for(int height = 3; height <=7; height = height + 2) {
            for (int i = 0; i < height; ++i) {
                for (int j = 0; j < height - i - 1; ++j) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * i + 1; ++k) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println(" ");
        }
    }
}







        // 높이 : 3

        /*

         *
         ***
         *****

         */

        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */

        // 높이 : 7

        // 출력

        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */


