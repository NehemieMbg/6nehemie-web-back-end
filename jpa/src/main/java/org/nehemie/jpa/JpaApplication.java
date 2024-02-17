package org.nehemie.jpa;

import org.nehemie.jpa.models.Video;
import org.nehemie.jpa.repositories.AuthorRepository;
import org.nehemie.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

//    @Bean
    public CommandLineRunner commandLineRunner(
        AuthorRepository repository,
        VideoRepository videoRepository
    ) {
        return args -> {
//            var author = Author.builder()
//                    .firstName("Nehemie")
//                    .lastName("James")
//                    .age(25)
//                    .email("contact@gmail.com")
//                    .build();
//            repository.save(author);
            
            var video = Video.builder()
                    .name("abc")
                    .length(5)
                    .build();
            videoRepository.save(video);
        };
    }
}
