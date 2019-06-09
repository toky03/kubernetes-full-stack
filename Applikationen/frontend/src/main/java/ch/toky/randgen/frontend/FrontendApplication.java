package ch.toky.randgen.frontend;

import ch.toky.randgen.frontend.model.PodStat;
import ch.toky.randgen.frontend.model.RandomNumber;
import ch.toky.randgen.frontend.model.Series;
import ch.toky.randgen.frontend.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Autowired
	private RestService restService;

	@GetMapping("/statistics")
	public List<PodStat> getStatistics(){
		return restService.getStatistics();
	}

	@GetMapping("/randomNumber")
	public RandomNumber getRandomNumber(){
		return restService.getRandomNumber();
	}

	@GetMapping("/history")
	public List<Series> getHistory(){
		return restService.getHistory();
	}



}
