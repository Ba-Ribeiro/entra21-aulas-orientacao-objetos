# Aprendendo sobre Classes e objetos

## Classes s�o formas que criam objetos
> As classes podem ser chamadas de 2 formas
> - static onde n�o precisa dar new para utilizar o (ponto) por�m somente itens static aparecem como op��o
> - objeto onde para acessar os atributos e metodos � necessario dar new para criar um objeto

## Encapsulamento
> Pode ser visto como uma burocracia no codigo, por�m facilita e muito a refatora��o com o minimo ou nenhum impacto para 
> quem j� consome os objetos dessa classe
> Exemplos:
> - alterar o nome de um atributo que esta sendo acessado diretamente fora da classe, requer que la fora seja ajustado tbm
> - mudar privilegios de altera��o ou leitura sem impactar em quem consome, basta alterar a implementa��o nos gets e sets