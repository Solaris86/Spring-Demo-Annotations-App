package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
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
	
	@Override
	public String getFortune() {
		String[] fortunes = new String[] { fortuneOne, fortuneTwo, fortuneThree, fortuneFour, fortuneFive };
		Random random = new Random();
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
