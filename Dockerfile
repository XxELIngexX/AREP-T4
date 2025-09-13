FROM openjdk:8

WORKDIR /usrapp/bin

ENV PORT=8082

COPY /target/classes /usrapp/bin/target/classes
##COPY /target/dependency /usrapp/bin/dependency

CMD ["java","-cp","./target/classes","edu.eci.arep.Main","edu.eci.arep.examples.HelloController,edu.eci.arep.examples.GreetingController,edu.eci.arep.examples.ProductController"]
