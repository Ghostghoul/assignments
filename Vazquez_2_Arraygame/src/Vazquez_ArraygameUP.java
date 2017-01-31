            

import java.util.Random;
import java.util.Scanner;

public class Vazquez_ArraygameUP {
            
                static Trap [] mineField = new Trap[7]; 
                //must make puublic to all
                
              public static void main(String []args) {

                char [][] landscape= new char[10][10];

                //landscape[1][3] = 'D';
                //landscape[7][8] = '2';
                
                Hero bucky = new Hero (0, 0);
                Trap bomb = new Trap (1,1);
               
                
                
                Random randy = new Random();
                  
                  for (int i = 0; i < 7; i++){
                      mineField[i] = new Trap(randy.nextInt(10),randy.nextInt(10));
                  }

                  Scanner McScanner = new Scanner(System.in);
                System.err.println("Welcome Brave Hero!!");
                boolean loop = true;
                while(loop){
                
        
                   
                    landscape = new char[10][10];
                
                    System.out.println("Which direction would you like to go?");  
                    String answer = McScanner.nextLine();
                   System.out.printf("You said %s .\n", answer);
                   
                   bucky.move(answer);
                    landscape[bucky.getY()][bucky.getX()] = bucky.getSymbol();
              
            
                      for (int i = 0; i < 7; i++){
                     landscape[mineField[i].y][mineField[i].x] = mineField[i].getSymbol();
                  }
       

                    for (int i = 0; i <= landscape[0].length - 1; i++) {
                      for (int j = 0; j <= landscape[1].length - 2; j++) {
                        if (landscape[i][j] == 0 ) {
                          System.out.print("."); 
                     
                        }else {
                          System.out.print(landscape[i][j]);
                       }
                    }
                   System.out.println("|");
                   }
                 }
              }


                

static class Hero {
    int x,y;
    char symbol = '@';
    boolean isAlive = true;
    int heart;
    
    public Hero(int a, int b){
        this.x = a;
        this.y = b;
        this.symbol ='@';
 
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }      
    char getSymbol(){
        return this.symbol;
        
    }
    void moveSouth(){
       if (this.y < 9){this.y += 1;}
      
    }
    void moveNorth(){
         if (this.y > 0){this.y -= 1;}
        
    }
    void moveEast(){
        if (this.x < 9){this.x += 1;}
        
    }
    void moveWest(){
        if (this.x > 0){this.x -= 1;}
        
    }
    
    void move (String answer){
        answer = answer.toLowerCase();
        //System.out.printf("You are moving %s", answer);
        if (answer.startsWith("s")){
            System.out.println("Prepare to move South!!");
            this.moveSouth();
        }
                      
    else if (answer.startsWith("n")){
        System.out.println("Prepare to move North!!");
                    this.moveNorth();
                    }
    else if (answer.startsWith("w")){
        System.out.println("Prepare to move West!!");
                    this.moveWest();
                    }
        else if (answer.startsWith("e")){
            System.out.println("Prepare to move East!!");
                    this.moveEast();
                    }
        
    }
    
        
       void checkforTrap(){
            
                         for (int i = 0; i < 7; i++){
                       if (mineField[i].getisActive()){
                     if (mineField[i].getX() == this.getX() && mineField[i].getY() == this.getY()){
                 System.out.println("BOOM");
            
                     
                   }
                     
                       }
                       }
                       
                                
                                  }
       
}
    
  
    
    
static class Trap {
    int x,y;
    boolean isActive = true;
    char symbol = '*';

    
    public Trap(int a, int b){
        this.x = a;
        this.y = b;
        this.symbol ='*';
 
    }

        
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }      
    char getSymbol(){
        return this.symbol;
        
    }
    boolean getisActive(){
        return this.isActive;
    }
    void beSnapped(){
        this.isActive = false;
    }
    
    
    
    
    
      
    

   
}
}










            
            
                 
            
    


