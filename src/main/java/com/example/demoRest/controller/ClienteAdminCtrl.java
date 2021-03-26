package com.example.demoRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demoRest.entity.ClienteAdmin;
import com.example.demoRest.repository.ClienteAdminRepo;
import com.example.demoRest.vo.ResponseVO;

@Controller // This means that this class is a Controller
@RequestMapping(path="/cliente")
public class ClienteAdminCtrl {

	@Autowired
	ClienteAdminRepo cliente;
	
	@PostMapping(path="/save") 
	  public @ResponseBody ResponseVO saveCliente (@RequestBody ClienteAdmin clienteNvo ) {
		System.out.println("Entró ::<"+clienteNvo);
		String msg ="";
	    ClienteAdmin res = cliente.save(clienteNvo);
	    if (res !=null){
	    	msg ="El cliente se registro correctamente";
	    }else {
	    	msg ="El cliente no se registro, consulte logs para detalle";
	    }
	    return new ResponseVO(1,msg);
	  }

	  @GetMapping(path="/getAll")
	  public @ResponseBody Iterable<ClienteAdmin> getAllUsers() {
	    return cliente.findAll();
	  }
}
