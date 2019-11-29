package com.briup.cms;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @Test
    public void test1(){
        String ss = "";
        String ss1 = null;
        String ss2 = " ";
       /** System.out.println(StringUtils.isEmpty(ss));
        System.out.println(StringUtils.isEmpty(ss1));
        System.out.println(StringUtils.isEmpty(ss2));*/
        System.out.println(StringUtils.isBlank(ss));
        System.out.println(StringUtils.isBlank(ss1));
        System.out.println(StringUtils.isBlank(ss2));
    }

}
