
---

## 🔁 A palavra-chave `this` em Java

Em Java, **`this`** é usado para fazer referência ao **objeto atual da classe**, especialmente quando há ambiguidade entre atributos e parâmetros em métodos.

### 🇧🇷 Tradução literal
> "`this`" significa “isto/este/esta” — usado para indicar o próprio objeto em execução.

---

## 🎓 Quando usar `this`?

A necessidade de `this` geralmente surge quando um **parâmetro de método tem o mesmo nome de um atributo** da classe.

---

## 🧪 Exemplo sem ambiguidade

```java
public class Conta { 
    private double saldo;
    private int numero;

    public void deposita(double valor) {
        saldo = saldo + valor;
    }
}
```

🔍 Nesse exemplo:
- O atributo `saldo` não entra em conflito com o parâmetro `valor`
- Não há necessidade de usar `this`

---

## ⚠️ Exemplo com ambiguidade

```java
public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
        ligada = ligada;
    }
}
```

❌ Neste caso:
- O atributo `ligada` entra em conflito com o parâmetro `ligada`
- O comando `ligada = ligada` se refere **apenas ao parâmetro**, ignorando o atributo

---

## ✅ Usando `this` para resolver

```java
public class Lampada {
    private boolean ligada;
    private String modelo;

    public void acendeLampada(boolean ligada) {
        this.ligada = ligada;
    }
}
```

✅ Agora:
- `this.ligada` faz referência ao **atributo da classe**
- `ligada` (sem `this`) é o **parâmetro do método**

---

## 💡 Conclusão

- `this` se refere ao **objeto atual**
- Evita **confusões** entre atributos e parâmetros
- Também é usado em outras linguagens orientadas a objetos, como C#, JavaScript e Kotlin

---
