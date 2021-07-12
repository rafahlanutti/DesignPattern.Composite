package br.com.estudos;

import br.com.estudos.domain_message.DomainMessage;
import br.com.estudos.form_message.InputFormMessage;
import br.com.estudos.message.Mensagem;

public class Main {

    public static void main(String[] args) {
        var validacaoCadastro = new Mensagem("O cadastro não foi realizado!");

        var usuarioFormErro = new Mensagem("O usuário informou um nome inválido");

        var tamanhoNomeForm = new InputFormMessage("O nome precisa possuir mais de 2 caracteres");
        var nomeVazioForm = new InputFormMessage("O nome não pode possuir numeros");

        usuarioFormErro.adicionarFilha(tamanhoNomeForm);
        usuarioFormErro.adicionarFilha(nomeVazioForm);

        validacaoCadastro.adicionarFilha(usuarioFormErro);

        var domainUsuarioErro = new Mensagem("Problemas ao processar o cadastro de usuario");

        var cpfUsuarioDomain = new DomainMessage("O CPF informado está em uso!");
        var emailUsuarioDomain = new DomainMessage("O Email informado está em uso!");

        domainUsuarioErro.adicionarFilha(cpfUsuarioDomain);
        domainUsuarioErro.adicionarFilha(emailUsuarioDomain);

        validacaoCadastro.adicionarFilha(domainUsuarioErro);

        var msgNivel1 = new Mensagem("Nivel 1");
        var msgNivel2 = new Mensagem("Nivel 2");
        var msgNivel3 = new Mensagem("Nivel 3");
        var msgNivel4 = new Mensagem("Nivel 4");
        var msgNivel5 = new Mensagem("Nivel 5");

        msgNivel4.adicionarFilha(msgNivel5);
        msgNivel3.adicionarFilha(msgNivel4);
        msgNivel2.adicionarFilha(msgNivel3);
        msgNivel1.adicionarFilha(msgNivel2);

        validacaoCadastro.adicionarFilha(msgNivel1);

        validacaoCadastro.exibirMensagens(2);
        
    }

}
