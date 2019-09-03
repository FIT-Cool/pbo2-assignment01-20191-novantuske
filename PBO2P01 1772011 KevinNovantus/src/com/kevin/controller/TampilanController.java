package com.kevin.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class TampilanController {
    public ImageView userPic;
    public ImageView comPic;
    public TextField winScore;
    public TextField drawScore;
    public TextField loseScore;

    Random randomNumbers = new Random();
    public int hasil;
    public int win = 0;
    public int draw = 0;
    public int lose = 0;

    public void exitAction(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void paperAction(ActionEvent actionEvent) {
        userPic.setImage(new Image("paper.jfif"));
        hasil = randomNumbers.nextInt(3);
        if (hasil == 0) {
            comPic.setImage(new Image("paper.jfif"));
            draw += 1;
            drawScore.setText(String.valueOf(draw));
        } else if (hasil == 1) {
            comPic.setImage(new Image("rock.jfif"));
            win +=1;
            winScore.setText(String.valueOf(win));
        } else if (hasil == 2) {
            comPic.setImage(new Image("scissors.jfif"));
            lose+=1;
            loseScore.setText(String.valueOf(lose));
        }


    }

    public void rockAction(ActionEvent actionEvent) {
        userPic.setImage(new Image("rock.jfif"));
        hasil = randomNumbers.nextInt(3);
        if (hasil == 0) {
            comPic.setImage(new Image("paper.jfif"));
            lose+=1;
            loseScore.setText(String.valueOf(lose));
        } else if (hasil == 1) {
            comPic.setImage(new Image("rock.jfif"));
            draw += 1;
            drawScore.setText(String.valueOf(draw));
        } else if (hasil == 2) {
            comPic.setImage(new Image("scissors.jfif"));
            win +=1;
            winScore.setText(String.valueOf(win));
        }

    }

    public void scissorsAction(ActionEvent actionEvent) {
        userPic.setImage(new Image("scissors.jfif"));
        hasil = randomNumbers.nextInt(3);
        if (hasil == 0) {
            comPic.setImage(new Image("paper.jfif"));
            win +=1;
            winScore.setText(String.valueOf(win));
        } else if (hasil == 1) {
            comPic.setImage(new Image("rock.jfif"));
            lose+=1;
            loseScore.setText(String.valueOf(lose));
        } else if (hasil == 2) {
            comPic.setImage(new Image("scissors.jfif"));
            draw += 1;
            drawScore.setText(String.valueOf(draw));
        }
    }
}
