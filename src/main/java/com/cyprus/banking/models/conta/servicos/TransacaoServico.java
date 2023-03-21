package com.cyprus.banking.models.conta.servicos;

import com.cyprus.banking.models.conta.Conta;
import com.cyprus.banking.models.conta.TipoTransacao;
import com.cyprus.banking.models.conta.Transacao;
import com.cyprus.banking.models.conta.repositorios.TransacaoRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransacaoServico {

    private TransacaoRepository transacaoRepository;

    public Transacao criarTransacao(Conta destinatario, Conta remetente, Double valor, TipoTransacao tipoTransacao){
        if(destinatario.getId_conta() == remetente.getId_conta()) throw new IllegalStateException();

        var transacao = new Transacao(remetente, destinatario, new Date(), valor, tipoTransacao);
        return transacaoRepository.save(transacao);
    }

    public Transacao visualizarTransacaoById(Integer comprovante){
        return transacaoRepository.findById(comprovante).get();
    }

    private List<Transacao> visualizarTodasTransacoes(Conta conta){
        return transacaoRepository.findByRemetente_Id_conta(conta.getId_conta());
    }


}
