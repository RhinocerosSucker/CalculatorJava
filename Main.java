import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 1;
    while (k == 1) {
    System.out.println("Select an Operation:");
    System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Division");
      int input = sc.nextInt();
      if (input == 1) {
        System.out.println("How many numbers do you want to add?");
        List<Integer> numbers = new ArrayList<>();
        int numofnum = sc.nextInt();
        int total = 0;
        for (int i = 0; i < numofnum; i++) {
          System.out.println("What will number "+(i + 1)+" be?");
          int numbersidk = sc.nextInt();
          numbers.add(numbersidk);
          total = total + numbersidk;
          if ((i + 1) == numofnum) {
            System.out.println("Answer = "+total);
            System.out.println("Restart?\n1. Yes\n2. No");
            int ans = sc.nextInt();
            if (ans == 2) {
              k = (k + 1);
            }else if (ans == 1) {
            }else {
             System.out.println("Please select a valid answer.");
            }
          }
        }
      }
      if (input == 3) {
        System.out.println("How many numbers do you want to multiply?");
        List<Integer> numbers = new ArrayList<>();
        int numofnum = sc.nextInt();
        int total = 0;
        for (int i = 0; i < numofnum; i++) {
          System.out.println("What will number "+(i + 1)+" be?");
          if (i == 0) {
            total = sc.nextInt();
          } else if (i >= 1) {
            total = total * sc.nextInt();
          }
          if ((i + 1) == numofnum) {
            System.out.println("Answer = "+total);
            System.out.println("Restart?\n1. Yes\n2. No");
            int ans = sc.nextInt();
            if (ans == 2) {
              k = (k + 1);
            } else if (ans == 1) {
            } else {
             System.out.println("Please select a valid answer.");
            }
          }
        }
      }
      if (input == 4) {
        List<Integer> numbers = new ArrayList<>();
        double total = 0;
        int numofnum = 2;
        for (int i = 0; i < numofnum; i++) {
          System.out.println("What will number "+(i + 1)+" be?");
          if (i == 0) {
            try {
              total = sc.nextDouble();
            }
            catch (Exception e) {
              System.out.println("Please try again (arithmetic error).");
            }
          } else if (i >= 1) {
            try {
               total = total / sc.nextDouble();
            }
            catch (Exception e) {
              System.out.println("Please try again (arithmetic error).");
            }
          }
          if ((i + 1) == numofnum) {
            if (Math.floor(total) == total) {
              System.out.println("Answer = "+(int)total);
            } else {
              System.out.println("Answer = "+total);
            }
            System.out.println("Do you want to divide the answer again?\n1. Yes\n2. No");
            int ansdiv = sc.nextInt();
            if (ansdiv == 1) {
              numofnum = numofnum + 1;
            } else if (ansdiv == 2) {
              System.out.println("Restart?\n1. Yes\n2. No");
            int ans = sc.nextInt();
            if (ans == 2) {
              k = (k + 1);
            } else if (ans == 1) {
            } else {
             System.out.println("Please provide a valid answer.");
            }
            } else {
              System.out.println("Please provide a valid answer.");
            }
          }
        }
      }
      if (input == 2) {
        List<Integer> numbers = new ArrayList<>();
        int total = 0;
        int numofnum = 2;
        for (int i = 0; i < numofnum; i++) {
          System.out.println("What will number "+(i + 1)+" be?");
          if (i == 0) {
            total = sc.nextInt();
          } else if (i >= 1) {
            total = total - sc.nextInt();
          }
          if ((i + 1) == numofnum) {
            System.out.println("Answer = "+total);
            System.out.println("Do you want to subtract the answer again?\n1. Yes\n2. No");
            int ansdiv = sc.nextInt();
            if (ansdiv == 1) {
              numofnum = numofnum + 1;
            } else if (ansdiv == 2) {
              System.out.println("Restart?\n1. Yes\n2. No");
            int ans = sc.nextInt();
            if (ans == 2) {
              k = (k + 1);
            } else if (ans == 1) {
            } else {
             System.out.println("Please provide a valid answer.");
            }
            } else {
              System.out.println("Please provide a valid answer.");
            }
          }
        }
      }
    }
  }
}