import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack numbers;
        int input;

        System.out.print("Enter size of the array? ");
        numbers = new Stack(Integer.parseInt(reader.readLine()));
        System.out.println();
        
        do {
            System.out.println("[1] Push");
            System.out.println("[2] Pop");
            System.out.println("[3] Peek");
            System.out.println("[4] isEmpty");
            System.out.println("[5] isFull");
            System.out.println("[6] Exit\n");

            System.out.print("input: ");
            input = Integer.parseInt(reader.readLine());
            System.out.println();
            switch(input) {
              case 1 : 
                	System.out.print("Enter number: ");
                    numbers.push(Integer.parseInt(reader.readLine()));
                    System.out.println();
                break;
              case 2 :
                numbers.pop();
                break;
              case 3 :
                System.out.println("Value is " + numbers.peek() + "\n");
                break;
              case 4 :
                System.out.println(numbers.isEmpty() + "\n");
                break;
              case 5 : 
                System.out.println(numbers.isFull() + "\n");
                break;
            }
        } while(input != 6);
    }
}
