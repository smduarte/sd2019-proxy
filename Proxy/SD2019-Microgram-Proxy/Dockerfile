FROM smduarte/java

MAINTAINER Sérgio Duarte <smd@fct.unl.pt>

WORKDIR /home/sd

COPY target/lib/*.jar /home/sd/ 

COPY target/*.jar /home/sd/

ENV CLASSPATH /home/sd/*

CMD java microgram.impl.proxy.MicrogramProxyServer