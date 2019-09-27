package jar;

import jar.beans.LocationMOS;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locationMOS")
public interface LocationMOSResource {
  @GET
  @Produces("application/json")
  List<LocationMOS> generatedMethod1();
}
