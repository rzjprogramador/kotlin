package a_classe

import value_object.Nome
import value_object.TextNomeClass

class AClasse(paramSet1: String, argtextSet2: String) {
    private var textoSet1: String = Nome.perform(paramSet1)
    private var textoSet2: String = TextNomeClass.perform(argtextSet2)

    private val computTexto1Texto2 = "$paramSet1 $argtextSet2"

    fun status () {
        println("textoSet1 : $textoSet1")
        println("textoSet2 : $textoSet2")
        println("comput_Texto1Texto2 : $computTexto1Texto2")
    }
}
fun main () {
    val aclasse = AClasse("vcc","s" )
//        println(aclasse)

    aclasse.status()
}