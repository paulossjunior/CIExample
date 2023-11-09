Feature: Cadastro de Pessoa

  Scenario Outline: Cadastrar uma pessoa com sucesso
    Given uma pessoa com <nome> e <CPF>
    When a pessoa é cadastrada
    Then o cadastro é bem-sucedido
    And as informações da pessoa são exibidas corretamente
  Examples:
    |nome        | CPF            |
    |"João Silva"|"123.456.789-09"|