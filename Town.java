import java.util.Scanner;

public class Town{

    private int numberOfAdults;
    private int numberOfChildren;

    public void initialize(){

        Scanner scanObjIn = new Scanner(System.in);
        System.out.println("Enter number of adults :");
        this.numberOfAdults = scanObjIn.nextInt();

        System.out.println("Enter number of children :");
        this.numberOfChildren = scanObjIn.nextInt();

        scanObjIn.close();
    }

    public void simulateBirth(){

        this.numberOfChildren+=1; //simulate the birth of a one child
    }

    public void printStatistics(){

        System.out.println("Total Number of Children:" + this.numberOfChildren);
        System.out.println("Total Number Of Adults:" + this.numberOfAdults);
    }
}