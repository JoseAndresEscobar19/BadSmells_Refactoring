/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizado;

/**
 *
 * @author josea
 */
public class PlayerMovement {

    private int speed;
    private int jumpForce;
    private int currentPositionX;
    private int currentPositionY;

    public PlayerMovement(int speed, int jumpForce) {
        this.speed = speed;
        this.jumpForce = jumpForce;
        this.currentPositionX = 0;
        this.currentPositionY = 0;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getJumpForce() {
        return jumpForce;
    }

    public void setJumpForce(int jumpForce) {
        this.jumpForce = jumpForce;
    }

    public void Movement() {
        this.currentPositionX += this.speed;
    }

    public void Jump() {
        this.currentPositionY+=this.jumpForce;
    }
}
