package org.redvelvet.seulgi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.redvelvet.seulgi.domain.movie.repository",
                "org.redvelvet.seulgi.reservation",
                "org.redvelvet.seulgi.config"})
public class AppConfig {
}
