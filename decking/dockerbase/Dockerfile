FROM lgsd/diamond
MAINTAINER thomas

ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
ENV PATH $PATH:$JAVA_HOME/bin

ADD java-se-8u40-ri-compact1 $JAVA_HOME/

ADD lib/ld-linux.so.2 /lib/
ADD lib32 /lib/
RUN chmod +x /lib/*

ADD cacerts ${JAVA_HOME}/lib/security/

ADD client.jar client.jar

ENTRYPOINT ["java","-jar","client.jar"]
