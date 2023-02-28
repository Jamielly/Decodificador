# Decodificador
Código brincadeira -  com o objetivo de decodificar frases secretas - com base na cifra de Hill e de César

##
 
<div align="center"> 
<h2>
O que é a cifra de Hill? 🤔
</h2>
</div>
<div align="justify">
<p>  É um método de criptografia de substituição polialfabética, que usa matrizes e operações matemáticas para cifrar e decifrar mensagens. Foi inventada pelo matemático Lester S. Hill em 1929. </p>
<p> Como é o funcionamento básico da cifra de Hill:

🔸Geração da matriz chave: A matriz chave é uma matriz quadrada invertível que é usada para cifrar e decifrar a mensagem. Ela é gerada escolhendo-se um número inteiro positivo "n" (o tamanho da matriz) e preenchendo-se a matriz com números inteiros módulo "26" (ou seja, números de 0 a 25). A matriz deve ser invertível para que a cifra seja segura.

🔸Conversão da mensagem em números: Cada letra da mensagem é convertida em um número inteiro módulo "26". Por exemplo, a letra "A" é convertida em 0, a letra "B" em 1, e assim por diante.

🔸Divisão da mensagem em blocos: A mensagem é dividida em blocos de tamanho "n", onde "n" é o tamanho da matriz chave. Cada bloco é então convertido em uma matriz linha, onde cada elemento é um número inteiro módulo "26".

🔸Cifragem da mensagem: Cada bloco da mensagem é cifrado multiplicando-se a matriz linha pelo a matriz chave. O resultado é uma nova matriz linha, que representa o bloco cifrado.

🔸Conversão dos blocos cifrados em letras: Cada bloco cifrado é convertido em letras, usando a correspondência entre números e letras estabelecida na etapa 2.

A decifragem da mensagem é feita de maneira semelhante, mas usando a matriz inversa da matriz chave para multiplicar as matrizes linhas dos blocos cifrados.

A cifra de Hill é considerada segura para mensagens de tamanho suficientemente grande, mas pode ser vulnerável a ataques de criptoanálise se a matriz chave não for escolhida adequadamente. Além disso, a cifra pode ser prejudicada se a mensagem contiver poucas letras ou se houver muita redundância na mensagem. </p> </div>
##
 
<div align="center"> 
<h2>
O que é a cifra de César? 🤔
</h2>
</div>

<p> A cifra de César é um método simples de criptografia de substituição, que foi criado pelo imperador romano Júlio César para proteger mensagens militares confidenciais. A ideia básica da cifra de César é deslocar cada letra do alfabeto um certo número de posições para a direita ou esquerda.

<p> Como funciona cifra de César: </p>
<div align="justify">
Por exemplo, se a letra original for "A" e o deslocamento for de três posições para a direita, a letra criptografada seria "D". Da mesma forma, se a letra original for "Z" e o deslocamento for de duas posições para a esquerda, a letra criptografada seria "X". O deslocamento é chamado de "chave" da cifra de César.

Para criptografar uma mensagem usando a cifra de César, basta deslocar cada letra da mensagem pelo número de posições determinado pela chave. Por exemplo, se a chave for 3, a letra "A" seria substituída pela letra "D", a letra "B" seria substituída pela letra "E", e assim por diante.

A decodificação da mensagem criptografada é feita de maneira inversa, ou seja, deslocando cada letra pelo número de posições determinado pela chave, mas no sentido oposto. Se a chave for 3, a letra "D" seria substituída pela letra "A", a letra "E" seria substituída pela letra "B", e assim por diante.

A cifra de César é considerada um método muito simples e fácil de ser quebrado por criptoanalistas experientes, pois existem apenas 26 possíveis deslocamentos (para cada letra do alfabeto) e é fácil testar todas as combinações possíveis. No entanto, é um método interessante e útil para ilustrar os princípios básicos da criptografia. </p> </div>

##

 <p>Feito com :heart: e 🤓</p>
