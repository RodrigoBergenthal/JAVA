
## 📘 Para Saber Mais: Operadores — Repositório de Classes.Estudos

Este repositório complementa os estudos da primeira aula, aprofundando o tema *operadores em Java*. Aqui você encontrará anotações e exemplos práticos de como utilizar diferentes tipos de operadores para manipular dados em aplicações Java.

---

## 🚀 Tipos de Operadores Abordados

- ✅ Operadores de Atribuição (`=`, `+=`, `-=`, etc.)
- ✅ Operadores Aritméticos (`+`, `-`, `*`, `/`, `%`)
- ✅ Operadores Relacionais (`==`, `!=`, `>`, `<`, `>=`, `<=`)
- ✅ Operadores Lógicos (`&&`, `||`, `!`)
- ✅ Operadores de Incremento (`++`, `--`)

---

## 🧠 Exemplos de Código

### Atribuição Simples e Combinada

```java
int valor = 5;        // Atribuição simples
valor += 10;          // valor agora é 15
valor *= 2;           // valor agora é 30
System.out.println(valor);
```

---

### Operadores Aritméticos

```java
int a = 10 + 5;
int b = 10 - 5;
int c = 10 * 5;
int d = 10 / 5;
int e = 10 % 3;

System.out.println("Soma: " + a);
System.out.println("Subtração: " + b);
System.out.println("Multiplicação: " + c);
System.out.println("Divisão: " + d);
System.out.println("Resto: " + e);
```

---

### Operadores Relacionais

```java
int x = 10;
int y = 5;

System.out.println("x == y? " + (x == y));
System.out.println("x > y? " + (x > y));
System.out.println("x <= y? " + (x <= y));
```

---

### Operadores Lógicos

```java
boolean a = true;
boolean b = false;

System.out.println("a && b: " + (a && b));
System.out.println("a || b: " + (a || b));
System.out.println("!a: " + (!a));
```

---

### Pré-incremento vs Pós-incremento

```java
int num = 5;
System.out.println("Pré-incremento: " + ++num); // 6
num = 5;
System.out.println("Pós-incremento: " + num++); // 5, depois vira 6
System.out.println("Valor final: " + num);      // 6
```

---

## ⚡ Dica de Prática

Tente combinar operadores diferentes em expressões mais complexas e observe os resultados, como:

```java
int resultado = (10 + 5) * 2 - 4 / 2;
System.out.println("Resultado da expressão: " + resultado);
```

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA
