# 💱 Conversor de Moedas em Java

Um projeto em Java puro, orientado a objetos, que realiza conversão de moedas em tempo real utilizando a API [ExchangeRate-API](https://www.exchangerate-api.com/). A aplicação oferece uma interface de texto interativa no console para o usuário escolher moedas e converter valores.

---

## 📌 Funcionalidades

- Interface via console interativa
- Suporte a 6 conversões de moedas
- Taxas de câmbio dinâmicas (atualizadas em tempo real)
- Código organizado em pacotes
- Estrutura orientada a objetos

---

## 🏗️ Estrutura de Pastas

```
src/
├── Main.java
└── conversor/
    ├── Constantes.java
    ├── HttpUtil.java
    ├── Menu.java
    ├── ConversorMoeda.java
    ├── ServicoTaxaCambio.java
    └── RespostaTaxaCambio.java
```

---

## 🚀 Como Executar

### 🔧 Pré-requisitos

- JDK 17 ou superior
- Terminal ou IntelliJ IDEA
- Biblioteca `gson-2.13.1.jar` [📥 Download aqui](https://repo1.maven.org/maven2/com/google/code/gson/gson/2.13.1/gson-2.13.1.jar)
- Uma chave gratuita da [ExchangeRate API](https://www.exchangerate-api.com/)

### 💡 Substitua sua chave na classe `Constantes.java`:

```java
public class Constantes {
    public static final String API_KEY = "SUA_CHAVE_AQUI";
    public static final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
}
```

---

### 💻 Compilar e Executar via Terminal

```bash
javac -cp gson-2.13.1.jar src/conversor/*.java src/Main.java
java -cp gson-2.13.1.jar:src Main
```

> Obs.: no Windows, troque `:` por `;` no classpath.

---

## 🧠 Como Funciona

O programa segue os seguintes passos:

1. Exibe um menu com opções de conversão (ex: USD → BRL)
2. O usuário escolhe uma opção e digita um valor
3. A aplicação consulta a API ExchangeRate e obtém a taxa de câmbio
4. O valor convertido é exibido no console

---

## 📌 Tecnologias Utilizadas

- Java 17+
- Biblioteca [Gson](https://github.com/google/gson) para parse de JSON
- API pública [ExchangeRate-API](https://www.exchangerate-api.com/)

---

## 🧰 Classes Principais

| Classe               | Função Principal                                          |
|----------------------|-----------------------------------------------------------|
| `Main`               | Ponto de entrada da aplicação                             |
| `Menu`               | Interface textual com o usuário                           |
| `ConversorMoeda`     | Calcula conversão de valores                              |
| `ServicoTaxaCambio`  | Consulta a API e extrai taxa de câmbio                    |
| `RespostaTaxaCambio` | Representa os dados de resposta da API                    |
| `HttpUtil`           | Faz requisição HTTP GET                                   |
| `Constantes`         | Armazena configurações fixas (ex: chave da API)           |

---

## 📈 Melhorias Futuras

- Histórico de Conversões: Adicione a capacidade de rastrear e exibir o histórico das últimas conversões realizadas, oferecendo aos usuários uma visão completa de suas atividades.
- Suporte para Mais Moedas: Expanda a lista de moedas disponíveis para escolha, permitindo que os usuários convertam entre uma variedade ainda maior de opções monetárias.
- Registros de Logs: Utilize as funções da biblioteca java.time para criar registros que registrem as conversões realizadas, incluindo informações sobre quais moedas foram convertidas e em que momento.
- Testes automatizados com JUnit.

---

## 📝 Licença

Este projeto é de uso educacional e pessoal. Você pode reutilizá-lo e modificá-lo livremente.

---

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues, melhorias ou pull requests.
