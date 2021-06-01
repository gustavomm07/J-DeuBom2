programa
{
	
	funcao inicio()
	{
		inteiro num, soma=0,contador=0, media

		escreva("digite um número: ")
		leia(num)
		
		enquanto(num>=0)
		{
				soma=soma+num
				contador++
				escreva("entre com um valor")
				leia (num)
		}
		media = soma / contador

		escreva("\nsomatório dos valores: ",soma)
		escreva("\nQuantidade de valores: ", contador)
		escreva("\nMédia dos valores: ",media)
	
	se(contador==0)
	{
		escreva("\nNão é possível fazer divisão por zero")
	}
	senao
{
	media = soma / contador

			escreva("\nSomatória dos valores: ", soma)
			escreva("\nQuantidade de valores: ", contador)
			escreva("\nMédia dos valores: ", media)	
		}
	
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */