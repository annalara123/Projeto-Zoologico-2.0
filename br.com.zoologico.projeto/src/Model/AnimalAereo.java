package Model;

public class AnimalAereo extends Animal{
    int quantidadeDeAsas;
    boolean voa;

    public AnimalAereo(String habitat, String nome, String especie, String genero, int idade, String statusDeSaude, int quantidadeDeAsas, boolean voa) {
        super(habitat, nome, especie, genero, idade, statusDeSaude);
        this.quantidadeDeAsas = quantidadeDeAsas;
        this.voa = voa;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
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
