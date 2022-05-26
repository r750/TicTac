import java.util.Scanner;

public class TicTac {
    private static char Gamer, Comp;
    static String[] Gameboard;
    public static char[] board(){
    char[] brd = new char[10];
    for (int i =1; i<brd.length;i++)
    {
        brd[i]=' ';
    }
    return brd;
    
   }
   void player(){
       System.out.println("Enter X or O");
       Scanner object = new Scanner(System.in);
       Gamer = object.next().charAt(0);

       if (Gamer == 'X')
       {
           Comp = 'O';
           System.out.println("Computer's choice"+Comp);
       }else if (Gamer == 'O'){
           Comp = 'X';
           System.out.println("Coumpeter's Choice"+Comp);
       }
   }

static void showBoard(){
    System.out.println("-|-|-");
};
    public static void main(String[] args) {

        System.out.println("Welcome to Game!!!!!!!");
      
      board();
      TicTac Tc = new TicTac();
      Tc.player();
      showBoard();

    }

}
