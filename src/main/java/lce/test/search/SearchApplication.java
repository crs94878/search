package lce.test.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder appBuilder = new SpringApplicationBuilder(SearchApplication.class);
        appBuilder.headless(false);
        ApplicationContext context = appBuilder.run(args);
        SearchWord searchWord = (SearchWord)context.getBean(SearchWord.class);
        searchWord.search();
    }

}
