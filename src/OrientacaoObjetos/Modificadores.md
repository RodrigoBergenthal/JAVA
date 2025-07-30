
---

## 🔐 Modificadores de Acesso em Java

Os **modificadores de acesso** são palavras-chave que definem o **nível de visibilidade** de classes, atributos e métodos. Eles são essenciais para garantir:

- 🔒 **Segurança**
- 📦 **Encapsulamento**

### 🔸 Tipos de Modificadores

| Modificador | Visibilidade                                          | Acesso fora do pacote? | Restrição                    |
|-------------|--------------------------------------------------------|-------------------------|------------------------------|
| `public`    | Total                                                 | ✅ Sim                  | Nenhuma                      |
| `default`   | Apenas no mesmo pacote                                | ❌ Não                  | Fora do pacote               |
| `private`   | Apenas dentro da própria classe                       | ❌ Não                  | Fora da própria classe       |
| `protected` | Dentro do pacote e subclasses (veremos mais adiante) | ✅ Parcial              | Requer herança ou mesmo pacote |

---

## 🌍 `public`: Visibilidade total

Permite acesso por qualquer classe de qualquer pacote.

### 💡 Exemplo

```java
public class Conta {
    public double saldo;

    public void sacar(double valor) {
        // lógica de saque...
    }
}
```

```java
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);
    }
}
```

---

## 📦 `default`: Acesso no mesmo pacote

Ocorre quando **nenhum modificador** é especificado. Visível apenas dentro do mesmo pacote.

### 💡 Exemplo

Pacote: `br.com.alura.conta`

```java
public class Conta {
    double saldo;

    void sacar(double valor) {
        // lógica de saque...
    }
}
```

Pacote: `br.com.alura.testes`

```java
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;       // ❌ Erro de compilação
        c1.sacar(100);        // ❌ Erro de compilação
    }
}
```

➡️ Apesar de a classe `Conta` ser `public`, seus membros não são visíveis fora do pacote.

---

## 🚫 `private`: Totalmente restrito

Só pode ser acessado **dentro da própria classe**.

### 💡 Exemplo

```java
public class Conta {
    private double saldo;

    private void sacar(double valor) {
        // lógica de saque...
    }
}
```

```java
public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.saldo = 300;       // ❌ Erro de compilação
        c1.sacar(100);        // ❌ Erro de compilação
    }
}
```

➡️ `saldo` e `sacar()` são privados e não podem ser acessados fora da classe `Conta`.

---

## 🧬 `protected`: Visibilidade em herança

Esse modificador será apresentado **mais adiante**, quando o tema **herança** for explorado. Ele permite acesso a:

- Classes do mesmo pacote
- Subclasses (mesmo em outros pacotes)

---
