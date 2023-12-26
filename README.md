
## Section 1: Intro

## Section 2: Clean and Hexagonal Architecture

## Section 3: DDD

## Section 4: Apache Kafka

* KafkaTemplate is a spring component that wraps a Kafka Producer and provides method to easily produce data on kafka.
* To create a Kafka Consumer with spring, using a KafkaListener annotation on a simple method is enough.
* If my kafka topic has n partitions, I cannot use more than n threads to consume the data on topics.
* Kafka Consumer has a max poll records property that limits the number of records returned for a single poll.

http://localhost:9000/clusters/food-ordering-system/brokers 