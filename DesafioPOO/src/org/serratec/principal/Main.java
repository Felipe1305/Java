package org.serratec.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.serratec.classes.Cliente;
import org.serratec.classes.Empresa;
import org.serratec.classes.Endereco;
import org.serratec.classes.Pedido;
import org.serratec.classes.Produto;
import org.serratec.enumeradores.Categoria;
import org.serratec.enumeradores.FormDePagamento;

public class Main {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Francisco Peixoto", "francisco@gmail.com", "(32)99656-9566", "107965858-85",
				new Endereco(88880234, "Manoel de Almeida Costa", "347", "Vila Reis", "Cataguases-MG", null, "Próximo ao Postinho de Saúde"));
		Cliente c2 = new Cliente("Emanuel Medeiros", "emanuel@gmail.com", "(21)3333-9566", "11234858-85",
				new Endereco(88870234, "Jucelino Qubixeque", "123", "Granjaria", "Cataguases-MG", null, null));
		Cliente c3 = new Cliente("Marcos Fontenelle", "marcos@gmail.com", "(11)99656-5555", "1065255858-85",
				new Endereco(355570234, "Alonso Rodrigues", "222", "Ime Farage", "Cataguases-MG", null, null));
		Cliente c4 = new Cliente("Hilton Custodio", "hilton@gmail.com", "(31)6666-9566", "999945858-85",
				new Endereco(36660234, "Beira Rio", "654", "Taquara Preta", "Cataguases-MG", null, null));
		Cliente c5 = new Cliente("Jair Messias", "jair@gmail.com", "(32)99656-55555", "025215858-85",
				new Endereco(65450234, "Francisco Horta", "258", "Ibrahim", "Cataguases-MG", null, null));
		Cliente c6 = new Cliente("Haroldo Fagundes", "haroldo@gmail.com", "(77)3232-9566", "65485858-85",
				new Endereco(34520234, "Sigismundo Ferreira", "951", "Vila Reis", "Cataguases-MG", null, null));
		Cliente c7 = new Cliente("Beatriz Rodrigues", "beatriz@gmail.com", "(32)99656-8596", "325655858-85",
				new Endereco(31230234, "Avenida Astolfo Dutra", "444", "Centro", "Cataguases-MG", null, null));
		Cliente c8 = new Cliente("Maria de Lourdes Almeida", "mariaL@gmail.com", "(66)2222-9566", "19636858-85",
				new Endereco(87470234, "Manoel de Almeida Costa", "696", "Vila Reis", "Cataguases-MG", null, null));
		Cliente c9 = new Cliente("Pedro Manoel Bandeira", "pedro@gmail.com", "(32)99656-1234", "1025115858-85",
				new Endereco(36890234, "Arquimedes Platao Aristoteles", "878", "Vila Reis", "Cataguases-MG", null,
						null));
		Cliente c10 = new Cliente("Murici Ramalho", "murici@gmail.com", "(99)55555-9566", "2221565858-85",
				new Endereco(545770234, "São Paulo Paulista", "474", "Carijós", "Cataguases-MG", null, null));

		Produto p1 = new Produto(100, "Notebook - H20VP", Categoria.NACIONAIS, 50, 1500.00, .05);
		Produto p2 = new Produto(159, "Galaxy   -   A20", Categoria.FRETEGRATIS, 50, 1200.0, 0);
		Produto p3 = new Produto(208, "Pen Drive  -  1T", Categoria.IMPORTADOS, 50, 200, 0);
		Produto p4 = new Produto(257, "Teclado Bluetoth", Categoria.NACIONAIS, 50, 100, 0);
		Produto p5 = new Produto(306, "Placa NVI GForce", Categoria.PROMOCAO, 500, 0, 0);
		Produto p6 = new Produto(355, "Mini  Drone  Spy", Categoria.FRETEGRATIS, 50, 10000, 0);
		Produto p7 = new Produto(404, "IA  -  doméstica", Categoria.IMPORTADOS, 50, 15000, 0);
		Produto p8 = new Produto(453, "Fone    Wireless", Categoria.NACIONAIS, 50, 80, 0);
		Produto p9 = new Produto(502, "Cao SBD robótico", Categoria.PROMOCAO, 50, 5500.50, 0);
		Produto p10 = new Produto(551,"Iphone 50S2021  ", Categoria.FRETEGRATIS, 50, 5000, 0);

		Empresa paradise = new Empresa("Paradise Tecnolgia",
				new Endereco(22565566, "Avenida Guido", "10", "Centro", "Muriaé", "Ao lado do Rio", null));

		Pedido ped1 = new Pedido(1, LocalDate.parse("2020-05-10"), c1, 35.25, 0.05, FormDePagamento.BOLETO,2);
		List<Produto> listProdutosPed1 = new ArrayList<>();
		listProdutosPed1.add(p1);
		listProdutosPed1.add(p3);
		listProdutosPed1.add(p6);
		listProdutosPed1.add(p10);
		ped1.setListProdutos(listProdutosPed1);
		ped1.calcularTotal(listProdutosPed1);

		Pedido ped2 = new Pedido(2, LocalDate.parse("2020-05-11"), c2, 45.25, 0.1, FormDePagamento.BOLETO,1);
		List<Produto> listProdutosPed2 = new ArrayList<>();
		listProdutosPed2.add(p2);
		listProdutosPed2.add(p4);
		listProdutosPed2.add(p7);
		listProdutosPed2.add(p9);
		ped2.setListProdutos(listProdutosPed2);
		ped2.calcularTotal(listProdutosPed2);
		
		Pedido ped3 = new Pedido(3, LocalDate.parse("2020-05-12"), c3, 12.25, 0.15, FormDePagamento.CARTAODEDÉBITO,1);
		List<Produto> listProdutosPed3 = new ArrayList<>();
		listProdutosPed3.add(p1);
		listProdutosPed3.add(p5);
		listProdutosPed3.add(p8);
		listProdutosPed3.add(p10);
		ped3.setListProdutos(listProdutosPed3);
		ped3.calcularTotal(listProdutosPed3);
		
		Pedido ped4 = new Pedido(4, LocalDate.parse("2020-05-10"), c4, 50.25, 0.05, FormDePagamento.PICPAY,1);
		List<Produto> listProdutosPed4 = new ArrayList<>();
		listProdutosPed4.add(p1);
		listProdutosPed4.add(p2);
		listProdutosPed4.add(p3);
		listProdutosPed4.add(p4);
		ped4.setListProdutos(listProdutosPed4);
		ped4.calcularTotal(listProdutosPed4);
		
		Pedido ped5 = new Pedido(5, LocalDate.parse("2020-05-11"), c5, 72.25, 0.14, FormDePagamento.PIX,1);
		List<Produto> listProdutosPed5 = new ArrayList<>();
		listProdutosPed5.add(p10);
		listProdutosPed5.add(p9);
		listProdutosPed5.add(p8);
		listProdutosPed5.add(p7);
		ped5.setListProdutos(listProdutosPed5);
		ped5.calcularTotal(listProdutosPed5);
		
		Pedido ped6 = new Pedido(6, LocalDate.parse("2020-05-12"), c6, 22.25, 0.04, FormDePagamento.BOLETO,1);
		List<Produto> listProdutosPed6 = new ArrayList<>();
		listProdutosPed6.add(p10);
		listProdutosPed6.add(p7);
		listProdutosPed6.add(p5);
		listProdutosPed6.add(p3);
		ped6.setListProdutos(listProdutosPed6);
		ped6.calcularTotal(listProdutosPed6);
		
		Pedido ped7 = new Pedido(7, LocalDate.parse("2020-05-10"), c7, 55.25, 0.05, FormDePagamento.CARTAODECREDITO,1);
		List<Produto> listProdutosPed7 = new ArrayList<>();
		listProdutosPed7.add(p8);
		listProdutosPed7.add(p1);
		listProdutosPed7.add(p5);
		listProdutosPed7.add(p4);
		ped7.setListProdutos(listProdutosPed7);
		ped7.calcularTotal(listProdutosPed7);
		
		Pedido ped8 = new Pedido(8, LocalDate.parse("2020-05-11"), c8, 36.25, 0.05, FormDePagamento.PICPAY,1);
		List<Produto> listProdutosPed8 = new ArrayList<>();
		listProdutosPed8.add(p10);
		listProdutosPed8.add(p7);
		listProdutosPed8.add(p5);
		listProdutosPed8.add(p3);
		ped8.setListProdutos(listProdutosPed8);
		ped8.calcularTotal(listProdutosPed8);
		
		Pedido ped9 = new Pedido(9, LocalDate.parse("2020-05-09"), c9, 5.25, 0.1, FormDePagamento.BOLETO,1);
		List<Produto> listProdutosPed9 = new ArrayList<>();
		listProdutosPed9.add(p9);
		listProdutosPed9.add(p7);
		listProdutosPed9.add(p4);
		listProdutosPed9.add(p3);
		ped9.setListProdutos(listProdutosPed9);
		ped9.calcularTotal(listProdutosPed9);
		
		Pedido ped10= new Pedido(10, LocalDate.parse("2020-05-01"), c10, 52.25, 0.1, FormDePagamento.CARTAODECREDITO,1);
		List<Produto> listProdutosPed10 = new ArrayList<>();
		listProdutosPed10.add(p6);
		listProdutosPed10.add(p5);
		listProdutosPed10.add(p2);
		listProdutosPed10.add(p1);
		ped10.setListProdutos(listProdutosPed10);
		ped10.calcularTotal(listProdutosPed10);
		
		List<Pedido> listaPedidos = new ArrayList<>();
		listaPedidos.add(ped1);
		listaPedidos.add(ped2);
		listaPedidos.add(ped3);
		listaPedidos.add(ped4);
		listaPedidos.add(ped5);
		listaPedidos.add(ped6);
		listaPedidos.add(ped7);
		listaPedidos.add(ped8);
		listaPedidos.add(ped9);
		listaPedidos.add(ped10);
		paradise.setListPedidos(listaPedidos);
		
		//Método que retorna o valor total faturado com base nos pedidos
		System.out.println("==Valor total faturado com base nos pedidos==");
		System.out.println(paradise.calcularValorFaturado());

		System.out.println("\n");
		
		//Retorno do valor faturado da empresa por perído. Período passado com parâmetro da função.
		System.out.println("==Valor Faturado por período inicial e final==");
		System.out.println("R$ "+paradise.calcularValorFaturadoData(LocalDate.parse("2020-05-10"), LocalDate.parse("2020-05-12")));
		
		System.out.println("\n");
		
		//Qual a forma de pagamento mais utilizada.
		System.out.println("==Método que retorna a forma de pagamento mais utilizada==");
		System.out.println(paradise.formaPagamentoMaisUtilizada());
		
		System.out.println("\n");
		
		//Método para retornar lucro por forma de pagamento.
		System.out.println("==Método que retorna o lucro por forma de pagamento==");
		System.out.println(""+FormDePagamento.BOLETO.getNome()+": R$"+paradise.lucroPorFormaPagamento(FormDePagamento.BOLETO));
		System.out.println(""+FormDePagamento.CARTAODECREDITO.getNome()+": R$"+paradise.lucroPorFormaPagamento(FormDePagamento.CARTAODECREDITO));
	
		
		System.out.println("\n");
		//Método Impressão de relatório passando como parâmetro um Cliente e um Pedido.
		paradise.imprimirRelatorio(c1, ped1);
	}
}
