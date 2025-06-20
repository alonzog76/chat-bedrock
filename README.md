# 🤖 Spring Boot Chat Client with Spring AI & Amazon Bedrock

This repository contains a simple Spring Boot application implementing a chat client powered by [Spring AI](https://docs.spring.io/spring-ai/reference/) and [Amazon Bedrock](https://aws.amazon.com/bedrock/). It demonstrates how to integrate generative AI capabilities into your Spring Boot apps using modern AI model APIs hosted on AWS.

## 💡 Features

- Spring Boot 3.x application
- Spring AI integration with Amazon Bedrock
- Chat interface via REST API (e.g., `/questions`)
- Easily pluggable with different foundation models on Bedrock (Anthropic Claude, Meta LLaMA, etc.)


## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.9+
- AWS credentials with Bedrock access
- Amazon Bedrock enabled in your region (e.g., `us-east-1`)

### Clone the Repository

```bash
git clone https://github.com/your-username/spring-ai-bedrock-chat.git
cd spring-ai-bedrock-chat
