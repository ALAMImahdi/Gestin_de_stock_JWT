package ma.Multisac.Gestin_de_stock.service;

import ma.Multisac.Gestin_de_stock.model.Client;

import java.util.List;

public interface IClientService {
    List<Client>list();
    Client listId(int id);
    Client add(Client client);
    Client edit(Client client);
    Client delete(int id);
}
