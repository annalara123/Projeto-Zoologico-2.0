package Model;

import Interface.INadar;

public class Tubarao extends AnimalAquatico implements INadar {




    int quantidadeDeDentes;

    public Tubarao(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, Boolean temEscamas, int numeroDeBarbatanas, String aguaDoceOuSalgada, int quantidadeDeDentes) {
        super(habitat, nome, especie, genero, idade, statusDeSaude,temEscamas,numeroDeBarbatanas,aguaDoceOuSalgada);

        this.quantidadeDeDentes = quantidadeDeDentes;
    }

    public int getQuantidadeDeDentes() {
        return quantidadeDeDentes;
    }

    public void setQuantidadeDeDentes(int quantidadeDeDentes) {
        this.quantidadeDeDentes = quantidadeDeDentes;
    }

    @Override
    public String getHabitat() {return habitat;}

    @Override
    public void setHabitat(String habitat) {this.habitat = habitat;}

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
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
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
    public boolean isTemEscamas() {
        return super.isTemEscamas();
    }

    @Override
    public void setTemEscamas(boolean temEscamas) {
        super.setTemEscamas(temEscamas);
    }

    @Override
    public int getNumeroDeBarbatanas() {
        return super.getNumeroDeBarbatanas();
    }

    @Override
    public void setNumeroDeBarbatanas(int numeroDeBarbatanas) {
        super.setNumeroDeBarbatanas(numeroDeBarbatanas);
    }

    @Override
    public String getAguaDoceOuSalgada() {
        return super.getAguaDoceOuSalgada();
    }

    @Override
    public void setAguaDoceOuSalgada(String aguaDoceOuSalgada) {
        super.setAguaDoceOuSalgada(aguaDoceOuSalgada);
    }

    @Override
    public void Nadar() {
        System.out.println("O animal "+this.nome+ " nadou no Habitat");
    }


        @Override
        public String toString(){
        return "{Habitat: " + this.habitat + "\nNome: "+ this.nome + " ,Especie: "+  this.especie + " ,Genero: "+ this.genero+ " ,Idade: " + this.idade + " ,Status de Saude: "+
                this.statusDeSaude +"Tem escamas: "+ this.temEscamas + "Numero de Barbatanas: " + this.numeroDeBarbatanas +" Agua doce ou Salgada: " + this.aguaDoceOuSalgada+ " ,Quantidade de dentes: " + this.quantidadeDeDentes + "}";
        }

}
