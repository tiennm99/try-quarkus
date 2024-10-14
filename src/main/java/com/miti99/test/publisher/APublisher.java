package com.miti99.test.publisher;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.A;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/A")
public class APublisher {

  @Inject Event<GenericEvent<A>> eventPublisher;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    GenericEvent<A> event = new GenericEvent<>(new A());
    eventPublisher.fire(event);
    return "fired A event";
  }
}
