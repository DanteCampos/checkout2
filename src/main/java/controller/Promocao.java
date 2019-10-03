package controller;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

//Esta é a classe que descreve uma promoção
public class Promocao implements Promocoes{
    
    //Esse método retorna o desconto para uma promoção do tipo 3 Por 130
    @Override
    public int getDescontoP3Por130(Produto p) {
        int precoProduto = p.getPreco();
        int desconto = 3*precoProduto - 130;
        return desconto;
    }
    
    //Esse método retorna o desconto para uma promoção do tipo Leve 3 Pague 2
    @Override
    public int getDescontoPLeve3Pague2(Produto p) {
        int precoProduto = p.getPreco();
        int desconto = 3*precoProduto - 2*precoProduto;
        return desconto;
    }
    
    //Esse método retorna o desconto para uma promoção do tipo 2 Por 45
    @Override
    public int getDescontoP2Por45(Produto p) {
        int precoProduto = p.getPreco();
        int desconto = 2*precoProduto - 45;
        return desconto;
    }
    
    //Esse método retorna o desconto para uma promoção do tipo 2 Por 25
    @Override
    public int getDescontoP2Por25(Produto p) {
        int precoProduto = p.getPreco();
        int desconto = 2*precoProduto - 25;
        return desconto;
    }
}
