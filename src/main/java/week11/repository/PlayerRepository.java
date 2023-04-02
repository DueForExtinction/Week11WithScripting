/**
 * 
 */
package week11.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import week11.bean.Player;
/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Apr 2, 2023
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

}
