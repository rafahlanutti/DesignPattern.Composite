package br.com.estudos.domain_message;

import br.com.estudos.message.IMessage;

public class DomainMessage implements IMessage {

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

    public DomainMessage(String name) {
        this.nome = name;
    }

}
