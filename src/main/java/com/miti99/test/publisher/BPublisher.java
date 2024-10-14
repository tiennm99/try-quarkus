package com.miti99.test.publisher;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.B;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/B")
public class BPublisher {

  @Inject Event<GenericEvent<B>> eventPublisher;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    GenericEvent<B> event = new GenericEvent<>(new B());
    eventPublisher.fire(event);
    return "fired B event";
  }
}
