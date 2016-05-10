package org.cloudfoundry.samples.music;

import org.cloudfoundry.samples.music.config.data.LocalJpaRepositoryConfig;
import org.cloudfoundry.samples.music.domain.AlbumRepository;
import org.cloudfoundry.samples.music.web.controllers.AlbumController;
import org.cloudfoundry.samples.music.config.data.SpringApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
//@ComponentScan("org.cloudfoundry.samples.music")
@EnableJpaRepositories("org.cloudfoundry.samples.music.repositories")
@EntityScan("org.cloudfoundry.samples.music.domain")
@ComponentScan(basePackageClasses = {AlbumController.class, SpringApplicationContextInitializer.class, AlbumRepository.class, LocalJpaRepositoryConfig.class})
public class Application {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addInitializers(new SpringApplicationContextInitializer());
        application.run(args);

//        SpringApplication.run(Application.class, args);
    }

}
