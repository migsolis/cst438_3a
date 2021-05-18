package cst438hw3a;

import org.springframework.amqp.core.FanoutExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigPublisher {
	@Bean
	public FanoutExchange fanout() {
		return new FanoutExchange(&quot;city-reservation&quot;);
		}
	}
