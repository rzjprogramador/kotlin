# Kotlin

### declaracoes
> funcao_De_Unica_Linha
```fun soma (x: Int, y: Int) = x + y```

> valor_condicional_ternario:
```var expressao = if (10 < 5 ) "respostaOk" else "respostaAlternativa"```

> valorFuturo_Funcao:
```
// funcao de bloco tem que explicitar valor de retorno
fun digaOi (): String {
  return "au au"
}
```
> construcao_da_classe
- bloco init : é executado na construcao da classe , captura os params e campos da classe.
- fazer_params_virar_propriedades_e_ter_acesso: insira a keyword de acesso aos params : var : para mutavel, val : para imutavel
- atributos: para se tornar uma prop da classe tem que inserir a keyword var<mutavel permite escrita> ou val< imutavel, somente leitura>, obs: senão quer permitir acesso fora da classe insira a visibilidade private


> getter e setters
```
// modo opcional estilo kotlin : obs: posso fazer no meu jeito tbm tradicional, dando ao atributo a funcao setCriada que recebe o param do construtor.
// 1º declara a referencia do metodo, abaixo identado nela 2º funcao sem keyword para set ou get .

// exemplo 1
 val completeName: String
    get() = if (texto1.length < 2) "nao pode menor que 2" else "$texto1 $texto2"

// exemplo2
var disponivelNumero: Int = 0
  set(value) {
     val avaliado = if (value < 2) 0 else value
    field = avaliado
  }
```

convencao:
nome_do_arquivo: nome do arquivo igual nome_da_classe, estilo: PascalCase

