
package it.stragan.chat.infrastructure;

import it.stragan.chat.model.ChatMessage;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableScan
@Repository
public interface ChatMessageRepository extends CrudRepository<ChatMessage, String> {

    Optional<ChatMessage> findById(String id);
}
