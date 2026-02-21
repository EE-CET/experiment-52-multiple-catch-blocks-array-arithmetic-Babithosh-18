import java.util.Scanner;

public class MultipleCatch {
    
        // TODO: Read N
        // TODO: Create array and read N integers
        // TODO: Read index
        // TODO: Read divisor
        
        // TODO: 
        // TODO: catch ArrayIndexOutOfBoundsException -> Print "Invalid Index"
        // TODO: catch ArithmeticException -> Print "Divide by zero error"


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
    
}
