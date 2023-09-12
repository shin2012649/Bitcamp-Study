package bitcamp.myapp;

import java.io.File;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.util.UrlPathHelper;

@EnableTransactionManagement
@SpringBootApplication
public class App implements WebMvcConfigurer {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(App.class, args);
  }

    // @Bean
//    public MultipartResolver multipartResolver() {
//      return new StandardServletMultipartResolver();
//    }

    @Bean
    public ViewResolver viewResolver () {
      InternalResourceViewResolver vr = new InternalResourceViewResolver();
      vr.setViewClass(JstlView.class);
      vr.setPrefix("/WEB-INF/jsp/");
      vr.setSuffix(".jsp");
      return vr;
    }

//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//      System.out.println("AppConfig.configurationMatch() 활성화!");
//      UrlPathHelper pathHelper = new UrlPathHelper();
//
//      // @MatrixVariable 기능 활성화
//      pathHelper.setRemoveSemicolonContent(false);
//
//      // DispatcherServlet의 MVC Path 관련 설정을 변경한다.
//      configurer.setUrlPathHelper(pathHelper);
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//      System.out.println("AppConfig.addInterceptors() 호출됨!");
//
//    }
  }


