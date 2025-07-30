
---

## 📦 Pacotes em Java

Em **Java**, os **pacotes** são usados para **agrupar classes relacionadas a uma mesma funcionalidade**. Eles ajudam a:

- Organizar melhor o código-fonte
- Facilitar o gerenciamento do projeto
- Evitar que muitas classes fiquem misturadas num único diretório

---

## 🧭 Organização com Subpacotes

A estrutura dos pacotes pode incluir:

- **Classes diretamente** no pacote principal
- **Subpacotes**, quando o projeto se torna mais complexo

Isso permite uma organização hierárquica e modular do código.

---

## 📛 Convenção de Nomeação

É essencial seguir a convenção de nomeação para garantir clareza e exclusividade. Um dos padrões utilizados é o **nome de domínio reverso** da empresa ou organização.

### 💡 Exemplo de Estrutura de Pacote

Imagine que a empresa se chama `minhaempresa.com.br` e o projeto se chama `meuprojeto`, então o nome do pacote seria:

```
br.com.minhaempresa.meuprojeto
```

Dentro desse pacote, é possível ter subpacotes como:

```
br.com.minhaempresa.meuprojeto.model
br.com.minhaempresa.meuprojeto.controller
br.com.minhaempresa.meuprojeto.service
```

---

## ✅ Benefícios do Domínio Reverso

- Garante um **nome único** para o pacote
- Evita **conflitos de nomes** com outros projetos
- Ajuda a **identificar claramente o proprietário** do projeto Java
- Facilita o rastreamento e a manutenção de grandes aplicações

---
