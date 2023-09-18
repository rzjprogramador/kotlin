package value_object

class NomeEntidades () {

    companion object {
        fun perform(v: String): String {
            if(v.length < 2) {
                return "ops.. você enviou quantidade errada de letras não pode menor que 2"
            }
            return v
        }
    }

}