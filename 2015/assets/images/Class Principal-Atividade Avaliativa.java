import java.util.Random;
public class Principal {
private int Principal;
private int Nome;
private int PrecodeCompra;
private int TotlInvertido;

	private Principal() {

}
public int getNome()
    {
        return String;
    }
public int getPrecodeCompra()
    {
        return double;
    }	
 public int getCategoria()
    {
        return Categoria;
    }  
public int getTotalInvertido()
    {
        return double;
    }
    public static void main(String[] args) {
		Categoria microsoft = new Categoria("Microsoft");
		Categoria apple = new Categoria("Apple");
		
		Produto trackpad = new Produto("Magic Track Pad 2", 1, 999.00, apple);
		Produto magicMouse = new Produto("Magic mouse 2", 2, 649.00, apple);
		Produto magicKeyboard = new Produto("Magic Keyboard (EUA)", 3, 749.00, apple);
		
		Produto mouse = new Produto("Mouse Wireless Microsoft 3500", 1, 139.99, microsoft);
		Produto teclado = new Produto("Teclado Microsoft All in One Media Wireless", 2, 171.90, microsoft);
		Produto kit = new Produto("Mouse e Teclado Microsoft 2LF-00023 Wireless", 3, 146.16, microsoft);
		
		Estoque estoque = new Estoque();
		
		estoque.adicionaProduto(trackpad);
		estoque.adicionaProduto(magicMouse);
		estoque.adicionaProduto(magicKeyboard);
		estoque.adicionaProduto(mouse);
		estoque.adicionaProduto(teclado);
		estoque.adicionaProduto(kit);
		
		System.out.println("##### Teste do Sistema de Estoque #### \n");
		
		System.out.print("A quantidade de produtos no estoque é: ");
		System.out.println(estoque.getQuantidade()); // 6
		
		System.out.print("\nO total investido no estoque é: ");
		System.out.println(estoque.getInvestimento()); // 5466.27
	
		System.out.println("\nProdutos da categoria Apple: ");
		for (Produto produto : estoque.getProdutosDaCategoria("Apple")) {
			System.out.println("\t" + produto);
		}
		
		System.out.println("\nProdutos da categoria Microsoft: ");
		for (Produto produto : estoque.getProdutosDaCategoria("Microsoft")) {
			System.out.println("\t" + produto);
		}
	}
}