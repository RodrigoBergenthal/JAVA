# 📚 Guia de Estudos Java

Bem-vindo ao Guia de Estudos Java! Este repositório foi organizado para servir como uma referência completa para aprendizado da linguagem Java, desde conceitos básicos até tópicos avançados.

## 📋 Índice

### 🔰 Fundamentos da Linguagem
- [Olá Mundo e Primeiros Passos](#primeiros-passos)
- [Tipos Primitivos](./documentação/TiposPrimitivos.md)
- [Operadores](./documentação/Operadores.md)
- [Strings e Text Blocks](./documentação/StringsTextBlocks.md)
- [Formatação de Textos](./documentação/FormatacaoTextos.md)
- [Casting](./documentação/Casting.md)
- [Comentários no Código](./documentação/ComentariosCodigo.md)



### 🧩 Estruturas de Controle
- [Condicionais](./guia-de-estudos/condicionais/README.md)
- [Loops e Iterações](#loops-e-iterações)

### 📦 Orientação a Objetos
- [Classes e Objetos](./guia-de-estudos/orientacaoobjetos/ClassesObjetos.md)
- [Modificadores de Acesso](./guia-de-estudos/orientacaoobjetos/Modificadores.md)
- [Palavra-chave 'this'](./guia-de-estudos/orientacaoobjetos/This.md)
- [Convenções de Nomenclatura](./guia-de-estudos/orientacaoobjetos/PadraoNomes.md)
- [Documentação JavaDoc](./guia-de-estudos/orientacaoobjetos/DocumentacaoJava.md)

### 🎮 Projetos Práticos
- [Jogo de Adivinhação](./guia-de-estudos/game/Adivinha.java)
- [Quiz](./guia-de-estudos/game/Quiz.java) - [Documentação](./guia-de-estudos/game/Quiz.md)

### 🏠 Desafios Home Office
- [Desafios Gerais](./guia-de-estudos/homeoffice/Desafio.md)
- [Desafios Fullstack](./guia-de-estudos/homeoffice/DesafioFullstack.md)
- [Guia de Desafios](./guia-de-estudos/homeoffice/README.md)

### 🚩 Outros Desafios
- [Desafio: Hora da Prática](./desafio/Desafio_ hora da prática.md)
- [Estudos de Desafio](./desafio/estudos.md)

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

| Atalho         | Descrição                                    |
|----------------|----------------------------------------------|
| `psvm`         | Gera automaticamente o método `main`         |
| `sout`         | Gera automaticamente `System.out.println()`  |
| `Ctrl + /`     | Comenta/Descomenta linha                     |
| `Alt + Insert` | Gera código (Getters, Setters, etc.)         |
| `Shift + F10`  | Executa o programa                           |
| `Shift + F9`   | Inicia a depuração (debug)                   |

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA

---

## 📝 Como Usar Este Guia

1. Navegue pelo índice para encontrar o tópico de interesse
2. Estude a teoria nos arquivos markdown em `documentação/`
3. Examine os exemplos de código nas classes Java em `guia-de-estudos/`
4. Pratique modificando os exemplos ou criando novos
5. Consulte a documentação oficial do Java para aprofundamento

---

## 🤝 Contribuições

Contribuições são bem-vindas! Se você encontrar erros ou quiser adicionar mais conteúdo educativo, sinta-se à vontade para abrir um Pull Request.

# Estrutura do Projeto

```
JAVA-main/
│   README.md 
│   LICENSE 
│   .gitignore 
│
├── documentacao/ 
│   └── (arquivos .md de teoria) 
│
├── guia-de-estudos/ 
│   ├── fundamentos/ 
│   ├── condicionais/ 
│   ├── orientacao-objetos/ 
│   └── homeOffice/
│
├── desafio/ 
│   └── (desafios gerais) 
│
├── projetos/
│   └── game/ 
│
└── testes/ 
    └── (exemplos de testes unitários)
```