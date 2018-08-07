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
public class PlayerHealth {
    
    private float currentHealth;
    private boolean showEffect;
    private String impactEffect;

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

    public PlayerHealth(float currentHealth, String impactEffect) {
        this.currentHealth = currentHealth;
        this.showEffect = false;
        this.impactEffect = impactEffect;
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
