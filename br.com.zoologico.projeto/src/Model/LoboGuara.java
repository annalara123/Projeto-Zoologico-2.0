package Model;

import Interface.ICaminhar;

public class LoboGuara extends AnimalTerrestre implements ICaminhar {

    public String qualidadeDoPelo;


    public LoboGuara(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, int numeroDePatas, boolean temPelo, String qualidadeDoPelo) {
        super(habitat, nome, especie, genero, idade, statusDeSaude,numeroDePatas,temPelo);
        this.qualidadeDoPelo = qualidadeDoPelo;
    }
    public String getQualidadeDoPelo() {
        return qualidadeDoPelo;
    }

    public void setQualidadeDoPelo(String qualidadeDoPelo) {
        this.qualidadeDoPelo = qualidadeDoPelo;
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
    public int getNumeroDePatas() {
        return super.getNumeroDePatas();
    }

    @Override
    public void setNumeroDePatas(int numeroDePatas) {
        super.setNumeroDePatas(numeroDePatas);
    }

    @Override
    public boolean isTemPelo() {
        return super.isTemPelo();
    }

    @Override
    public void setTemPelo(boolean temPelo) {
        super.setTemPelo(temPelo);
    }


        @Override
        public String toString () {
            return "{Habitat: " + this.habitat + "\nNome: " + this.nome + " ,Especie: " + this.especie + " ,Genero: " + this.genero + " ,Idade: " + this.idade + " ,Status de Saude: " +
                    this.statusDeSaude + "Quantidade de patas: " + this.numeroDePatas + "Tem pelo? :" + this.temPelo + "Qualidade do pelo: " + this.qualidadeDoPelo + "}";
        }

    @Override
    public void Caminhar() {
        System.out.println("O Animal " + this.nome + " caminhou no habitat");
    }
}
