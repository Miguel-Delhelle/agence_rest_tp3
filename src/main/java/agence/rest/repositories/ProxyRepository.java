package agence.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import agence.client.proxy.AProxy;

public interface ProxyRepository extends JpaRepository<AProxy, Long>{

}
