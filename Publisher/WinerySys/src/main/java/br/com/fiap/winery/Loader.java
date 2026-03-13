package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        // Instancia a implementação do serviço
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();

        // Publica o serviço na porta 8085
        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);

        System.out.println("Serviço publicado!");
        WineWarningServiceImplementation wineWarn = new WineWarningServiceImplementation();
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarn);
    }
}