package entities;

public class Rooms {
private String nome;
private int quarto;
private double preco;

public Rooms(String nome, int quarto, double preco) {
	this.nome = nome;
	this.quarto = quarto;
	this.preco = preco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome  = nome;
}

public int getQuarto() {
	return quarto;
}

public void setQuarto(int quarto) {
	this.quarto = quarto;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

}
