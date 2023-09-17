# FERRAMENTAS PARA MODERNAS IMPLEMENTACOES KOTLIN

> metodo_estatico_no_kotlin:
conceito: kotlin nao tem metodotaticos, entao quando queremos uma funcao a nivel de objeto sem instanciar a classe :: usamos a keyword compania de objeto  companion object { funcao }, e dentro deste bloco do compania d eobjeto dizemos que sera uma funcao e declaramos-a la dentro. assim no uso podemos chamar a classe e a funcao como se faz nos estaticos de outras linguagens sem instanciar a classe.
tutorial: https://pt.stackoverflow.com/questions/227375/como-criar-um-m%C3%A9todo-est%C3%A1tico-usando-kotlin
exemplo:
```
class NomeClasse {
    companion object {
        fun nomeMETODO(): String { ... }
    }
}
// usar :
NomeClasse.nomeMETODO()
```

---
