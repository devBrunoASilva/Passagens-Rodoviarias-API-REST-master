package com.ligjet.controlecliente.passagens.service;

import com.ligjet.controlecliente.passagens.entity.Cidade;
import com.ligjet.controlecliente.passagens.entity.Passagem;
import com.ligjet.controlecliente.passagens.entity.Veiculo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service//Anotação do framework Spring
public interface VeiculoService {//Interface para criar as regras da aplicação
    List<Veiculo> findAllVeiculos();//Método que deverá ser implementado por outra classe (GET)

    Veiculo findById(Long id);//Método que deverá ser implementado pelas classes(GET)

    void save(Long numero,String placa, String motorista, String modelo, Date dataCompra, int quantidadePoltronas); //Método que deverá ser implementado pelas classes (PUT)
    void save(String placa, String motorista, String modelo, Date dataCompra, int quantidadePoltronas); //Método que deverá ser implementado pelas classes (POST)

    void delete(Long id);//Método que deverá ser implementado pelas classes (DELETE)
}
