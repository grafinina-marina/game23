/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafinina;

import java.util.TimerTask;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Marin
 */
public class Grafinina extends Application {

    void rightMove(ImageView circle) {
        //if pacman goes off screen X, put him on the other side
        if (X + 10 > 395) {
            X = X;
        } else {
            X += 10;
        }

        circle.setTranslateX(X);
    }

    //move circle left
    void leftMove(ImageView circle) {
        //if pacman collides with object, don't allow it
        if (X - 10 < 20) {
            X = X + 10;
        }
        if (X - 10 == 90 && Y == 45) { // CAKE CONDITIONS
            Y = Y;
            cake.setImage(cakeImage);
            cake.setTranslateY(imY);
            cake.setTranslateX(imX);
            cake.setFitWidth(35);
            cake.setFitHeight(35);
        } else if ((X == 270) && (Y == 165 || Y == 175 || Y == 185)) { //collisions begin
            X = X;
        } else if ((X == 310) && (Y == 155 || Y == 145 || Y == 135 || Y == 125 || Y == 115)) {
            X = X;
        } else if ((X == 350) && (Y == 115 || Y == 105 || Y == 95 || Y == 85 || Y == 75 || Y == 65 || Y == 55)) {
            X = X;
        } else if ((X == 390) && (Y == 35 || Y == 45)) {
            X = X;
        } else if ((X == 390) && (Y == 115 || Y == 105 || Y == 95)) {
            X = X;
        } else if ((X == 310) && (Y == 65 || Y == 55)) {
            X = X;
        } else if ((X == 270) && (Y == 95 || Y == 85 || Y == 75 || Y == 65 || Y == 55)) {
            X = X;
        } else if ((X == 230) && (Y == 45 || Y == 35 || Y == 25)) {
            X = X;
        } else if ((X == 230) && (Y == 115 || Y == 125 || Y == 135)) {
            X = X;
        } else if ((X == 190) && (Y == 55 || Y == 65 || Y == 75 || Y == 85 || Y == 95 || Y == 105 || Y == 115)) {
            X = X;
        } else if ((X == 190) && (Y == 185 || Y == 175 || Y == 165 || Y == 155)) {
            X = X;
        } else if ((X == 150) && (Y == 125 || Y == 135 || Y == 145 || Y == 155)) {
            X = X;
        } else if ((X == 140) && (Y == -5 || Y == 5 || Y == 15 || Y == 25 || Y == 35 || Y == 45)) {
            X = X;
        } else if ((X == 100) && (Y == 75 || Y == 85 || Y == 95 || Y == 105 || Y == 115)) {
            X = X;
        } else if ((X == 60) && (Y == 115 || Y == 125)) {
            X = X;
        } else {
            X -= 10;
        }

        circle.setTranslateX(X);
    }

    //move circle down
    void downMove(ImageView circle) {

        if (Y + 10 > 190) {
            Y = Y;
        } else if ((Y == 125) && (X == 350 || X == 360 || X == 370 || X == 380 || X == 390)) {
            Y = Y;
        } else if ((Y == 55) && (X == 370 || X == 380 || X == 390)) {
            Y = Y;
        } else if ((Y == 25) && (X <= 370 && X >= 280)) {
            Y = Y;
        } else if ((Y == 95) && (X >= 310 && X <= 270)) {
            Y = Y;
        } else if ((Y == 45) && (X >= 230 && X <= 250)) {
            Y = Y;
        } else if ((Y == 15) && (X <= 220 && X >= 150)) {
            Y = Y;
        } else if ((Y == 45) && (X >= 140 && X <= 170)) {
            Y = Y;
        } else if ((Y == 95) && (X >= 270 && X <= 310)) {
            Y = Y;
        } else {
            Y += 10;
        }

        circle.setTranslateY(Y);
    }

