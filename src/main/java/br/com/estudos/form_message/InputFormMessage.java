package br.com.estudos.form_message;

import br.com.estudos.message.IMessage;

public class InputFormMessage implements IMessage {

    private String nome;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;

    }

    @Override
    public void exibirMensagens(int sub) {

        System.out.println(this.renderNivel(sub) + nome);

    }

    public InputFormMessage(String name) {
        this.nome = name;
    }

}
