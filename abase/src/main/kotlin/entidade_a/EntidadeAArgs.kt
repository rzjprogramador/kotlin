package entidade_a

import value_object.NomeEntidades

class EntidadeAArgs (
    n: String,
    s: String
) {
    val nome = NomeEntidades.perform(n)
    val sobrenome = NomeEntidades.perform(s)
}