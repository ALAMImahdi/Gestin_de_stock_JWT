package ma.Multisac.Gestin_de_stock.Repository;

import ma.Multisac.Gestin_de_stock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepos extends JpaRepository<Client,Integer> {
    List<Client>findAll();
    Client findById(int id);
    Client save(Client client);
    void delete(Client client);
}
