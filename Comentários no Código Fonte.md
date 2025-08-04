
## 📘 Para Saber Mais: Comentários no Código Fonte — Repositório de Classes.Estudos

Este repositório faz parte da jornada de aprendizagem de Java e foca no uso de **comentários**, que são essenciais para escrever códigos mais compreensíveis e colaborativos. Embora não afetem diretamente a execução, comentários são valiosos para explicar decisões e facilitar manutenção do software.

---

## 🚀 Tipos de Comentários em Java

- ✅ Comentário de linha única (`//`)
- ✅ Comentário de múltiplas linhas (`/* ... */`)
- ✅ Comentários explicativos e autoexplicativos

---

## 🧠 Exemplos de Código

### Comentário de Linha Única

```java
public class ComentarioSimples {
    public static void main(String[] args) {
        // Exibe uma mensagem no console
        System.out.println("Olá, mundo!");
    }
}
```

---

### Comentário de Múltiplas Linhas

```java
public class ComentarioMultiplo {
    public static void main(String[] args) {
        /*
         Este bloco de comentário descreve
         a lógica da aplicação principal.
         */
        System.out.println("Teste de comentário em bloco");
    }
}
```

---

### Comentários Autoexplicativos (via nomes claros)

```java
public class SaqueEmConta {
    public void realizarSaque(double valorSaque, double saldoAtual) {
        // Verifica se há saldo suficiente antes de sacar
        if (valorSaque <= saldoAtual) {
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
```

> 💡 Em códigos bem escritos, o nome das variáveis e métodos já ajuda a entender o que está acontecendo — reduzindo a necessidade de comentários excessivos.

---

## ⚡ Boas Práticas

- Evite comentários redundantes (ex: `// soma dois números` dentro de um método chamado `somar`)
- Prefira nomes intuitivos para métodos e variáveis
- Use comentários para explicar *por que* algo foi feito — não apenas *o que* foi feito
- Atualize os comentários conforme o código muda

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA
