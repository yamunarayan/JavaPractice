package JBasics;

public class LeapYear {
    public static void main(String[] args){
System.out.println(checkYear(2001)? "Leap Year" :
        "Not a Leap Year");
System.out.println(checkLeapYear(2000)? "Yes Leap Year" :
                "No Not a Leap Year");
    }
    static boolean checkYear(int year){
       if(year % 400==0)
           return true;
       if(year % 100 ==0)
           return false;
        if(year % 4 ==0)
            return true;
return false;
    }

    static boolean checkLeapYear(int year){
        return (((year%4==0) && (year%100!=0)) ||(year %400==0));
    }
}
   // Time Complexity : O(1)

     //   Auxiliary Space: O(1)