/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadSmell;

import javax.sound.midi.Soundbank;

/**
 *
 * @author josea
 */
public class Usuario_BadSmell {

    private String name;
    private String nickName;
    private float ingreso;
    private int extras;
    private float descuento;
    
    public Usuario_BadSmell() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }
    
    public void presentarUsuario(){
        System.out.println(this.name);
        System.out.println(this.nickName);
        
        float total=0;
        
        for (int i = 0; i < this.extras; i++) {
            total+=this.descuento;
            
            if (total>this.ingreso){
                continue;
            }
            
            total-=this.ingreso;
        }
        
        System.out.println(total);
        
    }
}
