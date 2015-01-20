import com.journaldev.java.dependencyinjection.consumer.IConsumer;
import com.journaldev.java.dependencyinjection.consumer.MyDIApplication;
import com.journaldev.java.dependencyinjection.injector.IMessageServiceInjector;
import com.journaldev.java.dependencyinjection.service.IMessageService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJUnitTest {

    private IMessageServiceInjector injector;

    @Before
    public void setUp(){
        //mock the injector with anonymous class
        injector = new IMessageServiceInjector() {

            @Override
            public IConsumer getConsumer() {
                //mock the message service
                return new MyDIApplication(new IMessageService() {

                    @Override
                    public void sendMessage(String msg, String rec) {
                        System.out.println("Mock Message Service implementation");

                    }
                });
            }
        };
    }

    @Test
    public void test() {
        IConsumer IConsumer = injector.getConsumer();
        IConsumer.processMessages("Hi Odyssey", "odyssey@abc.com");
    }

    @After
    public void tear(){
        injector = null;
    }

}