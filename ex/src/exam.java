import java.util.*;
 
public class exam {
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);

       System.out.println("Enter the Number of the passengers");
      int num=read.nextInt();
      String arr1 []= new String[num];
      String arr2[]=new String[num];
      String arr3[]=new String[num];

      if(num<=0){
          System.out.println("<number of passenger>is invalid input");
        System.exit(0);
      }
      int x=0;
       for(int i=1;i<=num;i++){
       System.out.println("Enter the name of passenger"+i);
       String name=read.next();
       System.out.println("Enter the seat details of the passenger"+i);
       String details=read.next();  
       char coach=details.charAt(0);
       if(coach>='A'&& coach<='S'){
           String seatnum=details.substring(1,3);
              int seatnum2=Integer.parseInt(seatnum);  
             if(seatnum2 >=10 && seatnum2 <=99){

                arr1[x]=name;
               arr2[x]=details;
                x++;

             }

             else {
                    System.out.println("<seat number>Invalid");//System.exit(0)
                    }

       }else {System.out.println("<coach name>Invalid");//System.exit(0)

       }}             

      Arrays.sort(arr2);
        for(int f=arr2.length-1; f>=0;f--){
            System.out.print(arr1[f].toUpperCase()+",");
            System.out.println(arr2[f]);
        }    

                }}