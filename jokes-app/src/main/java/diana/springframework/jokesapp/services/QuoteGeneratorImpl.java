package diana.springframework.jokesapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class QuoteGeneratorImpl implements QuoteGenerator {

	@Autowired
	private ChuckNorrisQuotes chuckNorrisQuotes;

	@Override
	public String sayJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
