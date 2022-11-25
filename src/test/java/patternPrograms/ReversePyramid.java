package patternPrograms;

public class ReversePyramid {
    public static void main(String[] args){
        int i,j, n=6;
        for( i=1;i<=n;i++){
            for( j=1;j<=n;j++) {
                if(i==1||i<j+1)
                System.out.print(j+ " ");
                else
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
