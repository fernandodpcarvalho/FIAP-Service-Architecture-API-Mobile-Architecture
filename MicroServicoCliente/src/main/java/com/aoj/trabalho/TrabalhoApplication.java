package com.aoj.trabalho;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Chamado;
import com.aoj.trabalho.model.Cliente;
import com.aoj.trabalho.repository.ClienteRepository;

import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
@RequestMapping(value="microServicoCliente")
public class TrabalhoApplication {
	
	@Autowired
    private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);
	}
	
	@RequestMapping(value="ListarClientes", method = RequestMethod.GET)
	public List<Cliente> ListarProdutos() {		
		return clienteRepository.findAll();
	}
	
	
	@RequestMapping(value="BuscarCliente/{emailCliente}", method = RequestMethod.GET)
	public Cliente BuscarCliente(@PathVariable("emailCliente") String emailCliente) {
		return clienteRepository.findByEmail(emailCliente);
	}
	
	
    @RequestMapping(value="AdicionarListaDesejos/{idCliente}/{idProduto}", method = RequestMethod.GET) 
    public String AdicionarListaDesejos(@PathVariable("idCliente") String idCliente, @PathVariable("idProduto") String idProduto) {
	  Cliente c = clienteRepository.findById(Integer.parseInt(idCliente));
	  
	  if(c != null) {
		  c.getListaDesejos().add(Integer.parseInt(idProduto));
		  clienteRepository.save(c);
		  return "Adicionado";
	  }
	  
	  return "Erro: Não foi adicionado.";
    }  
	  
	 
	@RequestMapping(value="AbrirChamado/{idCliente}/{descricaoProblema}", method = RequestMethod.GET) 
	public String AbrirChamado(@PathVariable("idCliente") String idCliente, @PathVariable("descricaoProblema") String descricaoProblema) {
		Cliente c = clienteRepository.findById(Integer.parseInt(idCliente));
		  
		  if(c != null) {
			  
			  Chamado ch = new Chamado();
			  ch.setCliente(c.getId());
			  ch.setDescricao(descricaoProblema);
			  ch.setStatus("Enviado - Aguardando análise");
			  
			  c.getListaChamados().add(ch);
			  clienteRepository.save(c);
			  
			  return "Adicionado";
		  }
		  
		  return "Erro: Não foi adicionado.";
	} 

}
