# Java
Exercícios em Java

Desafio lançado pelo professor Weberson no curso de Desenvolvedor Full-Stack.

Problema:
O professor está se aventurando em novas descobertas, com isso ele pegou todas as suas
economias. Com o valor obtido de suas economias, ele deseja abrir
uma loja virtual para vender produtos eletrônicos.
Ele está precisando de um sistema para controlar seu negócio, como o processo de
desenvolvimento está bem no início, ele precisa que a estrutura do backend seja montada
para criação de uma loja virtual.

Ele está precisando de um sistema para controlar seu negócio, como o processo de
desenvolvimento está bem no início, ele precisa que a estrutura do backend seja montada
para criação de uma loja virtual.
Neste negócio teremos de início (MVP) as seguintes informações:
● Endereco: (cep, rua, numero, bairro, cidade, complemento, referencia )
● Cliente: (nome, email, celular, cpfOuCnpj, Endereco)
● Categoria: (Nacionais, Importados, Promocao, FreteGratis)
● FormaDePagamento (Cartão de Crédito, Cartão de débito, Pix, Boleto, PicPay)
● Produto: (codigo, descricao, Categoria, quantidade, valor, desconto)
● Pedido: (numero, data, lista de produtos, cliente, valorFrete, desconto, forma
DePagamento, valorTotal)
● Empresa:(nome, Endereco, lista de pedidos)

Objetivos:
1. A empresa deve ter um método que retorne o valor total faturado com base nos
pedidos.
2. A empresa deve ter um método que retorne o valor faturado por período, inicial e
final. Exemplo: Quero saber quanto que eu lucrei do dia 10/05/2021 até 12/05/2021
3. Qual foi a forma de pagamento mais utilizada nos pedidos.
4. Retornar o valor de lucro separado por forma de pagamento, exemplo:
Pix: R$1000.00 
Boleto R$ 500.00
5. A empresa deve ter uma método que imprima o relatório das vendas
