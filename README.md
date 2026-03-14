# Checkpoint 1 - Arquitetura SOA e Web Services

Este projeto aplica os conceitos iniciais de Arquitetura Orientada a Serviços (SOA), utilizando **Java 21** e **SOAP** (JAX-WS). O sistema simula o controle de estoque de uma vinícola (Winery), contendo um módulo publicador de serviços e módulos clientes para consumo.

## 👨‍🏫 Professor
* Carlos Eduardo Machado de Oliveira

## 👥 Grupo (Nome da Equipe)
* Nickolas Moreno Cardoso RM557132
* André Giovanne de Maria RM556384

---

## 🏗️ Estrutura do Projeto

O repositório está dividido em duas pastas principais:

1.  **Publisher (`WinerySys`):** Contém o servidor que publica os serviços SOAP.
    * `WineStockService`: Interface do serviço de estoque.
    * `WineWarningService`: Interface do serviço de avisos.
    * `Loader`: Classe responsável por publicar os endpoints em `http://localhost:8085` e `http://localhost:8086`.

2.  **Consumer:** Contém os clientes que consomem os serviços publicados.
    * `WineStockClient`: Consome a listagem de vinhos.
    * `WineOrderClient`: Realiza pedidos e recebe alertas de estoque.

---

## 🛠️ Tecnologias Utilizadas
* **Java 21**
* **Maven** (Build Automation)
* **JAX-WS (Jakarta XML Web Services)** - Versão 4.0.2

---

## 🚀 Como Executar

### 1. Iniciar o Servidor (Publisher)
O servidor **deve** estar rodando para que os clientes consigam se conectar e para que o plugin do Maven consiga gerar as classes.
1. Navegue até o projeto `WinerySys`.
2. Execute a classe `br.com.fiap.winery.Loader`.
3. Verifique se a mensagem **"Serviço publicado!"** aparece no console.

### 2. Gerar Classes de Suporte (wsimport)
Caso as classes de serviço não sejam reconhecidas nos clientes:
1. Navegue até os projetos de Consumer.
2. Execute o comando Maven: `mvn jaxws:wsimport`.

### 3. Executar os Clientes (Consumer)
1. Execute a classe `ApplicationClient1` no projeto `WineStockClient` para ver o menu.
2. Execute a classe `ApplicationClient2` no projeto `WineOrderClient` para testar pedidos e avisos.

---

## 🔗 Endereços WSDL (Endpoints)
* Estoque: `http://localhost:8085/WineStockService?wsdl`
* Aviso: `http://localhost:8086/WineWarningService?wsdl`
