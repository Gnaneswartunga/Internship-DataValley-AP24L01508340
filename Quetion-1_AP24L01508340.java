public class Main {
    public static void main(String[] args) 
    {
        int arrayvalues[] = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;
        for (int number : values) 
        {
            if (number % 5 == 0 && number % 2 == 0) 
            {
                sum = sum+number;
            }
        } 
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);
    }
}
