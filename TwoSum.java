import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array \n");
        int n=sc.nextInt();
        int i,j,flag=0;
        int []num=new int[n];
        System.out.println("Enter the elements to array \n");
        for(i=0;i<n;i++){
             num[i]=sc.nextInt();
        }
        System.out.println("Enter the Target\n");
        int targ=sc.nextInt();
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(num[i]+num[j]==targ){
                    flag=1;
                    System.out.println("Numbers are:"+num[i]+" "+num[j]+"\n");
                    break;
                }
                else{
                    continue;
                }
            }
        }
        if(flag==0){
            System.out.println("Not possible to get the numbers--");
        }
    }
}