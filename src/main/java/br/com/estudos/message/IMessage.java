package br.com.estudos.message;

public interface IMessage {

    public String getNome();

    public void setNome(String nome);

    void exibirMensagens(int sub);

    default String renderNivel(int sub) {
        String separador = "";

        for (int i = 0; i < sub; i++) {
            separador += "-";

        }
        return separador;
    }

}