    //move circle up
    void upMove(ImageView circle) {

        if (Y - 10 < -5) {
            Y = Y;
        } else if ((Y == 165) && (X == 390 || X == 380 || X == 370 || X == 360 || X == 350 || X == 340)) {
            Y = Y;
        } else if ((Y == 95) && (X == 390)) { //collisions begin
            Y = Y;
        } else if ((Y == 165) && (X == 270 || X == 280 || X == 290 || X == 300)) {
            Y = Y;
        } else if ((Y == 125) && (X == 310 || X == 320 || X == 330 || X == 340)) {
            Y = Y;
        } else if ((Y == 55) && (X == 350 || X == 360 || X == 370 || X == 380)) {
            Y = Y;
        } else if ((Y == 45) && (X == 160 || X == 170 || X == 180 || X == 190 || X == 200)) {
            Y = Y;
        } else if ((Y == 75) && (X == 210 || X == 220 || X == 230 || X == 240)) {
            Y = Y;
        } else if ((Y == 55) && (X == 310)) {
            Y = Y;
        } else if ((Y == 125) && (X == 240 || X == 250 || X == 260 || X == 270 || X == 280)) {
            Y = Y;
        } else if ((Y == 165) && (X == 200 || X == 210 || X == 220 || X == 230 || X == 240)) {
            Y = Y;
        } else if ((Y == 125) && (X == 180 || X == 170 || X == 160 || X == 150)) {
            Y = Y;
        } else if ((Y == 165) && (X == 140 || X == 130 || X == 120 || X == 110 || X == 100 || X == 90 || X == 80 || X == 70 || X == 60)) {
            Y = Y;
        } else if ((Y == 125) && (X == 20 || X == 30 || X == 40 || X == 50)) {
            Y = Y;
        } else if ((Y == 125) && (X == 80 || X == 90)) {
            Y = Y;
        } else if ((Y == 85) && (X == 100 || X == 110 || X == 120 || X == 130 || X == 140 || X == 150)) {
            Y = Y;
        } else if ((Y == 85) && (X == 70 || X == 60 || X == 50 || X == 40)) {
            Y = Y;
        } else if ((Y == 125) && (X == 370 || X == 380)) {
            Y = Y;
        } else if ((Y == 85) && (X == 290 || X == 300)) {
            Y = Y;
        } else {
            Y -= 10;
        }

        circle.setTranslateY(Y);
    }

    public static int X = 380; //char begins at x = 150
    public static int Y = 175; //char begins at y = 100

    public static int imX = 70; //cake begins
    public static int imY = 45; //cake begins

    public static Image cakeImage = new Image("cake.png");
    public static Image mImage = new Image("m.png");
    public static ImageView cake = new ImageView();

    public static Label label = new Label(""); //label when you lose

