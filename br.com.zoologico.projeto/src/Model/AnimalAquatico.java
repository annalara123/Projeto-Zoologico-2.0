package Model;

import Interface.INadar;

public class AnimalAquatico extends Animal implements INadar {

    boolean temEscamas;
    int numeroDeBarbatanas;
    String aguaDoceOuSalgada;

    public AnimalAquatico(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, boolean temEscamas, int numeroDeBarbatanas, String aguaDoceOuSalgada) {
        super(habitat, nome, especie, genero, idade, statusDeSaude);
        this.temEscamas = temEscamas;
        this.numeroDeBarbatanas = numeroDeBarbatanas;
        this.aguaDoceOuSalgada = aguaDoceOuSalgada;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public int getNumeroDeBarbatanas() {
        return numeroDeBarbatanas;
    }

    public void setNumeroDeBarbatanas(int numeroDeBarbatanas) {
        this.numeroDeBarbatanas = numeroDeBarbatanas;
    }

    public String getAguaDoceOuSalgada() {
        return aguaDoceOuSalgada;
    }

    public void setAguaDoceOuSalgada(String aguaDoceOuSalgada) {
        this.aguaDoceOuSalgada = aguaDoceOuSalgada;
    }

    @Override
    public String getHabitat() {
        return super.getHabitat();
    }

    @Override
    public void setHabitat(String habitat) {
        super.setHabitat(habitat);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String getStatusDeSaude() {
        return super.getStatusDeSaude();
    }

    @Override
    public void setStatusDeSaude(String statusDeSaude) {
        super.setStatusDeSaude(statusDeSaude);
    }

    @Override
    public String getGenero() {
        return super.getGenero();
    }

    @Override
    public void setGenero(String genero) {
        super.setGenero(genero);
    }



    @Override
    public void Nadar() {
        System.out.println("O animal Nadou no Habitat");
    }
}
