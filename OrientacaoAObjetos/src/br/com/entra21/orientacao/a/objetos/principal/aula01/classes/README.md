# Aprendendo sobre Classes e objetos

## Classes são formas que criam objetos
> As classes podem ser chamadas de 2 formas
> - static onde não precisa dar new para utilizar o (ponto) porém somente itens static aparecem como opção
> - objeto onde para acessar os atributos e metodos é necessario dar new para criar um objeto

## Encapsulamento
> Pode ser visto como uma burocracia no codigo, porém facilita e muito a refatoração com o minimo ou nenhum impacto para 
> quem já consome os objetos dessa classe
> Exemplos:
> - alterar o nome de um atributo que esta sendo acessado diretamente fora da classe, requer que la fora seja ajustado tbm
> - mudar privilegios de alteração ou leitura sem impactar em quem consome, basta alterar a implementação nos gets e sets