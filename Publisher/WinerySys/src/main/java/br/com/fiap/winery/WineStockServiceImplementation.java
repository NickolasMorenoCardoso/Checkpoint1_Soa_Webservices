package br.com.fiap.winery;

import jakarta.jws.WebService;

// Esta anotação liga esta implementação à interface que criaste no passo anterior
@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        // Retorna a lista de vinhos/uvas disponível no stock
        return "Menu de Vinhos: \n1. Cabernet Sauvignon \n2. Merlot \n3. Pinot Noir \n4. Chardonnay";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        // Retorna a mensagem de confirmação do pedido
        return "Pedido confirmado! Foram reservadas " + quantity + " unidades de " + name + ".";
    }
}