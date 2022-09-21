package Model;

public class AnimalTerrestre extends Animal {

    int numeroDePatas;
    boolean temPelo;

    public AnimalTerrestre(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, int numeroDePatas, boolean temPelo) {
        super(habitat, nome, especie, genero, idade, statusDeSaude);
        this.numeroDePatas = numeroDePatas;
        this.temPelo = temPelo;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public boolean isTemPelo() {
        return temPelo;
    }

    public void setTemPelo(boolean temPelo) {
        this.temPelo = temPelo;

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
}
