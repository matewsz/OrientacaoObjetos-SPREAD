
package desafiodio;


public class Curso extends Conteudo {
    
    private int cargaHoraria;

    public Curso() {
    }
    
        @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    
    //GETTERS E SETTERS
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "\nCurso{" + " Título = " + getTitulo() + ", Descrição = " + getDescricao() + ", Carga Horária = " + cargaHoraria + '}';
    }


    
}
