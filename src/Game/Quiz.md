

# 🎮 Jogo de Quiz em Java

## ✨ Propósito do Projeto

Treino java nivel : Easy

---

## 🚀 Funcionalidades

- Jogo interativo em linha de comando.
- Perguntas e respostas armazenadas em arrays.
- Contagem de pontos com feedback instantâneo.
- Comparação de respostas ignorando maiúsculas/minúsculas.

---

## 🧠 Como Funciona

### 1. **Importação de bibliotecas**
Usamos `Scanner` para receber dados do usuário:

```java
import java.util.Scanner;
```

---

### 2. **Criação de perguntas e respostas**
O jogo possui arrays com perguntas e suas respectivas respostas corretas:

```java
String[] perguntas = { ... };
String[] respostas = { ... };
```

---

### 3. **Lógica de interação**
Um laço `for` percorre todas as perguntas. O usuário responde, e o sistema verifica se a resposta está correta:

```java
for (int i = 0; i < perguntas.length; i++) {
    // exibe pergunta e lê resposta
}
```

---

### 4. **Verificação da resposta**
Comparamos a entrada do usuário ignorando maiúsculas e minúsculas:

```java
if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
    pontos++;
}
```

---

### 5. **Placar final**
Ao final do quiz, o jogo exibe quantas perguntas o jogador acertou:

```java
System.out.println("🏆 Você acertou " + pontos + " de " + perguntas.length + " perguntas.");
```

---

## 👨‍🏫 Sobre

Este projeto foi criado por Rodrigo bergenthal para finalidade de estudos do Projeto Skillo e Full Stack Social. 💡

---
