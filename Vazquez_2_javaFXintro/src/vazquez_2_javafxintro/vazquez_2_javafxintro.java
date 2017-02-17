/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vazquez_2_javafxintro;


 
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;




public class vazquez_2_javafxintro extends Application {
 static Canvas canvas;
    public static void main(String[] args) {
        launch(args);
          Random randy = new Random();
       
    }
 private void reset(Canvas canvas, Color color) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setFill(color);
    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    
}
    @Override
    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Terrible Shapes");
        Group root = new Group();
        canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
       
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight() );
       
        drawHouse(gc);
      //drawShapes(gc);
       

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    private void drawHouse(GraphicsContext gc){
        
     

    gc.setFill(Color.PINK);
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(5);
        gc.fillRect(canvas.getWidth()/2 - 75, canvas.getHeight()/2 + 75, 150, 150);
    

    gc.setFill(Color.BLUE);
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(5);
        gc.fillRect(canvas.getWidth()/2 + 30, canvas.getHeight()/2 + 100, 40, 40);
    
    
    
    
    gc.setFill(Color.BLUE);
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(5);
        gc.fillRect(canvas.getWidth()/2 - 70, canvas.getHeight()/2 + 100, 40, 40);
        
        gc.setFill(Color.AQUA);        
          gc.setLineWidth(3);
            gc.fillArc(270, -50, 250, 250, 45, 240, ArcType.OPEN);
              gc.strokeArc(270, -50, 250, 250, 45, 240, ArcType.OPEN);
           
        gc.setFill(Color.BLUE);
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(5);
        gc.fillRect(canvas.getWidth()/2 + 30, canvas.getHeight()/2 + 100, 40, 40);
    
       
      gc.setFill(Color.BROWN);
        gc.setStroke(Color.GOLDENROD);
        gc.setLineWidth(2);
        gc.fillRect(canvas.getWidth()/2 - 70, canvas.getHeight()/2 + 160, 40, 40);
        
        gc.setFill(Color.GOLDENROD);
        gc.setLineWidth(6);
        gc.fillPolygon(new double[]{130, 200, 267},
                       new double[]{271, 200, 271}, 3);
    gc.strokePolygon(new double[]{130, 200, 267},
                         new double[]{271, 200, 271}, 3);
gc.setFill(Color.SEAGREEN);
        gc.setLineWidth(6);
        gc.fillPolygon(new double[]{0, 200, 267, 150, 171},
                       new double[]{300, 100, 0, 150 , 123}, 5);
        
        
        gc.setFill(Color.YELLOWGREEN);
        gc.setLineWidth(6);
                gc.fillPolygon(new double[]{260, 250, 270},
                       new double[]{40, 5, 2}, 3);
                
 gc.setFill(Color.YELLOWGREEN);
        gc.setLineWidth(6);
                gc.fillPolygon(new double[]{270, 245, 260},
                       new double[]{40, 5, 2}, 3);
 gc.setFill(Color.YELLOWGREEN);
        gc.setLineWidth(6);
                gc.fillPolygon(new double[]{280, 260, 260},
                       new double[]{40, 5, 2}, 3);
 gc.setFill(Color.YELLOWGREEN);
        gc.setLineWidth(6);
                gc.fillPolygon(new double[]{260, 255, 280},
                       new double[]{40, 5, 2}, 3);
 gc.setFill(Color.YELLOWGREEN);
        gc.setLineWidth(6);
                gc.fillPolygon(new double[]{260, 260, 290},
                       new double[]{40, 5, 2}, 3);

                gc.setFill(Color.GRAY);
                gc.setLineWidth(6);
                gc.fillOval(10, 60, 90, 30);
       
                 gc.setFill(Color.DARKGRAY);
                gc.setLineWidth(6);
                gc.fillOval(30, 60, 50, 20);
 // gc.setFill(Color.WHITE);
       // gc.setLineWidth(6);
       // gc.fillPolygon(new double[]{0, 200, 267, 150, 171},
              //         new double[]{300, 100, 300, 150 , 123}, 5);

  
    
    }

    
    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.PINK);
        gc.setStroke(Color. BLACK);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }
}