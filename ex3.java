import java.util.Scanner;
class example4
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter weight of a person : ");
        double weight=a.nextDouble();
        System.out.println("Enter the number of persons : ");
        int count=a.nextInt();
        Double b=(1320/(weight*(count/count)));
        System.out.println("Elevator can fit "+b+" people");

    }
}