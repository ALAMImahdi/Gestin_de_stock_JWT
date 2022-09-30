package ma.Multisac.Gestin_de_stock.Repository;


import ma.Multisac.Gestin_de_stock.model.ERole;
import ma.Multisac.Gestin_de_stock.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
Optional<Role> findByName(ERole name);
}
