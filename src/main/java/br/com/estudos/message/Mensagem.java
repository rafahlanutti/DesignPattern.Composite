package br.com.estudos.message;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mensagem implements IMessage {

    private List<IMessage> lista = new ArrayList<>();
    private String nome;

    public Mensagem(String nome) {
        this.nome = nome;
    }

    public void adicionarFilha(IMessage filha) {
        this.lista.add(filha);
    }

    public void removerFilha(IMessage filha) {
        this.lista.remove(filha);
    }

    public IMessage obterFilha(int index) {
        return this.lista.get(index);
    }

    public Optional<Boolean> obterFilha(String nome) {
        return this.lista.stream()
                         .map(c -> c.getNome() == nome)
                         .findFirst();

    }

    public List<IMessage> obterLista() {
        return this.lista;
    }

    public void exibirMensagens(int sub) {
        System.out.println(this.renderNivel(sub) + this.nome);

        for (var mensagem : this.lista) {
            mensagem.exibirMensagens(sub + 2);
        }

    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}