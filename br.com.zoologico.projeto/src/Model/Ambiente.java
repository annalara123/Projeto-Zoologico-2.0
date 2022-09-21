package Model;

public class Ambiente {

    public String nomeAmbiente;

    public String getNomeAmbiente() {
        return nomeAmbiente;
    }

    public Ambiente(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    public void setNome(String nomeAmbiente) {
        this.nomeAmbiente = nomeAmbiente;
    }

    Animal[] listaAnimais;

    public Ambiente(int capacidade){
        listaAnimais = new Animal[capacidade];
    }

    public void getlistaAnimais() {
        for (Animal listaAnimais : this.listaAnimais) {
            System.out.println(listaAnimais);
        }
    }

    public void setListaAnimais(int posicao,String nomeAmbiente,Animal animal) {

        this.nomeAmbiente = nomeAmbiente;
        this.listaAnimais[posicao] = animal;
    }

    @Override
    public String toString(){

        this.getlistaAnimais();
        return "";

    }


}
