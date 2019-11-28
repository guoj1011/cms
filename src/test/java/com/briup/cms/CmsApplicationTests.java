package com.briup.cms;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmsApplicationTests {
    @Autowired
    private IArticleService articleService;
    @Test
    public void contextLoads() {
        Article article = articleService.findById(3);
         int id = article.getCategory().getId();
        String name = article.getCategory().getName();
        System.out.println(id + ":"  + name);
    }

}
