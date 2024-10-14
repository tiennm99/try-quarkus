package com.miti99.test.publisher;

import com.miti99.test.event.SimpleEvent;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Simple")
public class SimplePublisher {

  @Inject Event<SimpleEvent> eventPublisher;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    SimpleEvent event = new SimpleEvent();
    eventPublisher.fire(event);
    return "fired simple event";
  }
}
