package tictactoe;
import java.util.*;
import java.util.concurrent.TimeUnit;

class TicTacToe
{
static int[] t=new int[9];
public static String s;
public static String j;
                 
static void call() throws InterruptedException
	{
        for(int i=0;i<=8;i++)
            {
                if(i%3==0)
                {
                System.out.println("");
                }
            if(t[i]>=0)
                {
                if(t[i]%2==0)
                        {
                        System.out.print("  O  |");
                        }
                    else
                        {
                        System.out.print("  X  |");
                        }
                }
            else
                {
                System.out.print("     |");
                }
            }
        }
//static int x;
public static void main(String[] args) throws InterruptedException
    {
	System.out.println("            **WELCOME TO TIC TAC TOE** ");
        TimeUnit.SECONDS.sleep(1);
        Scanner sc=new Scanner(System.in);
	System.out.println(" ");
	System.out.println("   The labeling numbers of grid position starts ");
	System.out.println("  from the TOP LEFT BEING 1 and THE BOTTOM RIGHT");
	System.out.println("                    BEING 9.");
        System.out.println("                 1  |  2  |  3     ");
	System.out.println("                 4  |  5  |  6");
	System.out.println("                 7  |  8  |  9  ");
	System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("             Player 1 Name : ");
        s=sc.nextLine();
        System.out.println("             Player 2 Name : ");
        j=sc.nextLine();
        System.out.println("               ALRIGHT LETS GO!!");
	TimeUnit.SECONDS.sleep(1);
        System.out.println(" "+s+" PLAYS WITH 'X' AND " + j +" PLAYS WITH 'O'");
  	System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
	System.out.println("                 ALL THE BEST");
	System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
	System.out.println(" "+s+" TO INITIATE,ENTER A POSITION FROM 1 TO 9");
 	System.out.println(" ");
        TimeUnit.SECONDS.sleep(1);
	System.out.println("                         NOW : ");
        
        for(int i=0;i<=8;i++)
            {
            t[i]=-10;
            }
        int a=sc.nextInt();
        t[a-1]=1;
        call();
        for(int i=2;i<=9;i++)
		{
                        System.out.println("");
                        System.out.println("NEXT TURN : ");
			a=sc.nextInt();
                        if(t[a-1]!=-10)
                        {
                            System.out.println("Already Taken!  YOU LOST!  Better luck next time! : - >");
                            System.exit(0);
                        }
                        else
                        {
                        t[a-1]=i%2;
                        call();
                        } 
                        if( t[0]+t[1]+t[2]==0 ||t[3]+t[4]+t[5]==0 ||t[6]+t[7]+t[8]==0 ||t[0]+t[3]+t[6]==0 ||t[1]+t[4]+t[7]==0 ||t[2]+t[5]+t[8]==0 ||t[0]+t[4]+t[8]==0 ||t[2]+t[4]+t[6]==0)
                        {
                        System.out.println(" ");
                        System.out.println(j+ " WINS !!!HURRAY");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("I BET NEXT TIME THE WINNER IS "+s);
                        System.out.println("TILL THEN BBYYEEE!!");
                        System.exit(0);
                        }
                        else if( t[0]+t[1]+t[2]==3 ||t[3]+t[4]+t[5]==3 ||t[6]+t[7]+t[8]==3 ||t[0]+t[3]+t[6]==3 ||t[1]+t[4]+t[7]==3 ||t[2]+t[5]+t[8]==3 ||t[0]+t[4]+t[8]==3 ||t[2]+t[4]+t[6]==3)
                        {
                        System.out.println(" ");
                        System.out.println(s+" WINS !!!HURRAY");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("THERE'S ALWAYS A NEXT TIME "+j +".");
                        System.out.println("TILL THEN BBYYEEE!!");
                        System.exit(0);
                        }
                        if(i==9)
                        {
                            if(t[0]!=t[1]||t[3]!=t[4]||t[6]!=t[7]||t[0]!=t[3]||t[1]!=t[4]||t[2]!=t[5]||t[1]!=t[4]||t[2]!=t[4])
                            {
                            System.out.println("");    
                            System.out.println("YOU BOTH ARE EQUALLY SMART...;  >");
                            }
                        }
                }
            }
}

