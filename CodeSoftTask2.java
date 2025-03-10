import java.util.*;
public class CodeSoftTask2 {
    public static int calculateTotalMarks(int[] marks)
    {
        int Total=0;
        for(int mark:marks)
        {
            Total+=mark;
        }
        return Total;
    }

    public static double calculateTotalAverage(int Total,int noOfSub)
    {
        return Total/noOfSub;
    }

    public static String gradeCalculate(double avrgePercent)
    {
        if(avrgePercent>=90)
        {
            return "A";
        }
        else if(avrgePercent<90 && avrgePercent>=80)
        {
            return "B";
        }
        else if(avrgePercent<80 && avrgePercent>=70)
        {
            return "C";
        }
        else if(avrgePercent<70 && avrgePercent>=60)
        {
            return "D";

        }
        else if(avrgePercent<60 && avrgePercent>=50)
        {
            return "E";
        }
        else
        {
            return "Fail";
        }
    }
    public static void displayResults(int totalMarks,double avrge,String grade,int[] marks,String[] subjects)
    
    {
        System.out.println("<-------- Results --------->");
        for(int i=0;i<subjects.length;i++)
        {
            System.out.println(subjects[i]+":"+marks[i]);
        }
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Percentage: "+avrge+"%");
        System.out.println("Grade:"+grade);

    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of Subjects:");
       int noOfSub=sc.nextInt();
       int[] marks=new int[noOfSub];
       String[] subjects=new String[noOfSub];
       for(int i=0;i<noOfSub;i++)
       {
        System.out.println("Enter the name of the subject "+(i+1)+" :");
        subjects[i]+=sc.next();
        System.out.println("Enter the marks of the subject "+(i+1)+" (Out of 100):");
        marks[i]=sc.nextInt();
       }

       int totalMarks=calculateTotalMarks(marks);
       double totalAvrge=calculateTotalAverage(totalMarks, noOfSub);
       String grade=gradeCalculate(totalAvrge);
       displayResults(totalMarks, totalAvrge, grade, marks, subjects);


    }
    
}
