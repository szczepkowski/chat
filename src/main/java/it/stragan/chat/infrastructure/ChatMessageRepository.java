
package it.stragan.chat.infrastructure;

import it.stragan.chat.model.Chat;
import it.stragan.chat.model.ChatId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
@Repository
public interface ChatMessageRepository extends CrudRepository<Chat, ChatId> {

    List<Chat> findById(String id);
}
