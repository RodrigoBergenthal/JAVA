
## 📘 Para Saber Mais: Strings e Text Blocks — Repositório de Classes.Estudos

Este repositório complementa seus estudos de Java trazendo um dos conceitos mais fundamentais da linguagem: **Strings** — estruturas para armazenar e manipular textos — e os **Text Blocks**, introduzidos no Java 15 para facilitar a escrita de Strings multilinhas.

---

## 🚀 Tópicos Abordados

- ✅ Criação e manipulação de Strings
- ✅ Concatenação de textos
- ✅ Comparação de conteúdo entre Strings
- ✅ Ignorar letras maiúsculas/minúsculas na comparação
- ✅ Introdução ao recurso de **Text Block**

---

## 🧠 Exemplos de Código

### 🎯 Criação de String Simples

```java
String nome = "Alura";
System.out.println(nome); // Saída: Alura
```

---

### 🔗 Concatenação de Strings

```java
String saudacao = "Olá, ";
String nome = "Alura";
String mensagem = saudacao + nome + "!";
System.out.println(mensagem); // Saída: Olá, Alura!
```

---

### 🔐 Comparação de Strings com equals()

```java
String senha = "12345";

if (senha.equals("12345")) {
    System.out.println("Acesso autorizado!");
} else {
    System.out.println("Senha incorreta.");
}
```

---

### 🎛 Comparação ignorando maiúsculas/minúsculas

```java
String entrada = "Alura";

if (entrada.equalsIgnoreCase("alura")) {
    System.out.println("Match ignorando caixa.");
}
```

---

### 📄 Text Block (Java 15+)

```java
String textoMultilinha = """
    Olá, mundo!
    Este é um Text Block.
    Permite escrever textos com múltiplas linhas
    sem precisar usar concatenação ou caracteres de escape.
    """;

System.out.println(textoMultilinha);
```

---

## ⚡ Dicas Rápidas

- Evite usar `==` para comparar Strings — prefira `.equals()` ou `.equalsIgnoreCase()`.
- Text Blocks são ideais para HTML, SQL, mensagens de erro longas e outros conteúdos formatados.
- Strings em Java são **imutáveis** — qualquer modificação cria um novo objeto.

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA

