/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadSmell;

/**
 *
 * @author josea
 */
public class Player {

    private int speed;
    private int jumpForce;
    private int currentPositionX;
    private int currentPositionY;
    private float currentHealth;
    private boolean showEffect;
    private String impactEffect;

    public Player(int speed, int jumpForce, float currentHealth, String impactEffect) {
        this.speed = speed;
        this.jumpForce = jumpForce;
        this.showEffect = false;
        this.currentPositionX = 0;
        this.currentPositionY = 0;
        this.currentHealth = currentHealth;
        this.impactEffect = impactEffect;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJumpForce() {
        return jumpForce;
    }

    public void setJumpForce(int jumpForce) {
        this.jumpForce = jumpForce;
    }

    public int getCurrentPositionX() {
        return currentPositionX;
    }

    public void setCurrentPositionX(int currentPositionX) {
        this.currentPositionX = currentPositionX;
    }

    public int getCurrentPositionY() {
        return currentPositionY;
    }

    public void setCurrentPositionY(int currentPositionY) {
        this.currentPositionY = currentPositionY;
    }

    public float getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(float currentHealth) {
        this.currentHealth = currentHealth;
    }

    public boolean isShowEffect() {
        return showEffect;
    }

    public void setShowEffect(boolean showEffect) {
        this.showEffect = showEffect;
    }

    public String getImpactEffect() {
        return impactEffect;
    }

    public void setImpactEffect(String impactEffect) {
        this.impactEffect = impactEffect;
    }
    
    public void Movement() {
        this.currentPositionX += this.speed;
    }

    public void Jump() {
        this.currentPositionY+=this.jumpForce;
    }
    
        public void OnReceiveAttack(int damage) {
        currentHealth -= damage;
        System.out.println("El jugador ha sufrido daño");
        if (currentHealth <= 0) {
            DeathBehaviour();
        }
    }

    public void ChangeHealth(int value) {
        currentHealth += value;
        System.out.println("El jugador ha oaumentado su vida vida");
    }


    public void DeathBehaviour() {
        showEffect=true;
        System.out.println("El Jugador a Muerto");
    }

}
