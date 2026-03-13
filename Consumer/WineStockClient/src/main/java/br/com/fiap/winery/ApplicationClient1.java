package br.com.fiap.winery;

import jakarta.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

public class ApplicationClient1 {
    public static void main(String[] args) throws Exception {

        // Instancia a URL apontando para o WSDL do teu servidor [cite: 39]
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");

        // Instancia o QName com o namespace (que é o teu pacote invertido) e o nome do serviço [cite: 40]
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

        // Cria a instância do Service [cite: 41]
        Service service = Service.create(url, qName);

        // Obtém a porta (interface) de comunicação [cite: 42]
        WineStockService wineStockService = service.getPort(WineStockService.class);

        // Invoca o método getMenu e imprime o resultado na consola [cite: 43]
        String menu = wineStockService.getMenu();
        System.out.println("Resposta do Servidor:\n" + menu);
    }
}