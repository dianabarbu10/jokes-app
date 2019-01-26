package diana.springframework.jokesapp.config;

import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
