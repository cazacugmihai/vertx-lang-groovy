package transform;

for (io.vertx.groovy.core.Vertx vertx_ = vertx;vertx_ != null;vertx_ = null) {
  vertx_.eventBus().send("the-address", true)
}
