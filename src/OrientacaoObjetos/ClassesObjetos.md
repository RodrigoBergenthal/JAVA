
---

## 🧱 Definição de Classe em Java

Uma **classe** é uma estrutura que define um tipo de objeto. Funciona como um **molde**, determinando:

- **Características** (atributos)
- **Comportamentos** (métodos)

### 🔹 Exemplo: Classe `Pessoa`

```java
public class Pessoa {

    String nome;
    int idade;

    void fazAniversario() {
        idade++;
    }

}
```

---

## 🎭 O que é um Objeto?

Um **objeto** é uma **instância de uma classe**. É através dos objetos que representamos informações na aplicação. Para criar um objeto usamos:

```java
Pessoa pessoa1 = new Pessoa();
```

Esse comando:

- Cria um objeto a partir da classe `Pessoa`
- Armazena a referência em `pessoa1`

Esse objeto terá os atributos `nome` e `idade`, além do método `fazAniversario()`.

---

## ✍️ Atribuindo valores e utilizando métodos

```java
Pessoa pessoa1 = new Pessoa();

pessoa1.nome = "Ana";
pessoa1.idade = 20;

System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

pessoa1.fazAniversario();

System.out.println("A idade agora é: " + pessoa1.idade);
```

---

## 👥 Criando múltiplos objetos

É possível criar diversos objetos da mesma classe, cada um com seus próprios valores:

```java
Pessoa pessoa1 = new Pessoa();
pessoa1.nome = "Ana";
pessoa1.idade = 20;

System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");
pessoa1.fazAniversario();
System.out.println("A idade agora é: " + pessoa1.idade);

Pessoa pessoa2 = new Pessoa();
pessoa2.nome = "Carlos";
pessoa2.idade = 20;

System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");
pessoa2.fazAniversario();
System.out.println("A idade agora é: " + pessoa2.idade);
```

---
