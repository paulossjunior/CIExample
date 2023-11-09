package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.model.Pessoa;
import static org.junit.Assert.assertEquals;

public class CadastroPessoaSteps {
    private Pessoa pessoa;

    @Given("uma pessoa com {string} e {string}")
    public void umaPessoaComNomeECPF(String nome, String cpf) {

        pessoa = new Pessoa(nome, cpf);
    }

    @When("a pessoa é cadastrada")
    public void aPessoaECadastrada() {
        System.out.println ("oi");
    }

    @Then("o cadastro é bem-sucedido")
    public void oCadastroEBemSucedido() {
        System.out.println ("oi");
    }

    @Then("as informações da pessoa são exibidas corretamente")
    public void asInformacoesDaPessoaSaoExibidasCorretamente() {
        assertEquals("João Silva", pessoa.getNome());
        assertEquals("123.456.789-09", pessoa.getCpf());
    }
}
