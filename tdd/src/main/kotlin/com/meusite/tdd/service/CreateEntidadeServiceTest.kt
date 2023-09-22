package com.meusite.tdd.service
import static org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.Test

class CreateEntidadeServiceTest {

  @Test
  fun should_be_create_new_entidade(): Unit {


  var entidade = Entidade()
  entidade.setNome = "reinaldo"
  entidade.setSobrenome = "zachars"


  val createEntidadeService = CreateEntidadeService()
  var createdEntidade = EntcreateEntidadeService.execute(entidade)

  assertNotNull(createdEntidade.getID()) // espero que o id da instancia nao seja nulo

  }

}

/*
1. criar nova entidade ..pra isto precisa
2. 1. criar um novo service -- comeceAqui
3. pra salvar no BD , precisa criar a tabela da entidade e a (entidade ORM) , tendo isto precisa
4. criar reposiorio, que vai ser o intermediario que irá fazer as acoes no BD

-- ORDEM LOGICA
// OL2 3. pra salvar no BD , precisa criar a tabela da entidade e a (entidade ORM) , tendo isto precisa
    // campos: ID, nome, sobrenome

  // 1. criar nova entidade ..pra isto precisa


  // OL1 - 2. 1. criar um novo service --para criar o servico precisa ter um input de nova entidade, comeceAqui

  // 4. criar reposiorio, que vai ser o intermediario que irá fazer as acoes no BD

  // tests : ASSERCOES

*/