package Model;

import Interface.IVoar;

public class Gaviao extends AnimalAereo implements IVoar {

    public Boolean colocouOvos;
    public String qualidadeDasPenas;

    public Gaviao(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, int quantidadeDeAsas, boolean voa, Boolean colocouOvos, String qualidadeDasPenas) {
        super(habitat, nome, especie, genero, idade, statusDeSaude, quantidadeDeAsas, voa);
        this.colocouOvos = colocouOvos;
        this.qualidadeDasPenas = qualidadeDasPenas;
    }

    public Boolean getColocouOvos() {
        return colocouOvos;
    }

    public void setColocouOvos(Boolean colocouOvos) {
        this.colocouOvos = colocouOvos;
    }

    public String getQualidadeDasPenas() {
        return qualidadeDasPenas;
    }

    public void setQualidadeDasPenas(String qualidadeDasPenas) {
        this.qualidadeDasPenas = qualidadeDasPenas;
    }

    public Gaviao(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, int quantidadeDeAsas, boolean voa) {
        super(habitat, nome, especie, genero, idade, statusDeSaude, quantidadeDeAsas, voa);
    }

    @Override
    public int getQuantidadeDeAsas() {
        return super.getQuantidadeDeAsas();
    }

    @Override
    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        super.setQuantidadeDeAsas(quantidadeDeAsas);
    }

    @Override
    public boolean isVoa() {
        return super.isVoa();
    }

    @Override
    public void setVoa(boolean voa) {
        super.setVoa(voa);
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
    public String toString(){
        return "{Habitat: " + this.habitat + "\nNome: "+ this.nome + " ,Especie: "+  this.especie + " ,Genero: "+ this.genero+ " ,Idade: " + this.idade + " ,Status de Saude: "+
                this.statusDeSaude +"Quantidade de asas: "+this.quantidadeDeAsas+",Voa: "+this.voa+ " ,Colocou ovos: " + this.colocouOvos + " ,Qualidade das penas: " + this.qualidadeDasPenas+"}";
    }

    @Override
    public void Voar() {
        System.out.println("O animal "+this.nome+" voou no Habitat");
    }
}
