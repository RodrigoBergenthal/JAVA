
---

## 📘 Para Saber Mais: Casting — Repositório de Classes.Estudos

Nesta atividade, exploramos um recurso essencial em Java: o **casting**, que permite converter um tipo de dado em outro. Essa conversão pode acontecer de forma automática (implícita) ou ser definida manualmente (explícita), possibilitando maior controle na manipulação de dados.

---

## 🚀 Tipos de Casting

| Tipo de Casting   | Descrição                                                                 |
|-------------------|---------------------------------------------------------------------------|
| ✅ Implícito       | Realizado automaticamente quando o tipo destino é **mais abrangente**     |
| ✅ Explícito       | Requer o uso do **operador de casting** para converter tipos incompatíveis |

---

## 🧠 Exemplos de Código

### 🔹 Casting Implícito

```java
int inteiro = 10;
double decimal = inteiro; // Conversão automática de int para double

System.out.println(decimal); // Saída: 10.0
```

---

### 🔸 Casting Explícito

```java
double preco = 19.99;
int precoInteiro = (int) preco; // Converte double para int manualmente

System.out.println(precoInteiro); // Saída: 19
```

⚠️ Nesse caso, o valor decimal é **descartado** — não há arredondamento.

---

### 🔄 Mais Exemplos de Conversão

```java
long populacao = 7_000_000_000L;
int estimativa = (int) populacao; // Pode gerar perda de dados!

float temperatura = 36.7f;
int tempInteira = (int) temperatura;

System.out.println("Estimativa truncada: " + estimativa);
System.out.println("Temperatura sem casas decimais: " + tempInteira);
```

---

## 📊 Guia de Conversão entre Tipos Primitivos

| De → Para     | int → long | int → double | double → int | char → int | byte → short |
|---------------|------------|--------------|--------------|------------|--------------|
| Conversão     | Implícita  | Implícita    | **Explícita**| Implícita  | Implícita    |

> 💡 Regras gerais: **converter para tipos maiores** costuma ser seguro e automático. Já converter para tipos menores ou de natureza diferente exige **casting explícito**.

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA

---
