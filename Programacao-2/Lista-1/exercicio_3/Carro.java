/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

/**
 *
 * @author marci
 */
public class Carro {
    private String placa;
    private String cor;
    private String modelo;
    private boolean conversivel;
    private boolean movendo;

    @Override
    public String toString() {
        return "Carro{" + "placa=" + this.placa + ", cor=" + cor + ", modelo=" + modelo + ", conversivel=" + conversivel + ", movendo=" + movendo + '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isConversivel() {
        return conversivel;
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }

    public boolean isMovendo() {
        return movendo;
    }

    public void setMovendo(boolean movendo) {
        this.movendo = movendo;
    }
    
    
    
}
