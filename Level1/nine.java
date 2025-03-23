import java.util.*;

public class nine{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row=input.nextInt();
        int col=input.nextInt();
        int [] [] arr=new int[row][col];
        int [] flatarr=new int [row*col];
        int index=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                flatarr[index++]=(arr[i][j]=input.nextInt());

            }

        }
       System.out.println("1D array: ");
       for(int i=0;i<row*col;i++){
        System.out.println(flatarr[i]);
       }


    }
}