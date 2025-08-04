# 🔰 Fundamentos da Linguagem Java

Esta seção contém os conceitos fundamentais da linguagem Java que todo programador deve dominar.

## 📋 Conteúdo

### Sintaxe Básica
- [Tipos Primitivos](../../Tipos%20Primitivos.md)
- [Operadores](../../Operadores.md)
- [Strings e Text Blocks](../../Strings%20e%20Text%20Blocks.md)
- [Formatação de Textos](../../Formatação%20de%20Textos)
- [Casting](../../Casting.md)
- [Comentários no Código](../../Comentários%20no%20Código%20Fonte.md)

### Exemplos Práticos

#### Hello World
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```

#### Operações Matemáticas
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

## 💡 Dicas

- Sempre inicie o nome de classes com letra maiúscula
- Métodos e variáveis começam com letra minúscula
- Use nomes descritivos para suas variáveis e métodos
- Indente seu código corretamente para melhor legibilidade
- Adicione comentários para explicar partes complexas do código