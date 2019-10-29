package com.aoj.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aoj.trabalho.model.Chamado;
import com.aoj.trabalho.model.Cliente;
import com.aoj.trabalho.repository.ClienteRepository;

@RestController
@RefreshScope
@RequestMapping(value="cliente")
public class ClienteController {

	@Autowired
    private ClienteRepository clienteRepository;
	
	@RequestMapping(value="listarClientes", method = RequestMethod.GET)
	public List<Cliente> ListarClientes() {		
		return clienteRepository.findAll();
	}
	
	
	@RequestMapping(value="buscarCliente/{emailCliente}", method = RequestMethod.GET)
	public Cliente BuscarCliente(@PathVariable("emailCliente") String emailCliente) {
		return clienteRepository.findByEmail(emailCliente);
	}

	@PostMapping
	public Cliente CadastrarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@PutMapping
	public Cliente AtualizarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping(value="removerliente/{clienteId}")
	public Boolean RemoverCliente(@PathVariable("clienteId") int clienteId) {
		return clienteRepository.deleteById(clienteId);
	}
	
    @RequestMapping(value="adicionarListaDesejos/{idCliente}/{idProduto}", method = RequestMethod.GET) 
    public String AdicionarListaDesejos(@PathVariable("idCliente") String idCliente, @PathVariable("idProduto") String idProduto) {
	  Cliente c = clienteRepository.findById(Integer.parseInt(idCliente));
	  
	  if(c != null) {
		  c.getListaDesejos().add(Integer.parseInt(idProduto));
		  clienteRepository.save(c);
		  return "Adicionado";
	  }
	  
	  return "Erro: Não foi adicionado.";
    }  
	  
	 
	@RequestMapping(value="abrirChamado/{idCliente}/{descricaoProblema}", method = RequestMethod.GET) 
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
