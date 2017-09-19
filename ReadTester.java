import java.util.ArrayList;
import java.util.Scanner;

public class ReadTester{
    public static void main(String[] args)
    {
        ArrayList<Integer> board = new ArrayList<Integer>();

        System.out.println("Enter input: ");
        Scanner sc = new Scanner(System.in).useDelimiter("[,\\s+]");
        
        while(sc.hasNextInt()) 
        {
    	    int input = sc.nextInt();
            board.add(input);
        }
        
        int listSize = board.size();
        System.out.print("[ ");
        for (int i = 0; i < listSize; i++)
        {
            if (i == listSize - 1) {
                System.out.print(board.get(i) + " ");
            }
            else
                System.out.print(board.get(i) + ", ");
        }
        System.out.print("]");
    }
}

