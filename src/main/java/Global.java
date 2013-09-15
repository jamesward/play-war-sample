import play.GlobalSettings;
import play.Play;
import play.api.mvc.Handler;
import play.mvc.Http;

public class Global extends GlobalSettings {

    @Override
    public Handler onRouteRequest(Http.RequestHeader requestHeader) {
        return Play.application().plugin(org.pk11.jaxrs.RouterPlugin.class).handlerFor(this, requestHeader);
    }

}
