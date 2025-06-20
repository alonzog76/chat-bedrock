package com.argento.chat_bedrock;

import com.argento.chat_bedrock.service.ChatService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ChatBedrockApplicationTests {


	@Autowired
	ChatService chatService;

	@Test
	void contextLoads() {
		String answer = chatService.answerQuestion("who is bigfoot? give me a very short answer");

		log.info(answer);


	}

}
