# gae-springboot-demo

<https://dzone.com/articles/gcp-a-spring-boot-guide-for-the-busy-dev>

1. - Create project using command 
`curl https://start.spring.io/starter.zip -d dependencies=web -o gae-springboot-demo.zip`

2. - Create file src/main/appengine/app.yaml

3. - Create file src/main/webapp/WEB-INF/appengine-web.xml

4. - Create ServletInitializer.java class. Mandatory in order to run a SpringBoot application from a traditional war deployment

5. - Edit pom.xml

# maven archetypes

<https://cloud.google.com/appengine/docs/standard/java/tools/maven>

`mvn archetype:generate -Dappengine-version=1.9.71 -Djava8=true -DCloudSDK_Tooling=false -Dapplication-id=gae-nospring -Dfilter=com.google.appengine.archetypes:`

