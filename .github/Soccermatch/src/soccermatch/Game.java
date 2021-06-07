/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccermatch;

import java.util.Random;

/**
 *
 * @author stoov
 */
public class Game {
    

    private Team t1;
    private Team t2;
    private int temp;
    private int id;
    private int t1Score;
    private int t2Score;

    public Game(Team t1, Team t2, int temp, int id, Random rnd){
        this.t1 = t1;
        this.t2 = t2;
        this.temp = temp;
        this.id = id;

      this.t1 = t1;
        this.t2 = t2;
        this.id = id;
        this.temp = temp;
        t1Score = rnd.nextInt(1 + this.temp / 5);
        t2Score = rnd.nextInt(1 + this.temp / 5);

        t1.setGoals_scored(t1.getGoals_scored() + t1Score);
        t1.setGoals_allowed(t1.getGoals_allowed() + t2Score);

        if (t1Score > t2Score) {
            t1.setWin_total(t1.getWin_total() + 1);
            t2.setLoss_total(t2.getLoss_total() + 1);
        } else if (t1Score > t2Score) {
            t1.setLoss_total(t1.getLoss_total() + 1);
            t2.setWin_total(t2.getWin_total() + 1);
        } else {
            t1.setTie_total(t1.getTie_total() + 1);
            t2.setTie_total(t2.getTie_total() + 1);
        }
    }
    }

