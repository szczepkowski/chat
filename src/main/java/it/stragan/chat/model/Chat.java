package it.stragan.chat.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@DynamoDBTable(tableName = "chat")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class Chat {

    @Id
    private ChatId chatId;
    private String userId;
    private String text;

    @DynamoDBHashKey(attributeName = "id")
    public String getId() {
        return chatId != null ? chatId.getId() : null;
    }

    public void setId(String musicCode) {
        if (chatId == null) {
            chatId = new ChatId();
        }
        chatId.setId(musicCode);
    }

    @DynamoDBRangeKey(attributeName = "created")
    public String getCreated() {
        return chatId != null ? chatId.getCreated() : null;
    }

    public void setCreated(String releaseDateTime) {
        if (chatId == null) {
            chatId = new ChatId();
        }
        chatId.setCreated(releaseDateTime);
    }

    @DynamoDBAttribute
    public String getUserId() {
        return userId;
    }

    @DynamoDBAttribute
    public String getText() {
        return text;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setText(String text) {
        this.text = text;
    }
}
