/**
 * Classe Porta - Solução para o Desafio Fullstack
 * Esta classe implementa uma porta com atributos e métodos para manipulá-la
 */
public class Porta {
    // Atributos
    private String cor;
    private String material;
    private boolean aberta;
    
    // Construtor
    public Porta(String cor, String material) {
        this.cor = cor;
        this.material = material;
        this.aberta = false; // Por padrão, a porta começa fechada
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
    
    // Método main para testar a classe
    public static void main(String[] args) {
        // Criando uma porta
        Porta portaDaSala = new Porta("Branca", "Madeira");
        
        // Exibindo o status inicial
        portaDaSala.exibirStatus();
        
        // Abrindo a porta
        portaDaSala.abrir();
        
        // Tentando abrir novamente
        portaDaSala.abrir();
        
        // Exibindo o status atual
        portaDaSala.exibirStatus();
        
        // Fechando a porta
        portaDaSala.fechar();
        
        // Exibindo o status final
        portaDaSala.exibirStatus();
    }
}