    public static void main(String[] args) {
        Application.launch(args);
    }

    
    @Override
    public void start(Stage theStage) {
        theStage.setTitle("Hello, World!");
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStage.setScene(theScene);

        Canvas canvas = new Canvas(1024, 682);
        root.getChildren().add(canvas);
        Button btn = new Button();
        btn.setText(" СТАРТ  ");
        btn.setOnAction((ActionEvent event) -> {


      
 
      

            Pane pane = new Pane();

            cake.setImage(mImage);
            cake.setFitWidth(35);
            cake.setFitHeight(35);
            cake.setTranslateY(imY);
            cake.setTranslateX(imX);

            //creating ghostOne and setting coords
            Circle ghostOne = new Circle();
            ghostOne.setRadius(10);
            ghostOne.setCenterX(X);
            ghostOne.setCenterY(Y - 100);
            ghostOne.setFill(Color.PINK);
            ghostOne.setStroke(Color.BLACK);

            Image pokemon = new Image("z1.png");
            Image fon = new Image("grass.png");
            ImageView back = new ImageView(fon);
            ImageView pacman = new ImageView(pokemon);
            back.setTranslateX(0);
            back.setTranslateY(0);
            back.setFitWidth(450);
            back.setFitHeight(230);
            pacman.setFitWidth(30);
            pacman.setFitHeight(40);
            pacman.setTranslateX(X);
            pacman.setTranslateY(Y);

            /*  ***** START SET PIECES *****  */
            //column set pieces START
            Rectangle colOne = new Rectangle(430, 5, 5, 220); //left side
            colOne.setFill(Color.BLACK);
            colOne.setStroke(Color.BLACK);

            Rectangle colTwo = new Rectangle(20, 5, 5, 220); //right side
            colTwo.setFill(Color.BLACK);
            colTwo.setStroke(Color.BLACK);

            Rectangle colThree = new Rectangle(20, 5, 415, 5); //top
            colThree.setFill(Color.BLACK);
            colThree.setStroke(Color.BLACK);

            Rectangle colFour = new Rectangle(20, 220, 415, 5); //bottom
            colFour.setFill(Color.BLACK);
            colFour.setStroke(Color.BLACK);
            //column set pieces END

            //maze set pieces START
            Rectangle set1 = new Rectangle(130, 10, 10, 70);
            set1.setFill(Color.SIENNA);
            set1.setStroke(Color.BLACK);

            Rectangle set2 = new Rectangle(60, 80, 130, 10);
            set2.setFill(Color.SIENNA);
            set2.setStroke(Color.BLACK);

            Rectangle set3 = new Rectangle(60, 35, 10, 45);
            set3.setFill(Color.SIENNA);
            set3.setStroke(Color.BLACK);

            Rectangle set4 = new Rectangle(70, 35, 25, 10);
            set4.setFill(Color.SIENNA);
            set4.setStroke(Color.BLACK);

            Rectangle set5 = new Rectangle(95, 90, 10, 45);
            set5.setFill(Color.SIENNA);
            set5.setStroke(Color.BLACK);

            Rectangle set6 = new Rectangle(25, 125, 40, 10);
            set6.setFill(Color.SIENNA);
            set6.setStroke(Color.BLACK);

            Rectangle set7 = new Rectangle(180, 90, 10, 45);
            set7.setFill(Color.SIENNA);
            set7.setStroke(Color.BLACK);

            Rectangle set8 = new Rectangle(140, 125, 40, 10);
            set8.setFill(Color.SIENNA);
            set8.setStroke(Color.BLACK);

            Rectangle set9 = new Rectangle(140, 135, 10, 45);
            set9.setFill(Color.SIENNA);
            set9.setStroke(Color.BLACK);

            Rectangle set10 = new Rectangle(80, 170, 60, 10);
            set10.setFill(Color.SIENNA);
            set10.setStroke(Color.BLACK);

            Rectangle set11 = new Rectangle(180, 175, 10, 45);
            set11.setFill(Color.SIENNA);
            set11.setStroke(Color.BLACK);

            Rectangle set12 = new Rectangle(260, 175, 10, 45);
            set12.setFill(Color.SIENNA);
            set12.setStroke(Color.BLACK);

            Rectangle set13 = new Rectangle(220, 165, 90, 10);
            set13.setFill(Color.SIENNA);
            set13.setStroke(Color.BLACK);

            Rectangle set14 = new Rectangle(220, 135, 10, 30);
            set14.setFill(Color.SIENNA);
            set14.setStroke(Color.BLACK);

            Rectangle set15 = new Rectangle(300, 135, 10, 30);
            set15.setFill(Color.SIENNA);
            set15.setStroke(Color.BLACK);

            Rectangle set16 = new Rectangle(260, 125, 90, 10);
            set16.setFill(Color.SIENNA);
            set16.setStroke(Color.BLACK);

            Rectangle set17 = new Rectangle(340, 65, 10, 60);
            set17.setFill(Color.SIENNA);
            set17.setStroke(Color.BLACK);

            Rectangle set18 = new Rectangle(300, 55, 90, 10);
            set18.setFill(Color.SIENNA);
            set18.setStroke(Color.BLACK);

            Rectangle set19 = new Rectangle(300, 65, 10, 30);
            set19.setFill(Color.SIENNA);
            set19.setStroke(Color.BLACK);

            Rectangle set20 = new Rectangle(260, 80, 10, 45);
            set20.setFill(Color.SIENNA);
            set20.setStroke(Color.BLACK);

            Rectangle set21 = new Rectangle(225, 80, 35, 10);
            set21.setFill(Color.SIENNA);
            set21.setStroke(Color.BLACK);

            Rectangle set22 = new Rectangle(225, 45, 10, 35);
            set22.setFill(Color.SIENNA);
            set22.setStroke(Color.BLACK);

            Rectangle set23 = new Rectangle(175, 45, 50, 10);
            set23.setFill(Color.SIENNA);
            set23.setStroke(Color.BLACK);

            Rectangle set24 = new Rectangle(385, 90, 45, 10);
            set24.setFill(Color.SIENNA);
            set24.setStroke(Color.BLACK);

            Rectangle set25 = new Rectangle(385, 100, 10, 35);
            set25.setFill(Color.SIENNA);
            set25.setStroke(Color.BLACK);

            Rectangle set26 = new Rectangle(360, 160, 70, 10);
            set26.setFill(Color.SIENNA);
            set26.setStroke(Color.BLACK);

            //maze set pieces END
            /*  ***** END SET PIECES *****   */
            //adding children to pane -------------
            pane.getChildren().addAll(colOne, colTwo, colThree, colFour); //columns added
            pane.getChildren().addAll(label, back, pacman, cake); //objects added
            pane.getChildren().addAll(set1, set2, set3, set4, set5, set6, set7, set8, set9);
            pane.getChildren().addAll(set10, set11, set12, set13, set14, set15, set16, set17);
            pane.getChildren().addAll(set18, set19, set20, set21, set22, set23, set24, set25, set26);

            //setting on key pressed for pacman
            pacman.setOnKeyPressed(e -> {
                switch (e.getCode()) {
                    case UP:  //if up key pressed
                        upMove(pacman);
                        break;
                    case DOWN: //if down key pressed
                        downMove(pacman);
                        break;
                    case RIGHT: //if right key pressed
                        rightMove(pacman);
                        break;
                    case LEFT: //if left key pressed
                        leftMove(pacman);
                        break;
                }
            });

            Scene scene = new Scene(pane, 450, 230);
            pane.setId("pane");

            Stage stage = new Stage();

            Stage primaryStage = new Stage();
            primaryStage.setTitle("Maze Game");
            primaryStage.setScene(scene);

            primaryStage.show();
            pacman.requestFocus();
        });
        btn.relocate(900, 300);
 
   
     
        
        Button btn2 = new Button();
        btn2.setText("СПРАВКА");
       
           btn2.setOnAction(new EventHandler<ActionEvent>(){
                @Override 
                public void handle(ActionEvent event){
                    Label secondLabel = new Label("Информация по игре:\n"
                    + "движение осуществляется по кнопкам left; right; up; down\n"
                    +"цель игры добежать до морковки за 1 минуту\n"
                    +"в случае неудачи игра начинается снова") ;
                    
                    StackPane secondaryLayout = new StackPane();
                    secondaryLayout.getChildren().add(secondLabel);
                    
                    Scene secondScene = new Scene(secondaryLayout,682, 500);
                    
                    Stage newWindow = new Stage();
                    newWindow.setTitle("Second Stage");
                    newWindow.setScene(secondScene);
                    
                    newWindow.setX(theStage.getX() +200);
                    newWindow.setY(theStage.getY() +100);
                    secondLabel.getStylesheets().add("css/GrafininaM.css");
                    
                    newWindow.show();
                }
            
        });
        
        btn2.relocate(900, 360);
        
        Button btn1 = new Button();
        btn1.setText("  ВЫХОД  ");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Stage stage = (Stage) btn1.getScene().getWindow();
                stage.close();
            }
        });
        btn1.relocate(900, 415);

        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.RED);
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(2);
        Font theFont = Font.font("French Script MT", FontWeight.BOLD, 48);
        gc.setFont(theFont);

        Image pic = new Image("f.jpg");
        gc.drawImage(pic, 0, 0);

        gc.fillText("КАКИЕ ЛЮДИ ٩(◕‿◕)۶", 30, 120);
        gc.strokeText("КАКИЕ ЛЮДИ ٩(◕‿◕)۶", 30, 120);
        Image pic1 = new Image("m1.png");
        gc.drawImage(pic1, 50, 200);
        Image pic2 = new Image("z1.png");
        gc.drawImage(pic2, 250, 330);
        Image pic3 = new Image("mi.png");
        gc.drawImage(pic3, 405, 175);
        gc.setFill(Color.GREY);

        Font in = Font.font("French Script MT", FontWeight.BOLD, 25);
        gc.setFont(in);
        gc.fillText("©Графинина М.А ФМФИ б-18ПИо", 630, 670);
        btn.getStylesheets().add("css/GrafininaM.css");
        btn1.getStylesheets().add("css/gm.css");
        btn2.getStylesheets().add("css/gm.css");
        theStage.show();  
        }}

 
//©Grafinina
