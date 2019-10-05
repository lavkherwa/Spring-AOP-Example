# Spring-AOP

Sample application for spring AOP driven with custom annotations

Any method annotated with the provided annotation will be considered for pointCut ;)

## Logging Aspect (custom annotation based)
Custom annotation [Link](SpringAOPSample/src/main/java/com/example/aop/annotations/Loggable.java) <br>
Aspects implementation [Link](SpringAOPSample/src/main/java/com/example/aop/aspects/LoggingAspect.java)

How to define pointCut for custom annotation [Link](SpringAOPSample/src/main/java/com/example/aop/aspects/LoggingAspect.java#L21)

## Service Aspect (called on all methods of given service)
Aspect implementation [Link](SpringAOPSample/src/main/java/com/example/aop/aspects/ServiceAspect.java)

How to define pointCut for all methods in given class [Link](SpringAOPSample/src/main/java/com/example/aop/aspects/ServiceAspect.java#L18)

## Handling Events for logging Aspect
Event Defination for LoggingEvent [Link](SpringAOPSample/src/main/java/com/example/aop/events/LoggingEvent.java) <br>
Event Listener for LoggingEvent [Link](SpringAOPSample/src/main/java/com/example/aop/events/LoggingEventListener.java) <br>
Firing LoggingEvent from Aspect [Link](SpringAOPSample/src/main/java/com/example/aop/aspects/LoggingAspect.java#L48)
