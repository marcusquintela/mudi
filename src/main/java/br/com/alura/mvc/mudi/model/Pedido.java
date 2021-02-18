package br.com.alura.mvc.mudi.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public static Pedido build() {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Celular Xiaomi Note 8 64GB Rom 4GB Ram Dual Versión Global Space Black");
        pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=Xiaomi+Redmi+Note+8&qid=1613609175&sr=8-2");
        pedido.setDescricao("Descrição qualquer do pedido");


        return pedido;
    }
}
