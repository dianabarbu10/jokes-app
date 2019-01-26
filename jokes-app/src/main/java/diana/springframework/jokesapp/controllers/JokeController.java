package diana.springframework.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import diana.springframework.jokesapp.services.QuoteGenerator;

@Controller
public class JokeController {

	@Autowired
	private QuoteGenerator quoteGenerator;

	@RequestMapping("/chuckNorrisJoke")
	public String getJoke(Model model) {
		model.addAttribute("joke", quoteGenerator.sayJoke());
		return "jokes";
	}
}
