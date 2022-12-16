public class downward {
    public static void main(String[] args)
    {
        int rows = 5;
        for (int a = rows - 1; a >= 0; a--) {

            for (int b = 0; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}