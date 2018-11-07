package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	private String[] fortunes;
	
	@Value("${randomFortune.one}")
	private String fortuneOne;
	
	@Value("${randomFortune.two}")
	private String fortuneTwo;
	
	@Value("${randomFortune.three}")
	private String fortuneThree;
	
	@Value("${randomFortune.four}")
	private String fortuneFour;
	
	@Value("${randomFortune.five}")
	private String fortuneFive;
	
	@PostConstruct
	public void loadData() {
		fortunes = new String[] { fortuneOne, fortuneTwo, fortuneThree, fortuneFour, fortuneFive };
	}
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
