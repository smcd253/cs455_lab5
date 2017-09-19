// AssertTester.java

public class AssertTester {
    public static void main(String[] args)
    {
        // empty constructor
        Term term = new Term();

        // correct constructor input
        Term termC = new Term(5.0, 2);
        System.out.println(termC.toString());

        // incorrect constructor input
        Term termI = new Term(5.0, -1);
        System.out.println(termI.toString());
    }
}