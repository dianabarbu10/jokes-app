package diana.springframework.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteGeneratorImpl implements QuoteGenerator {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public QuoteGeneratorImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	@Override
	public String sayJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
