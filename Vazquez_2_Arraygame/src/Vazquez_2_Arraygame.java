            

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Isidro
 */
public class Vazquez_2_Arraygame { //oac begins here
    
               
                   static char [][] landscape= new char[10][10];
                static Enemy [] thugs = new Enemy[5]; 
                static Chest [] heart = new Chest[2];

         
                
                  
                  
                //must make puublic to all
                
              public static void main(String []args) { //main begins here
              System.err.println("One @ sign attempts to run a course");
                
              char [][] landscape= new char[10][10];
             
                Hero bucky = new Hero (0, 0);
   
            
                
                  
                System.err.println("Welcome Brave Hero!!");
                
                while(bucky.health>0){
                
                 Random randy = new Random();
                 Random ra = new Random();
               
                 
                 
                 for (int z = 0; z < 5; z++){
                        thugs[z] = new Enemy(randy.nextInt(10), randy.nextInt(10));
                
                 for (int f = 0; f < 2; f++){
                       heart[f] = new Chest(ra.nextInt(10), ra.nextInt(10));
                 
                   
                    landscape = new char[10][10];
                    
                
                      for (int i = 0; i < 5; i++){
                     landscape[thugs[z].y][thugs[z].x] = thugs[z].getSymbol();
                  }
                   for (int i = 0; i < 2; i++){
                       landscape[heart[f].y][heart[f].x] = heart[f].getSymbol();
                   }
                                 
                   Scanner McScanner = new Scanner(System.in);
                     System.out.println("Which direction would you like to go?");  
                    String answer = McScanner.nextLine();
                   System.out.printf("You said %s .\n", answer);
                   
                   bucky.move(answer);
                    landscape[bucky.getY()][bucky.getX()] = bucky.getSymbol();
              

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
                }
              

          
                
static class Enemy{  //trap begins here
    int x,y;
    boolean isActive = true;
    char symbol = '☢';
   
    
    public Enemy(int a, int b){
        
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

      
  
}  
 static class Chest {  //trap begins here
    int x,y;
    boolean isActive = true;
    char symbol = '$';
    boolean isOn;
   
    
    public Chest(int c, int d){
        
        this.x = c;
        this.y = d;
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
    boolean getisOn(){
        return this.isOn;
    }
  
    
    
      
   

   
 // trap ends here
    
}
static class Hero {  // hero begins here
    int x,y;
    char symbol = '@';
    boolean isAlive = true;
    int health;
    //boolean win = true;
        
    
    public Hero(int a, int b){
        this.x = a;
        this.y = b;
     
        this.symbol ='@';
         health = 3;
    
    }
    int getX(){
        return this.x;
    }
    boolean getisAlive(){
    return this.isAlive;
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
    
        void checkforChest(){
            for (int f = 0; f < 2; f++){
                if (heart[f].getisOn()){
                    if (this.getY() == heart[f].getY() && this.getX() == heart[f].getX()){
                        this.health += 1;
                        System.out.println(this.health);
                        
                    }
                }
            }
       }
       void checkforEnemy(){
            
                         for (int z = 0; z < 5; z++){
                       if (thugs[z].getisActive()){
                     if (this.y == thugs[z].getY() && this.x == thugs[z].getX()){
                        
                             this.health -= 1;
                             System.out.println(this.health);
                     
                     }   
                     
                   }
                     
               }
                       
           }
        }
           
 // hero ends here

    
    
    
 // oac ends here
}









            
            
                 
            
    


