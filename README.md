# PokemonGame_

Pokemon: apanhá-los todos
O Ash está a apanhar pokémons num mundo que consiste numa grelha bidimensional infinita de casas. Em cada casa há exatamente um pokémon.

O Ash começa por apanhar o pokémon que está na casa onde começa. A seguir, move-se para a casa imediatamente a norte, sul, este ou oeste de onde se encontra e apanha o pokémon que aí se encontrar, e assim sucessivamente. Atenção: se ele passar numa casa onde já passou (e, portanto, onde já apanhou um pokémon), já lá não está um pokémon para ele apanhar!

O que queremos saber é: começando com um mundo cheio de pokémons (um em cada casa!), quantos pokémons o Ash apanha para uma dada sequência de movimentos?

Formato do input
O programa deve ler uma linha do stdin, que contém uma sequência de movimentos. Cada movimento é descrito por uma letra N, S, Eou O(respetivamente: norte, sul, este, oeste).

Exemplo #	Input	      Output
1	        E	          2
2	        NESO	      4
3	        NSNSNSNSNS	2
