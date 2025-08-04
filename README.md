
# 📚 Guia de Estudos Java

Bem-vindo ao Guia de Estudos Java! Este repositório foi organizado para servir como uma referência completa para aprendizado da linguagem Java, desde conceitos básicos até tópicos avançados.

## 📋 Índice

### 🔰 Fundamentos da Linguagem
- [Olá Mundo e Primeiros Passos](#primeiros-passos)
- [Tipos Primitivos](./Tipos%20Primitivos.md)
- [Operadores](./Operadores.md)
- [Strings e Text Blocks](./Strings%20e%20Text%20Blocks.md)
- [Formatação de Textos](./Formatação%20de%20Textos)
- [Casting](./Casting.md)
- [Comentários no Código](./Comentários%20no%20Código%20Fonte.md)

### 🧩 Estruturas de Controle
- [Condicionais](./src/Condicionais/)
- [Loops e Iterações](#loops-e-iterações)

### 📦 Orientação a Objetos
- [Classes e Objetos](./src/OrientacaoObjetos/ClassesObjetos.md)
- [Modificadores de Acesso](./src/OrientacaoObjetos/Modificadores.md)
- [Palavra-chave 'this'](./src/OrientacaoObjetos/This.md)
- [Convenções de Nomenclatura](./src/OrientacaoObjetos/PadraoNomes.md)
- [Documentação JavaDoc](./src/OrientacaoObjetos/DocumentaçãoJava.md)

### 🎮 Projetos Práticos
- [Jogo de Adivinhação](./src/Game/Adivinha.java)
- [Quiz](./src/Game/Quiz.java) - [Documentação](./src/Game/Quiz.md)

### 🏠 Desafios Home Office
- [Desafios Gerais](./src/homeOffice/Desafio.md)
- [Desafios Fullstack](./src/homeOffice/desafioFullstack.md)
- [Guia de Desafios](./src/homeOffice/README.md)

---

## 🔰 Fundamentos da Linguagem

<a id="primeiros-passos"></a>
### Olá Mundo e Primeiros Passos

O clássico exemplo para iniciar em qualquer linguagem de programação:

---

## 🧠 Exemplos de Código

### Hello World

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

### Operações Matemáticas Básicas

```java
public class OperacoesMatematicas {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
    }
}
```

<a id="loops-e-iterações"></a>
### Loops e Iterações

```java
public class ExemplosLoops {
    public static void main(String[] args) {
        // Exemplo de for
        System.out.println("Loop for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração " + i);
        }
        
        // Exemplo de while
        System.out.println("\nLoop while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contagem " + contador);
            contador++;
        }
    }
}
```
---

## ⚡ Atalhos Úteis no IntelliJ IDEA

| Atalho      | Descrição                                 |
|-------------|-----------------------------------------|
| `psvm`      | Gera automaticamente o método `main`       |
| `sout`      | Gera automaticamente `System.out.println()`|
| `Ctrl + /`  | Comenta/Descomenta linha                   |
| `Alt + Insert` | Gera código (Getters, Setters, etc.)    |
| `Shift + F10` | Executa o programa                        |
| `Shift + F9`  | Inicia a depuração (debug)                |

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA

---

## 📝 Como Usar Este Guia

1. Navegue pelo índice para encontrar o tópico de interesse
2. Estude a teoria nos arquivos markdown
3. Examine os exemplos de código nas classes Java
4. Pratique modificando os exemplos ou criando novos
5. Consulte a documentação oficial do Java para aprofundamento

---

## 🤝 Contribuições

Contribuições são bem-vindas! Se você encontrar erros ou quiser adicionar mais conteúdo educativo, sinta-se à vontade para abrir um Pull Request.

