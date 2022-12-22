public class armstrong{

    public static void main(String[] args) {

        int num = 153, temp, rem, sum = 0,i=0;

        temp = num;
        while (temp != 0)
        {
            temp /= 10;
            i++;
            System.out.println(i);
        }
        temp = num;
        while (temp != 0)
        {
            rem = temp % 10;
            sum += Math.pow(rem, i);
            temp /= 10;
        }
        System.out.println(sum);

        if(sum == num)
            System.out.println(num + " is an Armstrong num.");
        else
            System.out.println(num + " is not an Armstrong num.");
    }
}