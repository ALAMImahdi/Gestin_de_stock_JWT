package ma.Multisac.Gestin_de_stock.controller;

import ma.Multisac.Gestin_de_stock.model.Client;
import ma.Multisac.Gestin_de_stock.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/clients")
public class ClientController {
    @Autowired
    IClientService service;
    @GetMapping("/all")
    public List<Client>list(){
        return service.list();
    }
    @PostMapping("/create")
    public Client ajouter(@RequestBody Client client){
        return service.add(client);
    }
    @GetMapping("/{id}")
    public Client listId(@PathVariable("id") int id){
        return service.listId(id);
    }
    @PutMapping("/create/{id}")
    public Client update(@RequestBody Client client,@PathVariable("id") int id){
        client.setId(id);
        return service.edit(client);
    }
    @DeleteMapping("/delete/{id}")
    public  Client delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
