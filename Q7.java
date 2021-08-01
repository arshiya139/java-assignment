import java.util.Scanner;

 class PhysicalEducationDirector 
 {

    String name;
    String[] sports_taught;
    double timing;
    int count;


    void getDetails() 
    {

        Scanner s=new Scanner(System.in);

        System.out.println("enter name:");
        name=s.nextLine();

        int n;
        System.out.println("enter how many sports you teach:");
        n=s.nextInt();

        for(int i=0;i<n;i++) 
        {

            String name;
            System.out.println("enter sport name:");
            name=s.nextLine();
            sports_taught[i]=name;
        }

        System.out.println("enter coaching timing in total:");
        timing=s.nextDouble();

        System.out.println("enter total number of students:");
        count=s.nextInt();
        s.close();
    }
}


 class SportDetails extends PhysicalEducationDirector 
 {

    int basketball_fee=100;
    int football_fee=200;
    int tennis_fee=300;
    int badminton_fee=400;

    int[] joined=new int[4];
    int income=0;

    Scanner s=new Scanner(System.in);

    void getCount() 
    {

        System.out.println("enter count of each of basketball, football, tennis, badminton students:");

        for(int i=0;i<4;i++) 
        {

            joined[i]=s.nextInt();
        }
    }

    void IncomeOfPED()
     {

        if(joined[0]!=0)
            income+=basketball_fee*joined[0];

        if(joined[0]!=0)
            income+=football_fee*joined[1];

        if(joined[0]!=0)
            income+=tennis_fee*joined[2];

        if(joined[0]!=0)
            income+=badminton_fee*joined[3];

        System.out.println("Income of PED is:"+income);
    }

}


 class StudentSports extends SportDetails {

    String name;
    int age;
    boolean[] play=new boolean[4];
    boolean res;

    Scanner s=new Scanner(System.in);

    void get() 
    {

        System.out.println("enter name:");
        name=s.nextLine();

        System.out.println("enter age:");
        age=s.nextInt();
    }

    void getSportDetails() 
    {

        System.out.println("do you play basketball ?");
        res=s.nextBoolean();
        play[0]=res;

        System.out.println("do you play football ?");
        res=s.nextBoolean();
        play[1]=res;

        System.out.println("do you play tennis ?");
        res=s.nextBoolean();
        play[2]=res;

        System.out.println("do you play badminton ?");
        res=s.nextBoolean();
        play[3]=res;
    }

    void calculateFee() 
    {

        int fee=0;

        if(play[0]==true)
            fee+=basketball_fee;

        if(play[1]==true)
            fee+=football_fee;

        if(play[2]==true)
            fee+=tennis_fee;

        if(play[3]==true)
            fee+=badminton_fee;

        System.out.println("Total fees is:"+fee);
    }

}


public class Q7 {

    public static void main(String[] arg) 
    {

        StudentSports s1=new StudentSports();
        StudentSports s2=new StudentSports();

        SportDetails ped1=new SportDetails();
        SportDetails ped2=new SportDetails();

        s1.get();
        s1.getSportDetails();
        s1.calculateFee();

        ped1.getCount();
        ped1.IncomeOfPED();

        s2.get();
        s2.getSportDetails();
        s2.calculateFee();

        ped2.getCount();
        ped2.IncomeOfPED();
    }

}