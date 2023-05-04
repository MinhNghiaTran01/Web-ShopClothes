FROM tomcat:latest
WORKDIR /usr/local/tomcat/webapps
COPY C:/Users/Admin/Documents/NetBeansProjects/Web-Clothes/dist/Web-Clothes.war .
EXPOSE 8080
ENV MYSQL_ROOT_PASSWORD=123
ENV MYSQL_DATABASE=myappdb
ENV MYSQL_USER=admin
ENV MYSQL_PASSWORD=123
RUN apt-get update && \
    apt-get install -y mysql-client && \
    rm -rf /var/lib/apt/lists/*
CMD ["catalina.sh", "run"]
