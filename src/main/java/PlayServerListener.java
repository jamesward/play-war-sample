import play.api.Mode;
import play.core.StaticApplication;
import play.core.server.NettyServer;
import scala.Option;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.File;

@WebListener
public class PlayServerListener implements ServletContextListener {
    
    private NettyServer nettyServer;
    
    public void contextInitialized(ServletContextEvent sce) {
        nettyServer = new NettyServer(new StaticApplication(new File(".")), 9000, Option.apply(null), "0.0.0.0", Mode.Prod());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        nettyServer.stop();
    }
    
}