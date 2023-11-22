package it.stragan.chat.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Builder;

@DynamoDBTable(tableName = "ChatMessage")
@AllArgsConstructor
@Builder
public class ChatMessage {

    private final String id;
    private final String userId;
    private final String channelId;
    private final String text;

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    @DynamoDBAttribute
    public String getUserId() {
        return userId;
    }

    @DynamoDBAttribute
    public String getText() {
        return text;
    }

    @DynamoDBAttribute
    public String getChannelId() {
        return channelId;
    }


}