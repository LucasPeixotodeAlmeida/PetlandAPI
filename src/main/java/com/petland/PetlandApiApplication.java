package com.petland;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.petland.model.cadastro.entities.CadastroEntity;
import com.petland.model.cadastro.entities.Endereco;
import com.petland.model.cadastro.entities.Perfil;
import com.petland.model.cadastro.repository.CadastroRepository;

@SpringBootApplication
public class PetlandApiApplication implements CommandLineRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    public static void main(String[] args) {
        SpringApplication.run(PetlandApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CadastroEntity pessoa = new CadastroEntity();
        pessoa.setNome("maria");

		Perfil perfil = new Perfil();
		perfil.setCliente(true);

		pessoa.setPerfil(perfil);

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua 1");
		endereco.setNumero("123");

		pessoa.setEndereco(endereco);
        cadastroRepository.save(pessoa);
    }
}
