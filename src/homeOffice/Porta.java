/**
 * Classe Porta - Solução para o Desafio Fullstack
 * Esta classe implementa uma porta com atributos e métodos para manipulá-la
 * Versão 2.0 - Implementação melhorada
 */
public class Porta {
    // Atributos
    private String cor;
    private String material;
    private boolean aberta;
    private double altura;
    private double largura;
    
    // Construtor
    public Porta(String cor, String material, double altura, double largura) {
        this.cor = cor;
        this.material = material;
        this.aberta = false; // Por padrão, a porta começa fechada
        this.altura = altura;
        this.largura = largura;
    }
    
    // Construtor alternativo
    public Porta(String cor, String material) {
        this(cor, material, 2.10, 0.80); // Valores padrão para altura e largura em metros
    }
    
    // Métodos
    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }
    
    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }
    
    public void exibirStatus() {
        System.out.println("Porta de " + material + " na cor " + cor);
        System.out.println("Dimensões: " + altura + "m x " + largura + "m");
        System.out.println("Status: " + (aberta ? "Aberta" : "Fechada"));
    }
    
    // Getters e Setters
    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public boolean isAberta() {
        return aberta;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getLargura() {
        return largura;
    }
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando portas com diferentes construtores
        Porta portaDaSala = new Porta("Branca", "Madeira");
        Porta portaDoQuarto = new Porta("Marrom", "Madeira maciça", 2.20, 0.90);
        
        // Exibindo o status inicial das portas
        System.out.println("=== Porta da Sala ===");
        portaDaSala.exibirStatus();
        
        System.out.println("\n=== Porta do Quarto ===");
        portaDoQuarto.exibirStatus();
        
        // Abrindo a porta da sala
        portaDaSala.abrir();
        
        // Tentando abrir novamente
        portaDaSala.abrir();
        
        // Exibindo o status atual
        System.out.println("\n=== Status Atualizado - Porta da Sala ===");
        portaDaSala.exibirStatus();
        
        // Fechando a porta
        portaDaSala.fechar();
        
        // Exibindo o status final
        System.out.println("\n=== Status Final - Porta da Sala ===");
        portaDaSala.exibirStatus();
    }
}