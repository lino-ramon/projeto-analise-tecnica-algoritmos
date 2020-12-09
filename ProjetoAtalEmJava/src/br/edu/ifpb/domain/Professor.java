package br.edu.ifpb.domain;

import java.util.ArrayList;

public class Professor {

    private String  nome;
    private int matricula;
    private boolean gestor;
    private boolean cordenador;
    private int cargaHoraria;
    private int cargaDeTrabalho;
    private ArrayList<Integer> experience;


    public ArrayList<Integer> getExperience() {
        return experience;
    }

    public void setExperience(ArrayList<Integer> experience) {
        this.experience = experience;
    }

    public Professor(Integer matricula, String nome, Boolean gestor, Boolean cordenador) {
        this.matricula = matricula;
        this.nome = nome;
        this.gestor = gestor;
        this.cordenador = cordenador;
        this.cargaDeTrabalho = 0;
    }

    public int getCargaDeTrabalho() {
        return cargaDeTrabalho;
    }

    public void setCargaDeTrabalho(int cargaDeTrabalho) {
        this.cargaDeTrabalho = cargaDeTrabalho;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isGestor() {
        return gestor;
    }

    public void setGestor(boolean gestor) {
        this.gestor = gestor;
    }

    public boolean isCordenador() {
        return cordenador;
    }

    public void setCordenador(boolean cordenador) {
        this.cordenador = cordenador;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
