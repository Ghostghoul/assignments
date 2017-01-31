            

import java.util.Random;
import java.util.Scanner;

public class Vazquez_Arraygame { //oac begins here
    
            
                static Trap [] mineField = new Trap[5]; 
         
                   
                   static char [][] landscape= new char[10][10];
                  
                  
                //must make puublic to all
                
              public static void main(String []args) { //main begins here
              System.err.println("One @ sign attempts to run a course");

                char[][] landscape = new char [10][10];

                Hero bucky = new Hero (0, 0);
   
              Random randy = new Random();
          
                 for (int i = 0; i < 5; i++){
                     mineField[i] = new Trap(randy.nextInt(10),randy.nextInt(10));
                 }
                
                  Scanner McScanner = new Scanner(System.in);
                System.err.println("Welcome Brave Hero!!");
                
                while(bucky.health>0){
                
        
                   
                    landscape = new char[10][10];
                    
                
                    System.out.println("Which direction would you like to go?");  
                    String answer = McScanner.nextLine();
                   System.out.printf("You said %s .\n", answer);
                   
                   bucky.move(answer);
                    landscape[bucky.getY()][bucky.getX()] = bucky.getSymbol();
              
                   

                      for (int i = 0; i < 5; i++){
                     landscape[mineField[i].getY()][mineField[i].getX()] = mineField[i].getSymbol();
                  }
                   
       

                    for (int i = 0; i <= landscape[0].length - 1; i++) {
                       for (int j = 0; j <= landscape[1].length - 2; j++) { // replaced lenght from 2 to 1
                        if (landscape[i][j] == 0 ) {
                          System.out.print("_");  
                                            
                        }else {
                          System.out.print(landscape[i][j]);
                       }
                    }
                   System.out.println("|");
                   }
                 }
               
                System.out.println( "|  _ \\| ____| / \\|_   _| | | | | __ ) \\ / /\n" +
                                    "| | | |  _|   / _ \\ | | | |_| | |  _ \\\\ V / \n" +
                                    "| |_| | |___ / ___ \\| | |  _  | | |_) | | |  \n" +
                                    "|____/|_____/_/   \\_\\_||_| |_| |____/  |_|  \n" +
                                    "                                            \n" +
                                    " _______  ______  _     ___  ____ ___ ___   ___   ___   ___   ___  _   _ \n" +
                                     "| ____\\ \\/ /  _ \\| |   / _ \\/ ___|_ _/ _ \\ / _ \\ / _ \\ / _ \\ / _ \\| \\ | |\n" +
                                     "|  _|  \\  /| |_) | |  | | | \\___ \\| | | | | | | | | | | | | | | | |  \\| |\n" +
                                     "| |___ /  \\|  __/| |__| |_| |___) | | |_| | |_| | |_| | |_| | |_| | |\\  |\n" +
                                     "|_____/_/\\_\\_|   |_____\\___/|____/___\\___/ \\___/ \\___/ \\___/ \\___/|_| \\_|\n" +
                                     "                                                                         "
                );
             //main ends here
              }

                

static class Hero {  // hero begins here
    int x,y;
    char symbol = '@';
    boolean isAlive = true;
    int health;
     
        
    
    public Hero(int a, int b){
        this.x = a;
        this.y = b;
     
        this.symbol ='@';
         health = 3;
    
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }     
    int health(){
        return this.health;
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
        if (this.x < 8){this.x += 1;}
        
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
       checkforTrap();
       
    }
    
        
       void checkforTrap(){
            
                         for (int i = 0; i < 5; i++){
                       if (mineField[i].getisActive()){
                     if (this.x == mineField[i].getX() && this.y == mineField[i].getY()){
                        
                             this.health -= 1;
                             System.out.println(this.health);
                     
                       
                     
                   }
                     
                       }
                       }
       }
    
 
       
} // hero ends here
    
static class Enemy { 
    int x,y;
    boolean isActive = true;
    char symbol = '*';
   
    
    public Enemy(int a, int b){
        
        this.x = a;
        this.y = b;
        this.symbol = '*';
 
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
    
    
    
    
static class Trap {  //trap begins here
    int x,y;
    boolean isActive = true;
    char symbol = '☢';
   
    
    public Trap(int a, int b){
        
        this.x = a;
        this.y = b;
        this.symbol = '☢';
 
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
  
    
    static class Chest {  //trap begins here
    int x,y;
    boolean isActive = true;
    char symbol = '☢';
   
    
    public Chest(int a, int b){
        
        this.x = a;
        this.y = b;
        this.symbol = '$';
 
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
  
    
    
      
    

   
} // trap ends here
    
} // oac ends here
}
}








            
            
                 
            
    


