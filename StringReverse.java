import java.util.Scanner;
class Java{
    public static void StringRev(String a){
        int i;
        String ch="";
        for(i=a.length()-1;i>=0;i--){
            ch = ch + a.charAt(i);
        }
        System.out.print("Reversed string:"+ch+"\n");
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string \n");
            String str=sc.nextLine();
            StringRev(str);

        }
}