package test

import io.vertx.codegen.annotations.ProxyGen
import io.vertx.codegen.annotations.VertxGen
import io.vertx.core.json.JsonObject
import java.time.Instant
import java.util.concurrent.Future

@ProxyGen
@VertxGen
interface LiveViewService {
    fun doThing(instant: Instant): Future<JsonObject>
}
