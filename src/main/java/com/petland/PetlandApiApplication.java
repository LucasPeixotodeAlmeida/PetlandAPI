package com.petland;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.petland.model.animal.entities.AnimalEntity;
import com.petland.model.animal.enums.AnimalEspecie;
import com.petland.model.animal.repository.AnimalRepository;
import com.petland.model.cadastro.entities.CadastroEntity;
import com.petland.model.cadastro.entities.Endereco;
import com.petland.model.cadastro.entities.Perfil;
import com.petland.model.cadastro.repository.CadastroRepository;
import com.petland.model.produtoServico.entities.ProdutoServicoEntity;
import com.petland.model.produtoServico.repository.ProdutoServicoRepository;

@SpringBootApplication
public class PetlandApiApplication implements CommandLineRunner {

    @Autowired
    private ProdutoServicoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(PetlandApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		ProdutoServicoEntity servico = new ProdutoServicoEntity();
		servico.setNome("tosa");
		servico.setServico(true);
		servico.setValor(50.0);

		repository.save(servico);
    }
}
