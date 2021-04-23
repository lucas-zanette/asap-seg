package com.seguros.asap.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seguros.asap.entity.Apolice;
import com.seguros.asap.entity.Cliente;

/**
 *
 * @author lucas
 */
@RestController
public class IndexController {
    
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index(){
        return "Ola eu kkkk sou a tela inicial da API";
    }
//    @RequestMapping(value="/nome/{nome}", method = RequestMethod.GET)
//    public String index(@PathVariable String nome){
//        return "Ola" + nome + "  eu sou a tela inicial da API";
//    }
//    @RequestMapping(value="/consultaApolice", method = RequestMethod.POST)
//    public Apolice index(@RequestBody Apolice apolice){
//        return apolice;
//    }
//    @RequestMapping(value="/cliente", method = RequestMethod.PUT)
//    public Cliente indexPut(@RequestBody Cliente cliente){
//        return cliente;
//    }
}
