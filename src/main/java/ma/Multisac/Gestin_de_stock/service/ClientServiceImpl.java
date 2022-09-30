package ma.Multisac.Gestin_de_stock.service;

import ma.Multisac.Gestin_de_stock.Repository.ClientRepos;
import ma.Multisac.Gestin_de_stock.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {
   @Autowired
   private ClientRepos clientRepos;
    @Override
    public List<Client> list() {
        return clientRepos.findAll();
    }

    @Override
    public Client listId(int id) {
        return clientRepos.findById(id);
    }

    @Override
    public Client add(Client client) {
        return clientRepos.save(client);
    }

    @Override
    public Client edit(Client client) {
        return clientRepos.save(client);
    }

    @Override
    public Client delete(int id) {
        Client client=clientRepos.findById(id);
        if(client!=null){
            clientRepos.delete(client);
        }
        return client;
    }
}
