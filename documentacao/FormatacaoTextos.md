
## 📘 Para Saber Mais: Formatação de Textos — Repositório de Classes.Estudos

Esta atividade explora as formas mais comuns de **formatar textos e números em Java**, utilizando tanto o método `String.format()` quanto o `formatted()` aplicado em **Text Blocks**. A formatação é essencial para tornar a saída de dados mais amigável e legível para o usuário.

---

## 🚀 Recursos Abordados

- ✅ Placeholder `%s`, `%d`, `%f` para inserção de dados
- ✅ Arredondamento de números decimais
- ✅ Formatação com `String.format()`
- ✅ Text Blocks com `.formatted()`
- ✅ Clareza na impressão de variáveis para o usuário

---

## 🧠 Exemplos de Código

### 🔹 Usando String.format()

```java
String nome = "Maria";
int idade = 30;
double valor = 55.9999;

System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
```

🖨 Saída:
```
Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais
```

---

### 🔸 Usando Text Block com formatted()

```java
String nome = "João";
int aulas = 4;

String mensagem = """
    Olá, %s!
    Boas vindas ao curso de Java.
    Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
    """.formatted(nome, aulas);

System.out.println(mensagem);
```

🖨 Saída:
```
Olá, João!
Boas vindas ao curso de Java.
Teremos 4 aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
```

---

## ⚡ Dicas de Formatação

- Use `%.2f` para limitar números decimais a 2 casas.
- Combine texto com variáveis usando placeholders (`%s`, `%d`, `%f`).
- Prefira `formatted()` quando trabalhar com **Text Blocks**, pois melhora a legibilidade.
- Evite concatenar muitas Strings — usar formatos é mais elegante e eficiente!

---

## 🛠 Tecnologias Utilizadas

- Java JDK 17+
- IntelliJ IDEA

---

