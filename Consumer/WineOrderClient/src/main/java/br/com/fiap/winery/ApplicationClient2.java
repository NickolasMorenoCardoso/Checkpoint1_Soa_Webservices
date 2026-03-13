package br.com.fiap.winery;

import jakarta.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        // 1. Consumindo o Pedido (Porta 8085)
        URL url1 = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName1 = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service1 = Service.create(url1, qName1);
        WineStockService stock = service1.getPort(WineStockService.class);

        System.out.println("Status do Pedido: " + stock.placeOrder("Merlot", 10));

        // 2. Consumindo o Aviso (Porta 8086)
        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);
        WineWarningService warnService = service2.getPort(WineWarningService.class);

        System.out.println("Mensagem de Alerta: " + warnService.sendWarn());
    }
}