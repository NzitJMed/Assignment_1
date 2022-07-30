import java.util.Scanner;

public class Assignment_1 {
    public void question_1(){
        int n = 6; // we define our variable that can be either increased or decreased without touching our code.
        // This snip of for loop code will display the letter "I"
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //This snip of for loop code will display the letter "N"
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            //This snip of for loop code will display the letter "E"
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == (n - 1) / 2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            //This snip of for loop code will display the letter "U"
            for (int j = 0; j < n; j++) {
                if (j == 0&&i<n-1 || j==n-1&&i<n-1||i==n-1&&j!=0&&j!=n-1 ) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" ");
            //This snip of for loop code will display the letter "R"
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0&&j<n-1||j==n-1&&i!=0|| i == n / 2) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");
            //This snip of for loop code will display the letter "O"
            for (int j = 0; j < n; j++) {
                if (i==0&&j>0&&j<n-1||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>0&&i<n-1) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.print(" ");
            //This snip of for loop code will display the letter "N"
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }


            System.out.println();
        }

    }
    public void question_2() {
        int n = 1;
        int limit = 5;
        for (int i = 1; i < limit; i++) {
            for (int j = 1; j < limit; j++) {
                System.out.print( i +"   ");
            }
            System.out.println("  ");

        }


    }

    public void question_3() {
        int n=11;
        for (int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==0|| j==0||i==n-1||j==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2){
                    System.out.print("  *");
                }else{
                    System.out.print("   ");

                }

            }
            System.out.println();
        }

    }
    public void question_4(){
        int n=16;
        for (int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(j==0&&i>=(n-1)/2||i==n-1||j==n-1&&i>=(n-1)/2||i-j>=(n-1)/2||i+j>=n+(n-1)/2){
                    System.out.print("  *");
                }else{
                    System.out.print("   ");

                }

            }
            System.out.println();
        }
    }
    public void question_5(){
        int n=16;
        for (int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i==0||j==0||i==n-1||i-j>=(n-1)/2||i+j<=(n-1)/2){
                    System.out.print("  *");
                }else{
                    System.out.print("   ");

                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        /**I create an object related to each question. The five questions have been implemented in the method.*/
        Assignment_1 obj1= new Assignment_1();
        Assignment_1 obj2= new Assignment_1();
        Assignment_1 obj3= new Assignment_1();
        Assignment_1 obj4= new Assignment_1();
        Assignment_1 obj5= new Assignment_1();


        System.out.println("Solution for question 1");
        obj1.question_1();
        System.out.println("Solution for question 2");
        obj2.question_2();
        System.out.println("Solution for question 3");
        obj3.question_3();
        System.out.println("Solution for question 4");
        obj4.question_4();
        System.out.println("Solution for question 5");
        obj5.question_5();






    }


}
