/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiodio;

import java.time.LocalDate;

/**
 *
 * @author R3D
 */
public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria() {
    }
       
        @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    
    //GETTERS E SETTERS 

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
    //TOSTRING
    @Override
    public String toString() {
        return "\nMentoria{" + " Título = " + getTitulo() + ", Descrição = " + getDescricao() + ", Data = " + data + '}';
    }


}
