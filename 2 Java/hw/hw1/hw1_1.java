import java.util.Scanner;
public class hw1_1 {

    public static void main(String[] args)
    {
      Scanner scn=new Scanner(System.in);
      String str;
      //String q=new String("q");
      int count2=0,count4=0,count6=0,count8=0;
      while(true)
      {

       System.out.print("請輸入字串:(如果輸入q則離開程式)");
       str=scn.next();

       if(str.equals("q"))
       	break;
       else
       {
          for(int i=0 ; i<str.length() ; i++)
          {
            switch(str.charAt(i))
            {
             case '2':
				count2++;
				break;
			 case '4':
				count4++;
				break;
			 case '6':
				count6++;
				break;
			 case '8':
				count8++;
				break;
            }
          }
          System.out.println("數字2出現"+count2+"次!!");
          System.out.println("數字4出現"+count4+"次!!");
          System.out.println("數字6出現"+count6+"次!!");
          System.out.println("數字8出現"+count8+"次!!");

          count2=0;count4=0;count6=0;count8=0;
       }

      }


    }


}