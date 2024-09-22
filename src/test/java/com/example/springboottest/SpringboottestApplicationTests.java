package com.example.springboottest;

import com.example.springboottest.article.ArticleRepository;
import com.example.springboottest.article.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringboottestApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private ArticleService articleService;

	@Transactional
	@Test
	void contextLoads() {
		for(int i = 1; i <= 2; i++) {
			String title = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.articleService.create(title, content);
		}
	}

}
