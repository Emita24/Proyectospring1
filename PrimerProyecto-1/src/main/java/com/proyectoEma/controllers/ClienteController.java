package com.proyectoEma.controllers;



import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoEma.dao.ClienteDao;
import com.proyectoEma.models.Cliente;


@RestController
public class ClienteController {
	
	@Autowired
	private ClienteDao clienteDao;
	
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "Hola mundo";
	}
	
    @RequestMapping(value="Clientes1")
	public List<String> listarClientes(){
		return List.of("Diego","Juan","Jose");
	}
    
    @RequestMapping(value="Clientes2")
    public Cliente listarClientes1() {
    	
    	Cliente cliente=new Cliente();
    	cliente.setNombre("Diego");
    	cliente.setApellido("Maradona");
    	cliente.setDNI("10101010");
    	cliente.setTelefono("2613410113");
    	cliente.setDireccion(" Alberto J. Armando 10");
    	
    	
    	return cliente;
    }
    
    @RequestMapping(value="Clientes3/{id}")
    public Cliente getCliente(@PathVariable Long id) {
    	
    	Cliente cliente=new Cliente();
    	cliente.setId(id);
    	cliente.setNombre("Diego");
    	cliente.setApellido("Maradona");
    	cliente.setDNI("10101010");
    	cliente.setTelefono("2613410113");
    	cliente.setDireccion("Alberto J. Armando 10");
    	
    	
    	return cliente;
    }
    
    @RequestMapping(value="Cliente/lista_user")
    public List<Cliente> listar_variosClientes() {
    	
    	List<Cliente> cliente=new ArrayList<>();
    
    	Cliente cliente1=new Cliente();
    	cliente1.setId(1L);
    	cliente1.setNombre("Diego");
    	cliente1.setApellido("Maradona");
    	cliente1.setDNI("1010101010");
    	cliente1.setTelefono("2613410113");
    	cliente1.setDireccion("Alberto J. Armando 10");
    	
    	Cliente cliente2=new Cliente();
    	cliente2.setId(2L);
    	cliente2.setNombre("Coco");
    	cliente2.setApellido("Basile");
    	cliente2.setDNI("1010101010");
    	cliente2.setTelefono("2613410113");
    	cliente2.setDireccion("Alfio calle");
    	
    	Cliente cliente3=new Cliente();
    	cliente3.setId(3L);
    	cliente3.setNombre("Coco");
    	cliente3.setApellido("Basile");
    	cliente3.setDNI("1010101010");
    	cliente3.setTelefono("2613410113");
    	cliente3.setDireccion("Alfio calle");
    	
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
    	
    	return cliente;
    }
    
    @RequestMapping(value="api/clientes")
    public List<Cliente> getCliente(){
    	
    	List<Cliente> cliente=clienteDao.obtenerClientes();
    	
    	return cliente;
    }
}
