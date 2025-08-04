# 🧩 Estruturas de Controle em Java

Esta seção aborda as estruturas de controle fundamentais em Java, que permitem controlar o fluxo de execução do programa.

## 📋 Conteúdo

### Estruturas Condicionais
- if/else
- switch/case
- Operador ternário

### Estruturas de Repetição
- for
- while
- do-while
- for-each

## 💻 Exemplos

### Estrutura Condicional if/else

```java
public class ExemploCondicional {
    public static void main(String[] args) {
        int idade = 18;
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
```

### Estrutura de Repetição for

```java
public class ExemploFor {
    public static void main(String[] args) {
        // Contagem de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }
    }
}
```

## 💡 Dicas

- Use estruturas condicionais para tomar decisões no código
- Escolha a estrutura de repetição adequada para cada situação
- Evite loops infinitos sempre verificando suas condições de parada
- Prefira o for-each para percorrer coleções quando não precisar do índice
- Mantenha o código dentro dos blocos condicionais e de repetição organizado e indentado