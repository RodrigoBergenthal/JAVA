# 📦 Orientação a Objetos em Java

Esta seção aborda os conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, um dos paradigmas mais importantes da linguagem.

## 📋 Conteúdo

### Conceitos Fundamentais
- [Classes e Objetos](./ClassesObjetos.md)
- [Modificadores de Acesso](./Modificadores.md)
- [Palavra-chave 'this'](./This.md)

### Boas Práticas
- [Convenções de Nomenclatura](./PadraoNomes.md)
- [Documentação JavaDoc](./DocumentaçãoJava.md)

## 💻 Exemplo de Classe

```java
public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    
    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

## 💡 Conceitos Importantes

- **Encapsulamento**: Ocultar detalhes de implementação e expor apenas o necessário
- **Herança**: Criar novas classes a partir de classes existentes
- **Polimorfismo**: Capacidade de um objeto se comportar de diferentes formas
- **Abstração**: Representar conceitos complexos de forma simplificada

## 📚 Recursos Adicionais

- [Documentação Oficial Java](https://docs.oracle.com/en/java/)
- [Tutorial de POO da Oracle](https://docs.oracle.com/javase/tutorial/java/concepts/)