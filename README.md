# Eureka  
   Sample project to demonstrate Eureka server, client and Feign Client

Project has three parts.  
1. Server ===> This is the Eureka server. Which does all the discovery magic.
2. Client ===> One of the clients, which gets registered with Eureka server
3. Feign  ===> A Client project which uses Eureka's discovery capabilities to call client application

_Usage_  

Start all three projects in the order mentioned above.
1. Reach http://localhost:8060 in browser to see Eureka Dashboard, you can see the other two services registered.  
2. Call http://localhost:8070/greeting. This calls the feign service which calls client service.