package entidade_a

class EntidadeAService(args: EntidadeAArgs) {
    private var argsA: EntidadeAArgs = args
    private val computTexto1Texto2 = "${args.nome} ${args.sobrenome}"

    fun status () {
        println(message = "nome : ${argsA.nome}")
        println(message = "sobrenome : ${argsA.sobrenome}")
        println("comput_Texto1Texto2 : $computTexto1Texto2")
    }
}
fun main () {
    val argsRequest = EntidadeAArgs("reinaldo", "zachars")
    val aclasse = EntidadeAService(argsRequest)

    aclasse.status()
}