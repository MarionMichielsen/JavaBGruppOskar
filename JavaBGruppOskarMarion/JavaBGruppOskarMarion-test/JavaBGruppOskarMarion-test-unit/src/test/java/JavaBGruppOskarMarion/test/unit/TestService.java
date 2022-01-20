package JavaBGruppOskarMarion.test.unit;

import JavaBGruppOskarMarion.service.ForestService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:JavaBGruppOskarMarion-service.xml");

    private ForestService forestService;

    @Before
    public void before(){
        applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){
        ForestService service = (ForestService)  applicationContext.getBean("forestService");
        Owl owl = forestService.createOwl("Uil", 95, 188);

    }




}
