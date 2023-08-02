package dominio;

import java.math.BigDecimal;

public class Boletim {
    private float matematica;
    private float portugues;
    private float informatica;
    private float historia;
    @Override
    public String toString() {
        return "MAT: "+matematica+" | POR: "+portugues+" | HIS: "+historia+" | INF: "+informatica + " | média = "+ mediaFinalAluno();
    }

    public float getMatematica() {
        return matematica;
    }

    public void setMatematica(float matematica) {
        this.matematica = matematica;
    }

    public float getPortugues() {
        return portugues;
    }

    public void setPortugues(float portugues) {
        this.portugues = portugues;
    }

    public float getInformatica() {
        return informatica;
    }

    public void setInformatica(float informatica) {
        this.informatica = informatica;
    }

    public float getHistoria() {
        return historia;
    }

    public void setHistoria(float historia) {
        this.historia = historia;
    }

    public float mediaFinalAluno(){
        return  ((matematica+portugues+historia+informatica)/4);
    }
}
