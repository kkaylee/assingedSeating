import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // scanner recieve user
    String[] Students = new String[15];
    //String array of the names 
    int[] seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    // initialize seat variable 1-15

  
    for (int i = 0; i <= 14; i++) {
      System.out.println("What is your name?");Students[i] = scan.next();
    }
    // create a loop to ask for the names according to the seat number with the
    

    int count = 0;

    while (count <= 14) {
      System.out.println(Students[count] + "sits in seat # " + seats[count]);
      count++;
      // This does the final print of the user's names and seat numbers
    }
  }
}