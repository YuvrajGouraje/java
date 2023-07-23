



import java.util.Scanner;
public class tik_tok_toe {

    public static void main(String[] args) {
        char  pos[]={' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' '};
        Scanner sc=new Scanner(System.in);
        int input;
        int count =1;
        char turn='x';
        while(true)
        {   do {
            System.out.println("Enter position");
             input = sc.nextInt();
            pos[input - 1] = turn;
        }while(pos[input]=='x'|| pos[input]=='o');


            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + "  ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + "  ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + "  ");

                    if(pos[0]==turn && pos[1]==turn && pos[2]==turn
                    || pos[3]==turn && pos[4]==turn && pos[5]==turn
                    || pos[6]==turn && pos[7]==turn && pos[8]==turn
                    || pos[0]==turn && pos[3]==turn && pos[6]==turn
                    || pos[1]==turn && pos[4]==turn && pos[7]==turn
                    || pos[2]==turn && pos[5]==turn && pos[8]==turn
                    || pos[0]==turn && pos[4]==turn && pos[8]==turn
                    || pos[2]==turn && pos[4]==turn && pos[6]==turn)



            {
                System.out.println(turn +" is Winner");
                break;
            }

            if(turn=='x'){
                turn='o';
            }
            else if(turn=='o'){
                turn='x';
            }
            count++;
            if(count>9) {
                System.out.println(" Match Drow");
                break;
            }
        }

    }
}



