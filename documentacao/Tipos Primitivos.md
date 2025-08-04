
## 📘 Para Saber Mais: Tipos Primitivos — Repositório de Classes.Estudos

Este repositório complementa os fundamentos do Java, abordando os **tipos primitivos**, que são a base para lidar com dados simples na linguagem. Aqui você vai encontrar explicações e exemplos práticos de uso para cada tipo primitivo em Java.

---

## 🚀 Tipos Primitivos em Java

Java possui **8 tipos primitivos**, cada um com finalidade específica:

| Tipo     | Tamanho | Faixa de Valores                        | Uso Principal                          |
|----------|---------|-----------------------------------------|----------------------------------------|
| `boolean`| 1 bit   | `true` ou `false`                      | Controle de fluxo e lógica booleana    |
| `byte`   | 8 bits  | -128 a 127                              | Valores inteiros pequenos              |
| `char`   | 16 bits | 0 a 65.535 (caractere Unicode)         | Armazenamento de letras e símbolos     |
| `short`  | 16 bits | -32.768 a 32.767                        | Inteiros menores, mais economia de memória |
| `int`    | 32 bits | -2.147.483.648 a 2.147.483.647         | Tipo inteiro padrão                    |
| `long`   | 64 bits | ±9.22×10¹⁸                             | Números inteiros muito grandes         |
| `float`  | 32 bits | ±3.4×10³⁸ (7 dígitos de precisão)      | Números decimais simples               |
| `double` | 64 bits | ±1.7×10³⁰⁸ (15 dígitos de precisão)     | Números decimais com maior precisão    |

---

## 🧠 Exemplos de Código

```java
public class TiposPrimitivos {
    public static void main(String[] args) {
        boolean ativo = true;
        byte idade = 25;
        char letra = 'J';
        short ano = 2024;
        int quantidade = 1500;
        long populacao = 21474836470L;
        float temperatura = 36.5f;
        double saldo = 12345.67;

        System.out.println("Boolean: " + ativo);
        System.out.println("Byte: " + idade);
        System.out.println("Char: " + letra);
        System.out.println("Short: " + ano);
        System.out.println("Int: " + quantidade);
        System.out.println("Long: " + populacao);
        System.out.println("Float: " + temperatura);
        System.out.println("Double: " + saldo);
    }
}
```

---

## ⚡ Dica Extra

- Use `float` com o sufixo `f` e `long` com `L` para evitar erros de compilação.
- Tipos primitivos não são objetos — por isso são mais rápidos e leves.
- O uso correto desses tipos evita consumo desnecessário de memória.

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA
