package JBasics;

public class Recursion {
    public static void main(String[] args){
    System.out.println(seriesSum(1,1,5));
    }
    public static int seriesSum(int calc,int current, int n){
        int i,cur=1;
        if(current==n+1)
            return 0;
        for(i=calc;i<calc+current; i++){
            cur*=i;

        }
        return cur+seriesSum(i,current+1,n);
    }
}
